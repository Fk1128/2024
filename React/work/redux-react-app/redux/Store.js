// 스토어(Store): 애플리케이션의 상태를 저장하는 객체
// Redux에서 스토어를 생성하기 위한 createStore 함수를 import 함
import { createStore } from 'redux';

// 리듀서(reducer)를 import 함. 
// 이 리듀서는 애플리케이션의 상태 변경 로직을 정의한 함수임
import counterReducer from './Reducer';

// createStore 함수를 호출하여 스토어를 생성함
// counterReducer를 스토어에 인자로 전달하여 상태 변경 로직을 정의한다.
// 스토어는 애플리케이션 전체의 상태를 관리하고, 
// 액션이 발생하면 리듀서를 통해 상태를 업데이트함
const store = createStore(counterReducer);

// store 객체를 export하여 애플리케이션에서 사용할 수 있도록 함
export default store;