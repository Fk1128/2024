import React, { useState, useEffect } from "react";


function A4() {
    const [value1, setvalue1] = useState("")
    const [value2, setvalue2] = useState("")
    const [res, setres] = useState("")
    //const [op,setop] = useState([plus,minus,divi,mut])



    const reset = () => {
        setvalue1("");
        setvalue2("");
    }

    const plus = (e) => {
        setres(value1 + value2)
        reset();


    }
    const minus = (e) => {
        setres(value1 - value2)
        reset();

    }

    const divi = (e) => {
        setres(value1 * value2)
        reset();


    }
    const mut = (e) => {
        setres(value1 / value2)
        reset();
    }


    const inputHandler1 = (e) => {
        setvalue1(Number(e.target.value));
        setres("");
    }
    const inputHandler2 = (e) => {
        setvalue2(Number(e.target.value));
        setres("");
    }



    return (
        <div>
            <h1> {res} </h1>
            <input onChange={inputHandler1} type="number" value={value1} />
            <input onChange={inputHandler2} type="number" value={value2} />
            <div>
                {/* <button onClick={plus}> +</button>
                <br></br>
                <button onClick={minus}> -</button>
                <br></br>
                <button onClick={divi}>*</button>
                <br></br>
                <button onClick={mut}>÷</button>
                <br></br>
                <button onClick={mut}> =</button>
                <br></br> */}
                <button>7</button>
                <button>8</button>
                <button>9</button>
                <button onClick={divi}>  *</button>
                <br></br>
                <button>4</button>
                <button>5</button>
                <button>6</button>
                <button onClick={minus}> -</button>
                <br></br>
                <button>1</button>
                <button>2</button>
                <button>3</button>
                <button onClick={plus}> +</button>
                <br></br>
                <button>||</button>
                <button>0</button>
                <button>.</button>
                <button onClick={mut}>÷</button>


            </div>

        </div>
    )


}
export default A4;

