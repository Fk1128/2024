import React from "react";
import { useNavigate } from "react-router-dom";

function MultiButtons() {


    const navigate = useNavigate();

    const handleButtonClick = (event) => {
        const buttonId = event.target.id; // 버튼의 id 값으로 구분

        switch (buttonId) {
            case 'address':
                navigate('/address');
                break;
            case 'booksearch':
                navigate('/search'); // search 페이지로 이동
                break;
            case 'newssearch':
                navigate('/newsSearch');
                break;
            case 'map':
                navigate('/map');
                break;
            case 'map2':
                navigate('/map2');
                break;
            case 'map3':
                navigate('/map3');
                break;
            case 'map4':
                navigate('/map4');
                break;

            default:
                console.log('알 수 없는 버튼 클릭');
        }
    }







    return (
        <div>
            <button id="address" onClick={handleButtonClick}>
                주소찾기 api
            </button>
            <button id="booksearch" onClick={handleButtonClick}>
                도서찾기 api
            </button>
            <button id="newssearch" onClick={handleButtonClick}>
                뉴스 검색 api
            </button>
            <button id="map" onClick={handleButtonClick}>
                KAKAO MAP API
            </button>
            <button id="map2" onClick={handleButtonClick}>
                KAKAO MAP API2
            </button>
            <button id="map3" onClick={handleButtonClick}>
                KAKAO MAP API3
            </button>
            <button id="map4" onClick={handleButtonClick}>
                KAKAO MAP API4
            </button>
        </div>
    );
}
export default MultiButtons;