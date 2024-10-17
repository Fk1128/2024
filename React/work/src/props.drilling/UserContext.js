import React, { createContext, useState } from 'react'

// 새로운 Context 생성하기 전역변수 생성느낌
// createContext() : 하위 컴포넌트로 데이터를 전달하는 함수
// UserContext : createContext()함수를 실행하고 반환된 객체를 담는 변수
// 이 객체는 제공(provider) 하거나 , 소비(consumer) 할 수 있는 기능을 제공
export const UserContext = createContext();

// Context의 Provider 역할을 한다.
// 이 컴포넌트를 사용하면 하위 컴포넌트에서 UserContext를 사용할 수 있다 
export const UserProvider = ({ children }) => {
    const [user, setUser] = useState({ name: 'John Doe', age: 30 });

    return (
        // provider 는 Context에서 제공하는 특수한 컴포넌트로 , 하위 컴포넌트들에게
        // 전역상태를 전달하는 역할을 한다 .
        <UserContext.Provider value={{ user, setUser }}>
            {children}   {/* UserProvider 컴포넌트가 감싸고 있는 모든 하위 컴포넌트를 의미한다  */}
        </UserContext.Provider>
    )

}


