import React from 'react';
import { ScrollView, View, Text, StyleSheet, Button } from 'react-native';
import MyButton from './components/MyComponent';
import Counter from './components/Counter';
import EventButton from './components/EventButton';
import EventInput from './components/EventInput';
import PressableButton from './components/Pressable';
export default function App() {
  return (
    <View
      style={{
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center'
      }}
    >
      {/* <Text style={{ fontSize: 30, marginBottom: 10 }}>Props</Text>
      <MyButton title="Button" onPress={() => alert('props')} />
      <MyButton title="Button" onPress={() => alert('children')}> Children Props</MyButton>
      <MyButton onPress={() => alert('default')} />          Mybutton 
      <Counter />
      <EventButton />
      <EventInput /> */}
      <PressableButton title ="button"/>
    </View>
  );
}

