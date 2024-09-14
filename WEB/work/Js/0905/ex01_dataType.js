//데이터 타입
// 1. NUMBER 정수 , 실수
// 2. String 문자 작은따옴표, 큰따옴표 둘 다 사용가능
// 3. Boolean 참과 거짓을 표현(true , false)
// 4. undifined 변수에 값이 설정이 안되어있을 때


// 1. 문자열의 길이 
console.log('text'.length);

// 2. 문자열이 특정 문자로 시작하는지 검사
console.log('text'.startsWith('te'));
console.log('text'.startsWith('xt'));

// 2. 문자열이 특정 문자로 끝나는지 검사
console.log('text'.endsWith('te'));
console.log('text'.endsWith('xt'));

// 3. 특정문자의 index 위치 찾기
console.log('text'.indexOf('x'));
console.log('text'.indexOf('a'));

// 4. 특정 문자열의 반복
console.log('abc'.repeat(3));

// 5. 문자열을 다른 문자열로 대체
console.log('hello world'.replace('hello','bye')) ;

// 6. 문자열을 특정문자를 기준으로 잘라서 저장
console.log('avcabcdabcde'.split('a'));

// 7. 대문자로 바꾸기
console.log('abc'.toUpperCase());

// 8. 소문자로 바꾸기
console.log('abc'.toLowerCase());

// Boolean(불리언)
// 참과 거짓을 표현하기 위해 사용
// true -> 1
// false -> 0
console.log(true+1); // true =  1 반환후 +1 출력  = 2 
console.log(false+1); // false =0 +1 = 1 ;

//undefined
//데이터가 입력될 수 있는 공간임에도 불구하고 비어있다 .
let i; //let 은 지금부터 변수를 만들겠다 라는 의미이다 var,const 도 비슷한 기능을 한다 .
// 위 코드는 i라는 이름을 가진 변수를 만든다는 의미가 된다 .
// 이렇게 변수를 만드는 행위를 선언이라고 한다 .
console.log(i); // undefined
i= 3 ;
console.log(i) ;


