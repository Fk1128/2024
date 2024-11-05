import React from "react";
import styled from "styled-components/native";
import User from "./components/Consumer";
import UserContext from "./context/User";

const Container = styled.View`
flex :1;
background-color: #ffffff;
justify-content : center;
align-items: center;
`

const App = () => {
    return (
        <UserContext.Provider value={{name: 'ReactNative'}}>
            <Container>
                <User />
            </Container>
        </UserContext.Provider>
    )
}

export default App;
