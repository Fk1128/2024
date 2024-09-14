//산술연산자
let l1 = 10 ;
let l2 = 7; 
console.log(l1+l2) ; // 더한값 
console.log(l1-l2) ; // 뺀값
console.log(l1*l2) ; // 곱한값
console.log(l1/l2) ; // 몫
console.log(l1%l2) ; // 나머지 


// 대입연산자 ( = )
// 데이터를 변수에 저장할 떄 사용

let A = 3;
let B = A;
console.log('B : ' + B);

//복합대입 연산자
A += B // A = A + B ;
A *= B // A = A * B ;
 
//증감연산자\
// 증가연산자 - 숫자형 데이터를 1씩 증가
// ++변수 또는 변수++
A++;
console.log(A);
// 감소 연산자 - 숫자형 데이터를 1씩 감소
// --변수 또는 변수--

var a= 5;
var b = ++a;
console.log(b); // 6 선행증감이기에 1+5 값 출력 
var b = a++;
console.log(b); // 6 후행증감이기에 b 에는 a값 6이 대입되고 그 다음 a값이 1증가하여 6;


//비교연산자
//크다 ,작다 , 크거나같다, 작거나같다 , 같다 , 같지않다 .
var a= 10 ;
var b= 7 ;

console.log(a>b) ; // true
// 같다를 비교할 때 
console.log('== : ' + (10 == "10 ")); // true  // 값이 일치하면 true
console.log('=== : ' + (10 === "10")); // false //  값과 데이터타입이 일치할때 true

console.log('!= : ' + (10 != "10 ")); 
console.log('!== : ' + (10 !== "10 ")); 


//논리연산자
// && 
// ||
// !

console.log (true && true);
console.log(true || false) ;
console.log(!true);