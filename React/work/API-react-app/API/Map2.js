import React, { useState } from "react";
import { Map, MapInfoWindow, MapMarker } from "react-kakao-maps-sdk";
export function MyMap2() {

    //지도에 표시될 마커들의 리스트 state 
    const [markers, setMarkers] = useState([]);

    // 검색한 키워드를 저장하는 상태
    const [keyword, setKeyword] = useState('');

    // 생성된 카카오 맵 객체를 저장할 상태
    const [saveMap, setSaveMap] = useState(null);

    // 사용자가 클릭한 마커의 정보를 저장할 상태
    const [info, setInfo] = useState(null);

    // 카카오 장소 검색 API를 호출하는 함수
     const searchPlace = (searchKeyword) => {
        //map 객체와 카카오 지도 API 가 로드되지 않으면 함수 종료
        if (!saveMap || !window.kakao || !window.kakao.maps || !window.kakao.maps.services) {
            return;
        }

        //카카오 장소 검색 객체 생성
        const ps = new window.kakao.maps.services.Places();

        ps.keywordSearch(searchKeyword,(data,status) =>{
            //검색이 성공적으로 완료 되었을 때 
            if(status ===window.kakao.maps.services.Status.OK){
                //지도 범위를 설정하기 위한 객체
                // 마커가 보이도록 지도 범위를 설정하기 위한 객체
                const bounds = new window.kakao.maps.LatLngBounds() ;

                // 검색 된 장소 리스트를 마커로 변환
                const newMarkers = data.map(place=> ({
                    position:{
                        lat : place.y, //장소의 위도
                        lng : place.x //장소의 경도
                    },
                    content:place.place_name //마커에 표시할 장소명
                })) 
                
                //지도 위치를 수정하기 위해 bounds객체에 모든 마커에 좌표를 넣는다 .
                newMarkers.forEach(marker=> bounds.extend(new window.kakao.maps.LatLng(marker.position.lat,marker.position.lng))) 

                // 마커 리스트 상태를 업데이트
                setMarkers(newMarkers) ;

                // 지도 좌표 재설정하기
                saveMap.setBounds(bounds) ;
            }else{
                alert('검색어가 없습니다 .')
            }
        })
    }


    const handleSearch = () => {
        //검색어가 비어있을 시 경고
        if (keyword === "") {
            alert('검색어를 입력해주세요')
            return;
        }
        searchPlace(keyword);
    }







    return (
        <div>
            {/* 검색창과 버튼 */}
            <div style={{ marginBottom: '10px' }}>
                <input
                    type="text"
                    value={keyword} // 검색어의 상태를 입력창의 값으로 설정 
                    onChange={(e) => setKeyword(e.target.value)} // 입력될때마다 검색어 상태를 업데이트 
                    placeholder="검색어를 입력하세요 "
                    style={{ padding: '5px', marginRight: '5px' }}
                />
                <button onClick={handleSearch}>검색</button>
            </div>
            {/* 지도표시 */}
            <Map
                center={{
                    lat: 37.49217779688356,
                    lng: 126.7264845165
                }}
                style={{
                    width: '400px',
                    height: '400px'
                }}
                level={3}
                onCreate={setSaveMap}//지도가 생성될때 호출되는 이벤트핸들러
            //이 핸들러는 지도의 초기화가 완료되면 카카오맵 객체(Kakao.maps.map)을
            // 매개변수로 받아 그 객체에 대한 접근 및 추가설정을 가능하게한다 .
            >
                {markers.map((marker, index) => (
                    <MapMarker
                        key={`marker=${index}`} //마커에 고유한 key를 설정
                        position={marker.position} //마커의 위치 설정
                        onClick={() => {setInfo(marker)
                         } } //마커 클릭시 마커 정보를 info에 저장
                    >
                        {/* 선택된 마커에 정보 표시 */}
                        {info && info.content === marker.content && (
                            <div style={{ color: "#000" }}>{marker.content}</div> // makerinfo .  
                        )}
                    </MapMarker>
                ))}
            </Map>
            
        </div >
    )
}

