import logo from './logo.svg';
import './css/App.css';
import {BrowserRouter, Routes, Route} from 'react-router-dom';
import Address from './API/Address';
import MultiButtons from './API/MultiButtons';
import BookSearch from './API/BookSearch'; 
import NewsSearch from './API/NewsSerach';
import MyMap from './API/Map';
import {MyMap2} from './API/Map2';
import MyMap3 from './API/Map3';
import Map4 from './API/Map4';








function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Routes>
        <Route path="/" element={<MultiButtons/>}/>
        <Route path="/address" element={<Address/>}/>
        <Route path="/search" element={<BookSearch/>}/>
        <Route path="/newsSearch" element={<NewsSearch/>}/>
        <Route path="map" element = {<MyMap/>}/>
        <Route path="map2" element = {<MyMap2/>}/>
        <Route path="map3" element = {<MyMap3/>}/>
        <Route path="map4" element = {<Map4/>}/>
      
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
