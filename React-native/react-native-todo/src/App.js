import React, { useEffect, useState } from "react";
import styled, { ThemeProvider } from "styled-components/native";
import { theme } from "./Theme";
import { StatusBar, useWindowDimensions } from "react-native"
import Input from "./Component/Input";
import Task from "./Component/Task";
import { Dimensions } from 'react-native'
// import AsyncStorage from '@react-native-community/async-storage';
import AsyncStorage from "@react-native-async-storage/async-storage";
import  AppLoading from 'expo-app-loading';

const Container = styled.SafeAreaView`
  flex: 1;
  background-color: ${({ theme }) => theme.background};
  align-items: center;
  justify-content: flex-start;
`;
const Title = styled.Text`
font-size : 40px;
font-weight: 600;
color : ${({ theme }) => theme.main};
align-self : flex-start;
margin :  20px;
`;

const List = styled.ScrollView`
flex: 1;
width : ${({ width }) => width - 40}px;
`;


export default function App() {
    const width = Dimensions.get("window").width;

    const [isReady, setIsReady] = useState(false);
    const [newTask, setNewTask] = useState('');
    const [tasks, setTasks] = useState({});

    // 로컬에 저장.
    const _saveTasks = async (tasks) => {
        try {
            await AsyncStorage.setItem('tasks', JSON.stringify(tasks));
            setTasks(tasks);
        } catch (error) {
            console.log(error);
        }
    }

    const _loadTasks = async () => {

        const loadedTasks = await AsyncStorage.getItem('tasks');
        console.log("Loaded Tasks from AsyncStorage:", loadedTasks);
        setTasks(JSON.parse(loadedTasks || '{}'));
        ;
    }

    // useEffect(() => {
    //     _loadTasks(); // 컴포넌트가 마운트될 때 _loadTasks 호출
    // }, []);





    // 추가기능
    const _addTask = () => {
        const ID = Date.now().toString();
        const newTaskObject = {
            [ID]: { id: ID, text: newTask, completed: false },
        };
        setNewTask('');
        _saveTasks({ ...tasks, ...newTaskObject })
    };

    // 삭제기능
    const _deleteTask = id => {
        //상태 tasks를 복사하여 새로운 객체 currentTasks 를 생성
        const currentTasks = Object.assign({}, tasks); // Object.assign({}, tasks) 첫번째 인자에 두번쨰 인자의 객체속성을 얕은복사하는 메서드 .
        // currentTasks에서 특정 작업삭제 .
        delete currentTasks[id];
        // 업데이트된 객체를 설정 후 React컴포넌트에서 작업이 삭제된 상태를 반영 .
        _saveTasks(currentTasks);
    };

    // 완료기능 .
    const _toggleTask = id => {
        const currentTasks = Object.assign({}, tasks);

        currentTasks[id]['completed'] = !currentTasks[id]['completed'];
        _saveTasks(currentTasks);
    }

    // 수정기능
    const _updateTask = item => {
        const currentTasks = Object.assign({}, tasks);

        currentTasks[item.id] = item;
        _saveTasks(currentTasks);
    }

    // 입력취소 기능 .
    const _onBlur = () => {
        setNewTask('');
    }

    const _handleTextChange = text => {
        setNewTask(text);
    }



    return isReady ? (
        <ThemeProvider theme={theme}>
            <Container>
                <StatusBar
                    barStyle="light-content"
                    backgroundColor={theme.background}
                />
                <Title> TODO List </Title>
                <Input placeholder="+ Add a Task"
                    value={newTask}
                    onChangeText={_handleTextChange}
                    onSubmitEditing={_addTask}
                    onBlur={_onBlur}
                />
                <List width={width}>
                    {Object.values(tasks)
                        .reverse()
                        .map(item => (
                            <Task
                                key={item.id}
                                item={item}
                                deleteTask={_deleteTask}
                                toggleTask={_toggleTask}
                                updateTask={_updateTask}
                            />

                        ))}
                </List>
            </Container>
        </ThemeProvider>
    ) : (
        <AppLoading
            startAsync={_loadTasks}
            onFinish={() => setIsReady(true)}
            onError={console.error}
        />
    );
}