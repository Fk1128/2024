import React from "react";
import { Link, useParams } from "react-router-dom";




function Browser1() {

    const lang = [
        {
            id: 'ko',
            greeting: '안녕하세요!',
            description: '이것은 한국어 페이지입니다.',
        },
        {
            id: 'en',
            greeting: 'Hello!',
            description: 'This is an English page.',
        },
        {
            id: 'jp',
            greeting: 'こんにちは！',
            description: 'これは日本語のページです。',
        }

    ]
    const {languageid } = useParams();
    

    return (
        <div>
            <h1>언어지원</h1>
            <ul>
                {lang.map(language => (
                    <li key={language.id}>
                        <Link to={`${language.id}`}> {language.id} </Link>
                    </li>
                ))}
            </ul>



        </div>
    )

}

export default Browser1