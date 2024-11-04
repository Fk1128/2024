import React, { useEffect, useRef, useState } from "react";
import { View,Text } from 'react-native'
import Button from "./Button";


const Timer = () => {
    const timer = useRef(0);
    const [count , setCount] = useState(0)


    useEffect(() => {
        const interval = setInterval(() => {
            timer.current += 1;
            console.log("Timer :", timer.current)
        }, 1000)

        return () => clearInterval(interval);
    }, [])
   
   
    let num =10 ; 


    return (
        <View>
            <Text>{count}</Text>
            <Text>localNum : {num} </Text>
            <Button
            title ="+"
            onPress={() => setCount(prev=>prev+1)}
            />
        </View>
    )
}
export default Timer;