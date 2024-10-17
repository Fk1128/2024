import React from 'react';
import './index.css';
import ReactDOM from 'react-dom'
import App from './App';
import reportWebVitals from './reportWebVitals';
import Todo from './App';
import { Provider } from 'react-redux';
// import store from './to-do/store';
// import store from './login/store';
import store from './shoppingcart/store';
import AuthApp from './App';
import ShopApp from './shoppingcart/shoppingcartApp';

//const root = ReactDOM.createRoot(document.getElementById('root'));
ReactDOM.render(
  <Provider store={store}>
    <ShopApp />
  </Provider>,
   document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
