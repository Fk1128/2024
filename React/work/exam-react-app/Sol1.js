import React ,{useState} from 'react'

function Sol1(){

    const [food,SetFood] = useState(['']);
    const [value,SetValue] = useState("") ;


    

    const inputHandler = (e) => {
        SetValue(e.target.value);
    }
    const clickHandler = () => {
        SetFood ([...food,value])
        SetValue("");
    }
  
    return(
        <div>
            <input onChange={inputHandler} value={value}/>
            <button onClick={clickHandler}>추가</button>
            <ul>
                {food.map(item => <li>{item}</li>)}
            </ul>
        </div>

    )





}
export default Sol1;