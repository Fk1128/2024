//button을 눌렀을 때 img 태그의 이미지를 변경하기
//profile.jpg -> hi 1. jpg _> hl 2. jpg - profile.jpg
//이미지가 나오는 원리 : <img src ="이미지경로">
// 버튼을 눌렀을 때 ("click")
//img태그의 정보를 변수에 저장한다 .
// 변수에서 src의 값을 setAttribute()를 통해서 변경한다 ., 


document.addEventListener("DOMContentLoaded",
    function(e){
        // input 태그에 관한 정보가 변수 button에 담김
        let button = document.querySelector("input")
        let image = document.querySelector("img")
        let img1 = "image/profile.jpg"
        let img2 = "image/hl1.jpg"
        let img3 = "image/hl2.jpg"
        button.addEventListener("click",function(e){
            // 버튼이 눌리는 이벤트발생시  img 태그의 src를 수정해야함 
            let src = image.getAttribute("src"); // img태그의 src 속성의값을 변수에 저장 
            if(src === img1){
                image.setAttribute("src",img2)
            }else if(src === img2){
                image.setAttribute("src",img3)
            }else 
                image.setAttribute("src",img1)

        })
    })

