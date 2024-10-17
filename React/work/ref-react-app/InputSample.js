import React, { useState, useRef } from 'react'

function InputSample() {
    const [inputs, setInputs] = useState({
        이름: "",
        nickname: ""
    });
    const nameFocus = useRef();
    



    const { 이름, nickname } = inputs;


    const onChange = (e) => { // onChane 이벤트가 발생할때 
        // e.target : 이벤트가 발생하는 주체
        // value 그 요소의 현재값
        // name : 요소의 name 속성

        const { value, name } = e.target;
        setInputs({
            ...inputs,// 기존의 상태를 복사 ()
            [name]: value// 그 태그에 value를 변경해줘 .
            // 이벤트가 일어난 주체에 name 이 들어가고 
            // name 에 변화된 value를 input에 넣고 재렌더링
        })
    }

    const onReset = () => { // onReset
        //input태그에 있는 내용을 모두 비우고
        //다시 이름을 입력할 수 있도록 포커스 잡아주기
        setInputs({
            이름: "",
            nickname: ""
        })
        nameFocus.current.focus();
    }





    return (
        <div>
            <input
                name="이름"
                placeholder='이름을 작성해주세요'
                value={이름}
                ref={nameFocus}
                onChange={onChange}
            />
            <input
                name="nickname"
                placeholder='닉네임을 작성해주세요'
                value={nickname}
                onChange={onChange}
            />
            <button onClick={onReset}>초기화</button>
            <div>
                <b> 값 : </b>
                {이름} ({nickname})



            </div>

        </div>
    )


}

export default InputSample