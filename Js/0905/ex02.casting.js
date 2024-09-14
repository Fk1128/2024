//타입캐스팅
//데이터 타입의 종류를 바꾸는 행위 
//String()

console.log(String(3)+1+2+3+4+5); // 숫자 3을 string으로 타입을 바꾸었기 때문에  312345 가 출력이된다 
console.log(typeof(String(3))) ; //typeof() : ()안에 적힌 데이터의 데이터 타입에대해 조회를 할 수 있다 .


//Number()
console.log(Number("3")+1+2+3+4+5); // 4
console.log(Number(false)); // 0
console.log(Number("abc")); // NaN : Not a Number 

//Bolean()
console.log(Boolean(0)); // false 
console.log(Boolean(NaN)) ; // false
console.log(Boolean(3)); // 1보다 크면 true 로 바뀐다 .
console.log(Boolean("a")); // 문자열을 기입해도 true로 나온다 
console.log(Boolean("false")); // false여도 문자열이기 떄문에 true출력 

//인덱싱과 슬라이싱
// index : 0부터 순차적으로 증가하는 정수값 .
// 인덱싱은 데이터를 분석하여 우리가 원하는 순서에 위치한 데이터를 뽑는것 .
console.log("abcde"[2]); // 0 1 2 번째에 있는 c 출력 

//여러개의 값으로 자르고 싶다면 slice 메서드를 이용할 수 있다 .

console.log("abcdefgh".slice(1,4));