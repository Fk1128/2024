import React from 'react'
import { Link } from 'react-router-dom';
function Home() {
    const users = [
        { id: 1, name: '홍길동' },
        { id: 2, name: '이순신' },
        { id: 3, name: '김유신' },
    ];
    return (
        <div>
            <h1>안녕하세요 홈 화면입니다.</h1>
            <ul>
                {users.map(user => (
                    <li key={user.id}>
                        <Link to={`/users/${user.id}`}> {user.name}의 프로필 보기 </Link>
                    </li>
                ))}
            </ul>
        </div>
    )
}

export default Home