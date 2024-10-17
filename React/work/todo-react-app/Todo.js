import React, { useState } from "react";
import {
    ListItem,
    ListItemText,
    InputBase,
    Checkbox,
    ListItemSecondaryAction,
    IconButton,
} from "@mui/material";
import DeleteOutlined from "@mui/icons-material/DeleteOutlined"

//useState는 컴포넌트에 state 변수를 추가할 수 있는 React Hook입니다.
// 리액트에서 사용되는 Hook중 하나로 함수형 컴포넌트에서 상태변수를 사용할 수 있도록 해준다.
// 훅을 사용하면 리액트가 제공하는 기능과 상태변수를 사용할 수 있다 .

//함수 생성방법
/*  1. function 함수명(){

    }
    2. let 함수명 =function(){
    
    } 
    3. let 함수명 =() => {}
화살표 함수규칙
1. 매개변수 1개며면 소괄호 생략 가능
2. 명령이 한 줄 이면서 , return이 있다면 , 중괄호와 return 같이 생략 가능
*/

/* label 태그는 input에 붙히는 글을 적는다
    for 는 label을 붙힐 태그를 설정 / id값을 준다 .*/
// item : 상태를 추적 할 객체 (Object)
// setItem 상태를 업데이트할 객체 

const Todo = (props) => {
    const [item, setItem] = useState(props.item)
    // item이라는 상태변수

    const [readOnly, setReadOnly] = useState(true);

    // turnOffReadOnly함수
    // 내용쪽을 클릭했을 때 커서가 깜빡일수 있는 상태로 만들기
    const turnOffReadOnly = (e) => {
        setReadOnly(false)
    }

    //turnOnReadOnly 함수
    const turnOnReadOnly = (e) => {
        if (e.key === 'Enter') {
            setReadOnly(true);
        }
    }

    // const turnOffReadOnly = (e) => {
    //     setReadOnly(!(e.key==='Enter') ? false: true);
    // }





    const editItem = props.editItem
    const editEventHandler = (e) => {
        item.title = e.target.value;
        editItem();

    }



    const deleteItem = props.deleteItem;
    //deleteEventHandler 작성
    const deleteEventHandler = () => {
        //삭제하려고 하는 todo 전달 
        deleteItem(item);

    }

    //체크박스변경
    const checkboxEventHandler = (e) =>{
        item.done = e.target.checked
        editItem()
        
    }




    return (
        <ListItem>
            <Checkbox checked={item.done} onChange={checkboxEventHandler} />
            <ListItemText>
                <InputBase
                    inputProps={{
                        "aria-label": "naked",
                        "readOnly": readOnly
                    }}
                    onKeyDown={turnOnReadOnly}
                    onClick={turnOffReadOnly}
                    onChange={editEventHandler}
                    type="text"
                    id={item.id}
                    name={item.id}
                    value={item.title}
                    multiline={true}
                    fullWidth={true}
                />
            </ListItemText>
            <ListItemSecondaryAction>
                <IconButton aria-label="Delete Todo"
                    onClick={deleteEventHandler}>
                    <DeleteOutlined />
                </IconButton>
            </ListItemSecondaryAction>
        </ListItem>
    );
}



export default Todo;
//export default 이 파일에서 하나의 컴포넌트만 내보내겠다 .