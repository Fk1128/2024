
// App.js
import React, { useState } from 'react';
import { useDispatch, useSelector } from 'react-redux'; // Redux 관련 훅을 불러옴
import { login,logout } from './login/Action'; // 액션 생성 함수 불러오기

function AuthApp() {
  const [usernameInput, setUsernameInput] = useState(''); // 입력 필드 상태
  const { isLoggedIn, username } = useSelector((state) => state); // Redux 상태에서 로그인 정보 가져오기
  const dispatch = useDispatch(); // 액션을 디스패치하기 위한 훅

  const handleLogin = () => {
    if (usernameInput.trim()) {
      dispatch(login(usernameInput)); // 로그인 액션 디스패치
      setUsernameInput(''); // 입력 필드 초기화
    }
  };

  const handleLogout = () => {
    dispatch(logout()); // 로그아웃 액션 디스패치
  };

  return (
    <div>
      <h1>Login Status</h1>
      {isLoggedIn ? (
        <div>
          <p>Welcome, {username}!</p>
          <button onClick={handleLogout}>Logout</button>
        </div>
      ) : 
      (
        <div>
          <input
            type="text"
            value={usernameInput}
            onChange={(e) => setUsernameInput(e.target.value)}
            placeholder="Enter your username"
          />
          <button onClick={handleLogin}>Login</button>
        </div>
      )}
    </div>
  );
}

export default AuthApp;