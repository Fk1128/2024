import { useDispatch, useSelector } from "react-redux";
import React,{useState} from'react'
import { addTODO,removeTODO } from "../to-do/TodoAction";
function Todo(){

    const list = useSelector((state)=> state.id.list);

    const dispatch =useDispatch();
    return(

        <div>
            <h1>Todo List</h1>
            <input 
            type="text"
            placeholder="Add a new todo"
            />
            <button>Add Todo</button>
            
            list.map(
            <li>

            </li>
            <button>Remove</button>
            )



        </div>
    )



}

function Counter() {
    // useSelector: Redux 스토어에서 상태를 읽어오는 Hook
    // 스토어의 상태 중 count 값을 선택해서 가져옴
    const count = useSelector((state) => state.count);
  
    // useDispatch: Redux 스토어에 액션을 보낼 수 있는 Hook
    // 이 Hook을 사용해 액션을 디스패치할 수 있음
    const dispatch = useDispatch();
    return (
      <div>
        {/* 현재 상태인 count 값을 화면에 출력함 */}
        <h1>Counter: {count}</h1>
  
        {/* Increment 버튼을 클릭하면 increment 액션을 디스패치함 */}
        <button onClick={() => dispatch(increment())}>Increment</button>
  
        {/* Decrement 버튼을 클릭하면 decrement 액션을 디스패치함 */}
        <button onClick={() => dispatch(decrement())}>Decrement</button>
      </div>
    );
  }
  function App() {
    return (
      //Provider : store 를 애플리케이션 전체에 제공
      //provider : 안에 잇는 모든 컴포넌트는 store에 접근할 수 있다 .
  
      <Provider store={store} >
        <Counter/>
      </Provider>
    );
}

export default App;