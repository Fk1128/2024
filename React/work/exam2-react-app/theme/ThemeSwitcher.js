import React, { useContext } from 'react';
import { ModeContext } from './ThemeContext';

export default function ModeSwitcher() {
  const { isDarkMode, toggleTheme } = useContext(ModeContext);

  return (
    <button onClick={toggleTheme}>
      {isDarkMode ? '라이트 모드로 전환' : '다크 모드로 전환'}
    </button>
  );
}