document.addEventListener("DOMContentLoaded", function (e) {
    let input = document.querySelector("#input");
    input.addEventListener("click", function (e) {
        //console.log(e.target.getAttribute("type"))

        //e.target의 Attribute type을 text로 변경
        //e.target.setAttribute("type","text")

        //속성값 토글
        if (e.target.getAttribute("type") === "button") {
            e.target.setAttribute("type", "text");
        }
    })

    //keydown은 포커스가 사라지지 않아서 바뀌지 않는다 .
    // 포커스가 입력창 내부에 있기 떄문에 텍스트의 입력이 
    //끝나지않았다고 판단되어 작업을 수행하지않는다 .
    input.addEventListener("change", function (e) {

        e.target.setAttribute("type", "button");
    })
})

