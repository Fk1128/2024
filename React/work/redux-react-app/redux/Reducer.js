// 리듀서(Reducer): 액션에 따라 상태를 변경하는 순수 함수
// 리듀서의 기본구조
// 현재상태(state)와 액션(action) 두가지 인자를 가지는 함수이다.
//1. 현재상태(state)
// 리듀서가 관리하는 현재상태
// 리듀서가 처음 호출될 때 초기상태가 설정된다 .
//2. 액션 (action) 
// 상태를 변경할 이벤트, 액션 객체는 최소한 type 속성을 가지며 , 상태를어떻게
// 변경할지 리듀서에게 알려준다 .

// 초기 상태(initialState)를 정의함.
// count는 0으로 초기화됨.
const initialState = {
    count: 0,
};

// counterReducer는 현재상태(state) 와 액션(action) 을 인자로 받아 새로운 상태를 반환하는 함수이다.

//state 가 undefined일 경우 initialState를 기본값으로 사용함

const counterReducer = (state = initialState, action) => { // counterReducer이름의 리듀서  정의 
    //액션의 타입에 따라 상태를 변경하기 위한 switch 문을 사용함

    switch (action.type) { // 'INCREMENT' 액션일경우 count 값을 1증가시킨 새로운 상태를 반환
        case 'INCREMENT':
            return {
                ...state, // 스프레드 연산자를통해 initialState객체에 모든 속성을 얕게 복사한다 .
                        // initialState 의 값에대해서는 불변성 유지가된다 . 
                count: state.count + 1,
            }; 
        case 'DECREMENT': // 'DECREMENT' 액션일경우 count 값을 1감소시킨 새로운 상태를 반환
            return {
                ...state,
                count: state.count - 1,
            };
        default:    //액션 타입이 매칭되지 않을경우 현재상태 그대로 반환
            return state;
    }
}
  
  export default counterReducer;