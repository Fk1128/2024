// 액션 (Action) :  Store 의 상태를 변경하는 이벤트

//increment,decrement 함수는 각각 액션객체를 반환하는 함수
// 단순히 특정타입 (type) 을 가지는 객체를 반환한다.
// 이 객체는 reducer에서 상태를 변경하기 위한 신호로 사용된다 .
//화살표함수 = () =>{}  return 키워드를 생략할때는 중괄호를 소괄호 안에 넣어준다
// =() =>({})
export const increment = () => ({ 
    type : 'INCREMENT'
})

export const decrement = () => ({
    type : 'DECREMENT'
})