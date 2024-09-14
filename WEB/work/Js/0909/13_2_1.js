document.addEventListener("DOMContentLoaded", function(e){
    let button = document.querySelector("input")
    let p = document.querySelector("p");

    button.addEventListener("click", function(e){
        // p태그에 들어있는 내용을 수정
        // textContent : 태그에 들어있는 Content 의 내용을 반환하는구나 
      // console.log (p.textContent)
       p.textContent = "JS로 입력함";


    })
})