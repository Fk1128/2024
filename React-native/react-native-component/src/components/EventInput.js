import React, { useState } from 'react';
import { View, Text, TextInput } from 'react-native';

const EventInput = () => {
    const [text, setText] = useState('');
 //   const _onChange = (e) => setText(e.nativeEvent.text);
    const _onChangeText = e => setText(e) 
    return (
        <View>
            <Text style={{ margin: 10, fontSize: 30 }}>text: {text}</Text>
            <TextInput
                style={{ borderWidth: 1, padding: 10, fontSize: 20 }}
                placeholder="Enter a text..."
             //   onChange={_onChange}
                onChangeText={_onChangeText}
            />
        </View>
    );
};

export default EventInput;