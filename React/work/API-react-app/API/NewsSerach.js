import axios from "axios";
import React, { useState } from "react";

function NewsSearch() {
    const [headlines, setHeadlines] = useState([]); //검색결과
    const [query, setQuery] = useState(''); //검색
    const [error, setError] = useState(null)


    const searchNews = () => {

        try {
            const response = axios.get('http://localhost:9090/api/news', {
                params: { query }
            })
            //검색 결과를 result 상태에 저장
            response.then(res => setHeadlines(res.data.items));


        } catch (err) {
            setError('뉴스 검색에 실패했습니다.');
        }
    }
    const handleSearch = (e) => {
        if (!query) {
            alert('검색어를 입력하세요');
            return;
        }
        e.preventDefault();//새로고침을 강제로 막음
       searchNews();
    }




    return (
        <div>
            <h1>기사 검색</h1>
            <form onSubmit={handleSearch}>
                <input
                    type="text"
                    value={query}
                    onChange={(e) => setQuery(e.target.value)}
                />
                <button type="submit">검색</button>
            </form>

            <ul>
                {headlines.map((headline) => (
                    <li>
                        <p>{headline.title}</p>
                        <p>{headline.description}</p>
                        <p>{headline.pubDate}</p>
                        <a href={headline.originallink}>원문URL </a>
                        <a href={headline.link}>네이버URL</a>
                    </li>
                ))}
            </ul>
        </div>
    )

}
export default NewsSearch