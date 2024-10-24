import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './App.css';
function App() {

  const [movie, setMovie] = useState([]);



  // useEffect()
  // 컴포넌트가 렌더링 된 후에 실행된다 .
  // useEffect(() => {
  // 렌더링에 영향을 주지 않는 코드들 .
  // },[])

  let options = {
    headers: {
      "Content-Type": "application/json"
    },
    url: "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=82ca741a2844c5c180a208137bb92bd7&targetDt=20241001",
    method: "get"
  }


  //버튼이 눌리기 전까지 절대 실행되지않음 .
  const handleClick = () => {
    axios(options)
      .then(response => {
        console.log(response.data.boxOfficeResult.dailyBoxOfficeList);
        setMovie(response.data.boxOfficeResult.dailyBoxOfficeList)
        
      })
  }

  const movieTable = (
    <table border="1" align='center'>
      <tr>
        <td>제목</td>
        <td>개봉날짜</td>
        <td>박스오피스 순위</td>
        <td>관객수 </td>
      </tr>
      {movie.map((movie) => (
        <tr key={movie.rnum}>
          <td>{movie.movieNm}</td>
          <td>{movie.openDt}</td>
          <td>{movie.rank}</td>
          <td>{movie.audiCnt}</td>
        </tr>
      ))}
    </table>
  )





  return (
    <div className="App">
      <button onClick={handleClick} >일별 박스오피스 내용 가져오기 </button>
      {movieTable}
    </div>
  );
}

export default App;
