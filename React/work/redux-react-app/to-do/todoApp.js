import logo from './logo.svg';
import './App.css';
import store from './redux/Store';
import React, { useState } from 'react'
import { addTODO, removeTODO} from './to-do/TodoAction'
// Redux와 React를 연결하는 데 필요한 Provider, useDispatch, useSelector를 
import { Provider, useDispatch, useSelector } from 'react-redux';
import { increment, decrement } from './redux/Actions';

function App() {
  const [input, setInput] = useState(''); // 입력값을 관리하는 state



  const todos = useSelector((state) => state.todos); // Redux에서 todos 상태를 가져옴
  const dispatch = useDispatch(); // 액션을 디스패치하는 함수 가져오기

  const handleAddTodo = () => {
    if (input.trim()) {
      dispatch(addTODO(Date.now(), input)); // 새로운 Todo를 추가 (id는 현재 시간으로 고유값 생성)
      setInput(''); // 입력창 비우기
    }
  };

  const handleRemoveTodo = (id) => {
    dispatch(removeTODO(id)); // Todo를 삭제
    
  };

  return (
    <div>
      <h1>Todo List</h1>
      <input
        type="text"
        value={input}
        onChange={(e) => setInput(e.target.value)}
        placeholder="Add a new todo"
      />
      <button onClick={handleAddTodo}>Add Todo</button>

      <ul>
        {todos.map((todo) => (
          <li key={todo.id}>
            {todo.text}
            <button onClick={() => handleRemoveTodo(todo.id)}>Remove</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default App;