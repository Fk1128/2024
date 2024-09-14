import React, { useState, useEffect } from "react";

function MyComponent2() {
    const [count, SetCount] = useState(0);
    const [value,setvalue] = useState("")
    
    const onclickHandler = (e) => {
        console.log('count 값이 바뀜')
        SetCount(count+1) 
    }

    

    const inputHandler = (e) => {
        setvalue(e.target.value);
        console.log('input값이 바뀜')
     }
    useEffect(() => {
        console.log(`렌더링 완료`)
     }, []);




     return(
        <div>
            
            <h1>{count}</h1>
            <button onClick={onclickHandler}>+1</button>
            <hr></hr>
            <input onChange={inputHandler} value={value} />
            <h1>{value}</h1>
            

        </div>
     )

}
export default MyComponent2;