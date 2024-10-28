import React, { useState } from "react";
import { Map, MapMarker } from "react-kakao-maps-sdk";
import { useDaumPostcodePopup } from "react-daum-postcode";
import MyMap2 from "./Map2";
function Map4() {

    const [address, setAddress] = useState('');

    const [mapAddr, setMapAddr] = useState(null);

    const [mapStatus, setMapStatus] = useState(false);

    const [info1, setInfo1] = useState(null);

    // 사용자가 클릭한 마커의 정보를 저장할 상태
    const [info, setInfo] = useState('');

    //Daum 우편번호 API 스크립트 URL
    let scriptUrl = "http://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"

    //react-daum-postcode의 useDaumPostcodePopup훅을 사용하여 API를 팝업으로 실행할 준비
    const open = useDaumPostcodePopup(scriptUrl);

    let geoCoder = new window.kakao.maps.services.Geocoder();
    // 주소 - 좌표간 변환 객체 생성 .

    let ps = new window.kakao.maps.services.Places();


    const handleComplete = (data) => {
        let addr = data.address;
        setAddress(addr) //
        setInfo1(data)
        geoCoder.addressSearch(addr, function (results, status) {
            //정상적으로 검색이 완료됐으면
            if (status === window.kakao.maps.services.Status.OK) {
                let result = results[0];
                // 좌표를 객체로 만들어서 
                let center = {
                    lat: result.y,
                    lng: result.x
                }
                //console.log(results);
                //state에 좌표를 업데이트 .
                setMapAddr(center)
               // console.log(mapAddr)
                setMapStatus(true)
                



            }
        })



    }

    const click = (e) => {
        ps.keywordSearch(info1, (result, status) => {
            if (status === window.kakao.maps.services.Status.OK) {
                setInfo(result.place_name)
                console.log (info)
            }
        })

    }
    
    const handleClick = (e) => {
        open({ onComplete: handleComplete })

    }


    return (
        <div>

            <h1>주소검색</h1>
            <input type="text" value={address} placeholder="주소" readOnly />
            <input type="button" onClick={handleClick} value="주소검색" />
            {/* Map 컴포넌트를 사용할 때 초기값으로 위도와 경도를 주지않으면 ,
            다른 좌표를 넣어도 이동이되지않는다 . */}
            {mapStatus && (<Map
                center={mapAddr}
                style={{ width: '400px', height: '400px', }}
                level={3}
            >
                <MapMarker
                    position={mapAddr}
                    onClick={click}
                >{info}</MapMarker>


            </Map>)}


        </div>
    )
}

export default Map4;     