import logo from './logo.svg';
import './App.css';
import { Routes, Route } from 'react-router-dom'
import Home from './Home'
import About from './About'
import Navbar from './Navbar';
import UserProfile from './UseProfile';
import User from './User'
import Dashboard from './Dashboard';
import NotFound from './NotFound';
import PrivateRoute from './PrivateRoute';
import Login from './Login';
function App() {

  // 실제로는 사용자 인증상태를 확인해야 한다 .
  // 세션,토큰,토키 등 로그중인가 로그인중이아닌가 확인을 해야함
  const isAuthenticated =false;
  return (
    <div className="App">
      <Routes>
        {/* <Route path="/" element={<User />} />
        <Route path="/users/:id" element={<UserProfile />} /> */}
          {/* <Route path="/Dashboard/*" element={<Dashboard/>} /> */}
          {/*  / :root 경로 */}
          {/* <Route path="/" element={<Home/>} />
          <Route path="*" element={<NotFound/>}/>  */}
          <Route path= "/login" element={<Login/>}/>
          <Route path="/dashboard" element={<PrivateRoute element={<Dashboard/>} isAuthenticated={isAuthenticated}/>}/>
      </Routes>
    </div>
  );
}

export default App;


    //   {/* <UserProfile />
    //   <Navbar /> */}
    //   {/* <Routes></Routes> : 
    // 모든 Route를 그룹화하며 , URL의 경로에 따라 적절한 Route를 렌더링한다 */}
    //   {/* Route :URL 경로와 컴포넌트를 매핑하여 특정 경로에 맞는 컴포넌트를 렌더링 한다 . */}
      
    //     {/* <Route path="/" element={<Navbar />} />  {/*root경로에서 메뉴가 보이게하기  
    //     <Route path="/home" element={<Home />} />
    //     <Route path="/about" element={<About />} /> */}
