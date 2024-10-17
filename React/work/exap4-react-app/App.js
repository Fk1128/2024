import logo from './logo.svg';
import './App.css';
import React, { useState } from 'react';
import {Provider,useDispatch,useSelector} from 'react-redux' 
import { ADD_TODO,REMOVE_TODO } from './actions';
import store from './store';

function Todo_List() {
  const [input, setInput] = useState('');
  const todos = useSelector(state => state.todos); 
  const dispatch = useDispatch(); 

  

  const handleAddTodo = () => {
    if (input.trim()) {
      dispatch(ADD_TODO(Date.now(), input)) 
      setInput(''); 
    }
  }

  const handleRemoveTodo = (id) => {
    dispatch(REMOVE_TODO(id));
  }

  return (
    <div>
      <h1>Todo List</h1>
      <input
        type='text'
        value={input}
        onChange={(e) => setInput(e.target.value)}
        placeholder='Add a new todo'></input>
      <button onClick={handleAddTodo}>Add Todo</button>
      <ul>
        {todos.map(todo => (
          <li key={todo.id}>
            {todo.text}
            <button onClick={() => handleRemoveTodo(todo.id)}>Remove</button>
          </li>
        ))}
      </ul>
    </div>
  )
}


function App() {
  return (
    <Provider store={store}>
      < Todo_List />
    </Provider>
  )


}

export default App;
