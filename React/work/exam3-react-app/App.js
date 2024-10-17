import logo from './logo.svg';
import './App.css';
import React, { useContext } from 'react';
import { ModeContext } from './theme/ThemeContext';
import ModeSwitcher from './theme/ThemeSwitcher';
function App() {
  const { isDarkMode } = useContext(ModeContext);


  return (
    <div className="App"
      style={{
        backgroundColor: isDarkMode ? '#333' : '#fff',
        color: isDarkMode ? '#fff' : '#000',
        height: '100vh',
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',
        flexDirection: 'column'
      }}
    >
      <h1>{isDarkMode ? '다크 모드' : '라이트 모드'}</h1>
      <ModeSwitcher />
    </div>
  );
}

export default App;
