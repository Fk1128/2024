import React from "react";
import { Navigate } from "react-router-dom";


const SocialLogin = (props) => {
    const getUrlParameer = (name) => {
        //window.location.search : URL 에서 쿼리스트링을 가져오는 속성 이클립스 OAuthSuccessHandler 에서 ?뒤 token= 부분을 가져온다 .
        let search = window.location.search;
        let params = new URLSearchParams(search);
        return params.get(name);
    }
    const token = getUrlParameer("token");

    console.log('토큰파싱 :' + token);

    if (token) {
        console.log('로컬 스토리지에 토큰 저장' + token);
        localStorage.setItem("ACCESS_TOKEN", token);
        return (
            //<Navigate/> 페이지를 리다이렉트 할 때 사용하는 컴포넌트이다 .
            <Navigate to={{ pathname: "/", state: { from: props.location } }} />
        )
    } else {
        return(
            <Navigate to ={{pathname : "/" , state : {from: props.location}}}/>
        )
    }




}
export default SocialLogin;

