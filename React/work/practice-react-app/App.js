import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';
import Browser1 from './Browser';
import Greeting1 from'./Greeting';
function App() {
  return (
    <div className="App">
      <Routes>
         <Route path="/:lang/home" element={<Browser1 />} /> 
         <Route path="/:lang/home/languageid" element={<Greeting1/>}/>
      </Routes>
    </div>
  );
}

export default App;
