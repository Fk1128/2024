import React from 'react'
import { Link } from 'react-router-dom'

function Navbar() {
    return (
        <nav>
            <Link to="/home">홈</Link><br />
            <Link to="/about">소개</Link>
        </nav>

    )


}
export default Navbar