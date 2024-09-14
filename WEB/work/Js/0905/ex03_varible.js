//변수
// 데이터를 담아두기 위한 그릇 .

//변수의 선언
// var : 같은이름의 변수를 다시 선언하는것이 가능
// let : 같은 이름의 변수를 다시 선언하는것이 불가능 , 대입 가능함
// const : 같ㅇ은 이름의 변수 재선언 불가능 , 값을 다시 대입하는것이 불가능 .

var v1 = 100;

var v1 = "Hello";

let i1;
let i2;
//대입
// 선언된 변수에 데이터 넣기
i1 = 100;
i1 = 'abc';
i1 = false;

console.log(i1);

//  let i1 ;   같은이름 변수 재선언 불가능 ;

// const는 초기화만 가능하다.
// 재대입이 불가능 하기 때문이다.
const c = 100; // 상수 

//스코프 (유효범위)
//전역에 선언된 전역변수는 하위 모든곳에서 참조가 가능하다
//지역에 선언된 지역변수는 해당지역과 하위지역에서만 참조가 가능하다 .

//var의 경우 함수안에서만 지역변수가 되는 범위를 가지고 있다 .

// function a() {
//     var variable1 = 1;  // 지역변수 취급이라 밖에서 사용 불가능
// }
// console.log(variable1); //ReferenceError: variable is not defined


if (true) {
    var variable2 = 1;
}

console.log(variable2);


// let 과 const 는 블록레벨 스코프를 가져 모든 코드블록에서 지역변수취급한다 .

// if (true) {
//     let variable3 = 1;
// }
// console.log(variable3) // ReferenceError: variable3 is not defined

// function a(){
//     let l3 = 100 ;
// }
// console.log(l3); // ReferenceError: variable3 is not defined // if 안에 넣으나 함수 안에 넣으나 지역변수 취급이되어 {} 를 벗어나면 사라지게된다 .

// 호이스팅
// 자바스크립트 엔진은 소스코드를 한줄씩 순차적으로 실행하기 전에
// 변수 선언을 포함한 모든 선언문을 찾아내어 먼저 실행한다 .
// 마치 함수안의 선언들을 모두 끌어올려 해당 함수 유효 범위 최상단에 
// 선언된 것과 같은 특징을 호이스팅 이라고한다 .
// 모든 식별자는 호이스팅이 되어 먼저 선언된다 .

// 변수의 호이스팅
// 변수는 크게 '변수 선언' 과 '값 할당'으로 이루어진다.
let a;  // 변수 선언
a = 2401 ; // 값 할당 

// 선언단계
// 변수 이름을 등록해서 자바스크립트 엔진에 의해 변수의 존재를 알린다.
// 초기화단계 
// 값을 저장하기 위한 메모리 공간을 확보하고 암묵적으로 undefined를 할당해 초기화 한다 .

// var로 선언한 변수의 경우 호이스팅 시 undefined로 변수를 초기화까지 해준다 .
console.log(vari); // undefined
var vari = 24;
console.log(vari); // 24;
 
// let 은 선언단계와 초기화 단계가 분리되어 진행된다 .
// 선언단계는 런타임 이전에 변수 선언문에서 이루어진다 .
// 초기화 단계는 런타임 이후에 변수 선언문에서 이루어진다 .

// console.log(asd); // Cannot access 'asd' before initialization // 초기화 전에는 asd를 접근할 수 없다 . 변수가 있다는건 앎 , 초기화가 안되어있음 
let asd; // 여기에서 undefined로 초기화 됨 
console.log(asd);

//const 는 선언과 동시에 초기화해야한다 그렇지않으면 다른 에러가 출력된다 .

// const c;  // 초기화를 하지않아서 에러발생 
console.log(c1); // Cannot access 'c1' before initialization  // 'c1' 이 초기화 되기 전까지 접근할 수 없다 .
const c1 = 1;  

// let과 const는 시작 위치에서 선언해주는것이 좋다 .


//변수에 저장할 수 있는 자료형
// 문자형 , 숫자형 , 논리형
// false로 취급되는 데이터 - false, 0 , null ,'',undefined
// null
// undefined
// 객체 
//