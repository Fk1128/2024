import React from "react";
import { Pressable, Text ,TouchableOpacity } from "react-native";
import PropTypes from "prop-types";
function MyButton(props){



    MyButton.propTypes = {
        title: PropTypes.string.isRequired,
        onPress : PropTypes.func.isRequired
    }


    return(
        <TouchableOpacity
            style={{
                backgroundColor: '#3498db',
                padding: 16,
                margin: 10,
                borderRadius: 8,
            }}
            onPress={()=> props.onPress()}
            >
            <Text style={{color: 'white', fontSize : 24}}>{props.children || props.title}</Text>
        </TouchableOpacity>
    )
}

export default MyButton;