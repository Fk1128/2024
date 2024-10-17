import React, { useState,useEffect } from 'react';
import './GptCal.css'; // 스타일을 별도로 추가할 수 있습니다.

const Calculator = () => {
  const [input, setInput] = useState('');
  const [v1, setV1] = useState(null);
  const [operator, setOperator] = useState('');
  const [history, setHistory] = useState([]);

  const handleClick = (value) => {
    if (/[\d.]/.test(value)) {
      setInput((prevInput) => prevInput + value);
    } else if (/[+\-*/]/.test(value)) {
      setV1(parseFloat(input));
      setOperator(value);
      setInput('');
    }
  };

  const handleClear = () => {
    setInput('');
    setV1(null);
    setOperator('');
  };

  const handleCalculate = () => {
    if (v1 !== null && operator && input) {
      let result;
      const v2 = parseFloat(input);
      switch (operator) {
        case '+':
          result = v1 + v2;
          break;
        case '-':
          result = v1 - v2;
          break;
        case '*':
          result = v1 * v2;
          break;
        case '/':
          result = v1 / v2;
          break;
        default:
          result = 'Error';
      }
      setHistory((prevHistory) => [...prevHistory, v1]);
      setInput(result.toString());
      setV1(null);
      setOperator('');
    }
  };

  const handleKeyboard = (event) => {
    const key = event.key;
    if (/[\d+\-*/.]/.test(key)) {
      handleClick(key);
    } else if (key === 'Enter') {
      handleCalculate();
    } else if (key === 'Escape') {
      handleClear();
    }
  };

  useEffect(() => {
    window.addEventListener('keydown', handleKeyboard);

    return () => {
      window.removeEventListener('keydown', handleKeyboard);
    };
  }, []);

  return (
    <div className="calculator">
      <h1>{input || '0'}</h1>
      <div className="buttons">
        <button onClick={() => handleClear()}>C</button>
        <button onClick={() => handleClick('/')}>/</button>
        <button onClick={() => handleClick('*')}>*</button>
        <button onClick={() => handleClick('-')}>-</button>
        <button onClick={() => handleClick('+')}>+</button>
        <button onClick={() => handleClick('1')}>1</button>
        <button onClick={() => handleClick('2')}>2</button>
        <button onClick={() => handleClick('3')}>3</button>
        <button onClick={() => handleClick('4')}>4</button>
        <button onClick={() => handleClick('5')}>5</button>
        <button onClick={() => handleClick('6')}>6</button>
        <button onClick={() => handleClick('7')}>7</button>
        <button onClick={() => handleClick('8')}>8</button>
        <button onClick={() => handleClick('9')}>9</button>
        <button onClick={() => handleClick('0')}>0</button>
        <button onClick={() => handleClick('.')}>.</button>
        <button onClick={() => handleCalculate()}>=</button>
      </div>
    </div>
  );
};


export default Calculator;