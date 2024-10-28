import React, { useState } from "react";
import { Map, MapInfoWindow, MapMarker } from "react-kakao-maps-sdk";
function MyMap() {


    const [result, setResult] = useState("");
    //좌표를 저장하기 위한 state
    //const [position, setPosition] = useState([])

    // 마커 state
    const [markers, setMarkers] = useState([]);

    // 활성화된 마커의 id를 관리하는 state 
    const [activeMarker, setActiveMarker] = useState(null);


    const center = {
        // 지도의 중심좌표 lat : 위도 lng : 경도
        lat: 37.49217,
        lng: 126.72407
    }

    const handleMapClick = (event, mouseEvent) => {
        const latlng = mouseEvent.latLng // 좌표를 저장 
        setResult(`클릭한 위치의 위도는 ${latlng.getLat()} 이고, 경도는 ${latlng.getLng()} 입니다`,)
        const newMarker = {
            id: markers.length, // 배열의 길이를 id로 설정
            position: {
                lat: latlng.getLat(), //위도
                lng: latlng.getLng() // 경도 
            },
            info: `마커위치 : (${latlng.getLat()},${latlng.getLng()})`
        }
        setMarkers([...markers, newMarker]);


    }


    //마커에 마우스를 올렸을 때 인포 윈도우 활성화 하기 .
    const handleMouseOver = (id) => {
        setActiveMarker(id);
    }

    //마커위 마우스가 떠났을때 인포 윈도우 비활성화
    const handleMouseOut = () =>{
        setActiveMarker(null)
    }


    return (
        <div>
            <Map
                center={center}
                style={{ width: '600px', height: '600px' }} //지도의 너비와 높이
                level={1} // 지도 확대정도 숫자가 작을수록 크게 , 클수록 작게보임 
                onClick={handleMapClick} // 지도의 클릭 이벤트핸들러 
            >
                {markers.map(marker => (
                    <MapMarker
                        key={marker.id}
                        position={marker.position}
                        onMouseOver={() => handleMouseOver(marker.id)}
                        onMouseOut={handleMouseOut}
                    >   
                        {activeMarker === marker.id&&(
                        // 마커에 자식요소를 넣으면 자동으로 info로 들어간다 .
                            <div style={{ padding: "5px", color: "#000" }}>
                                {marker.info}
                            </div>
                        
                        )}
                    </MapMarker>
                ))}
                {/* 마커는 좌표위에 생성이 된다 .
                <MapMarker position={markers ?? center} /> */}
                
                <MapInfoWindow // 인포윈도우를 생성하고 지도에 표시한다 . 
                    position={center} // 인포윈도우가 표시도리 위치
                    removable={true} // 인포윈도우를 닫을 수 있는 X 버튼 표시 
                >
                    <div style={{ padding: '5px', color: "#000" }}>Hello World</div>
                </MapInfoWindow>
            </Map>
            <p>지도를 클릭해주세요</p>
            <p id="result" >{result} </p>

        </div >
    )
}

export default MyMap