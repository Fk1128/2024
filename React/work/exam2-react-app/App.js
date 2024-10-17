import logo from './logo.svg';
import './App.css';
import {Routes,Route} from 'react-router-dom'
import Categories from './Categories';
import Products from './Products';
import ProductsDetail from './ProductDetail';

function App() {
  return (
    <div className="App">
      <Routes>
      <Route path="/categories" element={<Categories/>}/>
      <Route path="/categories/:categoryId" element={<Products/>}/>
      <Route path="/categories/:categoryId/:products/:productId" element ={<ProductsDetail/>}/>
      </Routes>


    </div>
  );
}

export default App;
