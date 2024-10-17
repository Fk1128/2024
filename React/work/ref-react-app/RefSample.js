import React, { useState, useRef } from 'react'

function RefSamlple() {

    //refNum= {current:0}
    const refNum = useRef(0);


    //stateNum = 0;
    const [stateNum, setStateNum] = useState(0);


    console.log('렌더링 발생');



    const[render, setRender] = useState(true)

    console.log({render})


    const increaseRefNum = () => {
        refNum.current = refNum.current + 1;
        console.log(`refNum : ${refNum.current}`)

    }
    const increaseStateNum = () => {  
        setStateNum(stateNum => stateNum + 1)
        console.log(`stateNum : ${stateNum}`)

    }

    //자주바뀌는 값을state에 넣어놓으면 값이 바뀔대마다 렌더링이 일어나서
    // 성능이 떨어질 수 있다.
    // 이떄 useRef를 사용하면 값이 바뀌어도 
    //렌더링이 발생하지않아 성능저하를막을 수 있다 .

    //일반 변수
    let count =0;





    return (
        <div>

            <h1>refNum : {refNum.current}</h1>
            <h1>stateNum : {stateNum} </h1>
            <h1>letNum:{count}</h1>
            <button onClick={increaseRefNum}>refNum+1</button>
            <button onClick={increaseStateNum}>StateNum+1</button>
            <button onClick={redner=>setRender(!render)}>재랜더링</button>
            <button onClick={() => {count+=1; console.log (`count: ${count}`)}}>count+1</button>

        </div>
    )
}
export default RefSamlple;