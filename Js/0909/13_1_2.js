function red(e){
    console.log(e);
    //e.target을 사용하면 쿼리셀렉터 없이 이벤트를 적용할 대상을 고를 수 있다.
    e.target.style.backgroundColor = 'red'
}
function blue(e){
    e.target.style.backgroundColor = 'blue'
}