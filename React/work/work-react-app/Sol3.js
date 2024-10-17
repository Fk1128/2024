import React, { useState, useEffect } from "react";

function MyComponent3() {
    const [count, SetCount] = useState(0);
    const [rederCount, SetRenderCount] = useState(0);
    
    const onclickHandler = (e) => {
        SetCount(count + 1)
        
    }

    

    useEffect(() => {
        console.log(`렌더링 완료`)
        SetRenderCount(count+1)
    }, [count]);


    return (
        <div>
            <h1>Count:{count}</h1>
            <h1>렌더링 횟수: {rederCount}</h1>
            <button onClick={onclickHandler}>클릭</button>

        </div>
    )

}
export default MyComponent3;