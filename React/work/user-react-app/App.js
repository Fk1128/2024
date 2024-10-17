import './App.css';
import { useState,useEffect } from 'react';
import { call, signout } from './service/ApiService';
import MyInfo from './users/MyInfo';


function App() {

  const [user,setUser] = useState([])
 
  const[modify,setModify] = useState(false);
useEffect(() =>{
  //토큰을 같이보냄
  call("/users/name","GET") 
  .then(result =>{setUser(result.data)}) 
},[])

  return (
    <div className="App">
        {user.length > 0 &&(<p>{user[0].name}환영합니다 메인화면입니다 .</p>)}
        <button onClick={()=>{signout()}}>로그아웃</button>
        <button onClick={() => {setModify(!modify)}} >정보수정</button>
        {modify && <MyInfo/>}
    </div>
  );
}

export default App;
