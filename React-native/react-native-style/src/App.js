import React from 'react';
import { StyleSheet, View, Text } from 'react-native';
import { viewStyles,textStyles } from './styles';
import { Contents, Footer, Header } from './Component/Layout';
import FlexDirectionTest from './Component/FlexDirection';
const App = () => {
  return (
    <View style= {viewStyles.container}>
    {/* <Header/>
    <Contents/>
    <Footer/> */}
    <FlexDirectionTest/>
    </View>
  );
};



export default App;