import React, { useState } from 'react'; //react , useState import

//컴포넌트 만들기
function Sol1() { // function sol1 start
    const [eating, SetEating] = useState(['']) // eating = 배열[초콜릿,사탕]
    const [value, SetValue] = useState("");//  value : ""
    //const [text, SetText] = useState('');

    //value의 값을 변경하겠다.
    const inputHandler = (e) => {
        //input 에 change이벤트가 일어난 값을 SetValue 함수에 담아둠
        SetValue(e.target.value);
    }

    //버튼을 클릭했을 때 value를 eating에 추가
    const clickHandler = () => {
        SetEating([...eating, value])
        //  button이 눌렸을때 eating 배열안에값과 위에서 담아둔 배열의 값을 추가
        SetValue("");
    }

    const enter = (e) => {
        if (e.key == 'Enter')
            clickHandler();
    }

    //  input태그와 button 태그에 event 지정 
    return (
        <div>
            <input onChange={inputHandler} value={value} onKeyDown={enter} />
            <button onClick={clickHandler}>추가</button>
            <ul>
                {eating.map(item => <li>{item}</li>)}
            </ul>
        </div>
    )
}

export default Sol1