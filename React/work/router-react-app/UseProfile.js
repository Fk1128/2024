import React from 'react'
import { useParams } from 'react-router-dom'

function UserProfile(){
    const {id} = useParams();

    const user={
        id,
        name : id==='1'?'홍길동' : id==='2' ? '김길동' : '박길동',
        age : id==='1'? 30: id==='2' ? 40: 50
    }

    return(
        <div>
            <h2>{user.name}님의 프로필</h2>
            <p>사용자 ID : {user.id}</p>
            <p>나이 : {user.age}</p>
        </div>
    )
}


export default UserProfile