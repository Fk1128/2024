import React from 'react';
import Child from './Child';

function Parent() {
  return <Child/>;
}

//child컴포넌트에서 받아서 다시 GrandChild 컴포넌트로 전달
//GrandChild 컴포넌트에서 이름과 나이 출력하기

export default Parent;