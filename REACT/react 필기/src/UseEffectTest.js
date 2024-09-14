import React, { useState, useEffect } from "react";

function MyComponent() {
    const [count, SetCount] = useState(0);
    //()=> {}사이드 이펙트 함수  ()=>[] :의존성     
    //{} : 사이드 이펙트 로직
    useEffect(() => {
        console.log(`you clicked ${count} times`)
     }, [count]);

     return(
        <div>
            <p>You clicked {count} times</p>
            <button onClick={()=> SetCount(count+1)}>Click me</button>

        </div>
     )

}
export default MyComponent;