import React, { useState } from "react"
import { Map } from "react-kakao-maps-sdk";

function MyMap3() {

    // 지도에 표시될 마커 
    const  [marker, setMarker] = useState() ;

    // 검색한 키워드를 저장하는 상태
    const [keyword, setKeyword] = useState('');


    // 사용자가 클릭한 마커의 정보를 저장할 상태
    const [info, setInfo] = useState(null);

    const searchPlace = (searchKeyword) => {

        const ps = new window.kakao.maps.services.Places();

        ps.keywordSearch(searchKeyword, (result, status) => {

            if (status === window.kakao.maps.services.Status.OK) {

                const bounds = new window.kakao.maps.LatLngBounds();

                const newMarker = result.result_name


            }})
    }


    const handleSearch = (e) => {

  //      searchPlace

    }





    return (

        <div>
            <Map
                center={{
                    lat: 37.49217779688356,
                    lng: 126.7264845165
                }}
                style={{ width: '600px', height: '600px' }}
            >

            </Map>
            <div>
                <input
                    type="text"
                    value={keyword}
                    onChange={(e) => setKeyword(e.target.value)}
                    placeholder="주소를 입력하세요 "
                    style={{ padding: '5px', marginRight: '5px' }} />
                <button onClick={handleSearch}>검색 </button>
            </div>
        </div>
    )





}
export default MyMap3
