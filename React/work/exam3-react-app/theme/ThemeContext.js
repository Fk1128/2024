import React, { createContext, useState } from 'react';

export const ModeContext = createContext();

export const ThemeProvider = ({ children }) => {
  const [isDarkMode, setIsDarkMode] = useState(false);

  const toggleTheme = () => {
    setIsDarkMode((prevMode) => !prevMode);
  };

  return (
    <ModeContext.Provider value={{ isDarkMode, toggleTheme }}>
      {children}
    </ModeContext.Provider>
  );
};