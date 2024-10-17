import React, { createContext, useState } from 'react'

export const ThemeContext = createContext();

export const ThemeProvider = ({ Themes }) => {
    const [isDarkmode, setIsdarkmode] = useState(false);
    const toggleTheme = () =>{
        setIsdarkmode((prevmode) => !prevmode);
    }
    return (
        <ThemeContext.Provider value={{ isDarkmode, toggleTheme }}>
            {Themes}
        </ThemeContext.Provider>
    )

}
