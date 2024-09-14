// 조건문
// 조건에 따라 컴퓨터가 어떻게 행동해야하는지 명령을 결정하는 문법이다 .

//자바에서 조건식에 넣었던것 .
// 비교연산자 , 논리연산자 
// 0,null,'',undefined -> 모두 false로 인식 
// 그 이외의 값은 true로 인식
//if(조건식) { 
//수행할 명령 
//}

if (3) {
    console.log('실행문 출력 ')
}

//if(){
// } else{
// }
// if(){
// }else if() {     
// }else

var a = 3;
var string;
switch (a) {
    case 1:
        string = '1선택'
        break;
    case 2:
        string = '2선택'
        break;
    case 3:
        string = '3선택'
        break;
}    

console.log(string);