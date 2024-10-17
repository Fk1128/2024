// store.js
import { createStore } from 'redux';
import authReducer from './Reducer'; 

const store = createStore(authReducer);

export default store;