import React, { useState, useEffect } from 'react'



function UserList() {
    const [users, setUsers] = useState([]);
    const [loading, setLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(() => {

        const fetchData = async () => {
            try {

                const response = await fetch('https://jsonplaceholder.typicode.com/users');

                if (!response.ok) {
                    throw new Error('데이터를 불러오는데 실패했습니다 .')
                }
                const data = await response.json()
                setUsers(data);
            } catch (err) {
                setError(err.message);
            } finally {
                setLoading(false);
            }
        }
        fetchData();
    }, [])
    if (loading) {
        return (<p>로딩중 ... </p>);
    }
    if (error) {
        return <p>에러 발생 : {error}</p>
    }
    return (
        <div>
            <ul>
                {users.map((users) => (
                    <li key={users.id}> name : {users.username} // email : {users.email}</li>
                ))}
            </ul>
        </div>
    )


}


export default UserList;