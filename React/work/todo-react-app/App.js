import logo from './logo.svg';
import Todo from './Todo'; // Todo 컴포넌트 import
import './App.css';
import Example from './Count';
import React, { useState } from 'react';
import { Container, List, Paper } from "@mui/material";
import AddTodo from './AddTodo';


function App() {
  const [items, setItems] = useState([])



  // 추가
  // 전체 데이터를 App.js 에서 관리하기 때문ㅇ ㅔ함수를
  //App.js에 작성함
  const addItem = (item) => {
    item.id = 'ID-' + items.length;
    item.done = false // done 초기화
    //... : 스프레드 연산자
    // 배열이나 객체의 요소를 개별적으로 펼처서 다른 배열이나
    //객체에 삽입할 때 사용한다 .
    // 리액트에서 상태를 업데이트할때 사용한다 .
    setItems([...items, item]);
    console.log("items:", items)
  }




  // 내용 수정
  const editItem = () => {
    setItems([...items]); // 수정한 내용을 재렌더링 해야함
  }

  // 삭제
  //deleteItem 함수 작성
  const deleteItem = (item) => {
    //삭제할 아이템을 갖는다
    const newItems = items.filter(e => e.id !== item.id);
    //삭제할 아이템을 제외한 아이템을 다시 배열에 저장한다
    setItems([...newItems]);
  }



  // App.js에서 Todo에 deleteItem 연결하기

  //map() -> 반복문 안에 들어있는 내용을 하나씩 꺼내서 처리한다.
  //key 를 쓰는 이유 요소의 리스트를 만들 때 , React에서 컴포넌트를 렌더링했을때
  // 어떤 아이템이 변경되었는지 빠르게 감지하기 위해 사용한다 .
  // 만약 key가 설정되지않았다면 가상 DOM 을 순차적으로 비교하면서 감지하기 때문에 
  // KEY 가 없을때보다 속도가 느리다 . key 는 고유한값을 주어야한다
  let todoItems = items.length > 0 && (
    <Paper style={{ margin: 16 }}>
      <List>
        {items.map((item) => (
          <Todo item={item} key={item.id}
            editItem={editItem}
            deleteItem={deleteItem}
          />
        ))}
      </List>
    </Paper>
  );
  // props를 컴포넌트에 전달하기
  // 이름={useState값}
  return (
    <div className="App">
      <Container maxWidth="md">
        <AddTodo addItem={addItem} />
        <div className='TodoList'>{todoItems}</div>

      </Container>
    </div>
  );
}


// 해당 파일에서는 하나의 컴포넌트만을 내보낸다.
// export default 구문을 사용해 내보낸 컴포넌트는 중괄호를 사용하지 않고 
// 불러올 수 있으며 , 이름 또한 원하는 이름으로 바꿔서 불러올 수 있다.

export default App;


// 컴포넌트
// 페이지에 랜더링할 React 엘리먼트를 반환하는 작고 재사용가능한 코드조각
// JSX로 작성되어있음 함수 안에 JS 코드 안에 html코드가 작성되어있다
// babel 로 JSX를  JS형태로 컴파일해준다 
// Babel JSX로 작성된 자바스크립트를 순수 자바스크립트로 만들어주는 라이브러리 
