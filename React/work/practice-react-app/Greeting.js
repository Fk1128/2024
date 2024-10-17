import React from "react";
import { useParams } from "react-router-dom";

function Greeting1(){
    const {languageid} = useParams();

    return(
        <div>
            <h1>browser1{languageid}</h1>


        </div>

    )
}


export default Greeting1
