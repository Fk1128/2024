import React, { useEffect, useState } from "react";
import { call } from "../service/ApiService";
import '../css/styles.css';
import AddProduct from "./AddProduct";
import Orderinfo from "./Order_info";

//jsx 문법
//js 파일내에서 html을 자연스럽게 사용할 수 있도록 해주는 문법 

function P_info() {

    //상품 정보를 가지고있는 useState 생성 .     
    const [items, setItems] = useState([]);


    // AddProduct 컴포넌트를 렌더링하기 위한 state 
    // open의 상태가 true일때는 추가버튼이 활성화 되어있고 setOpen을통해 false로 변환되었을 떄 
    // AddProduct의 컴포넌트가 렌더링 될 수있는 상태변수 생성 .
    const [open, setOpen] = useState(true);

    //내가 클릭한 라디오버튼의 인덱스를 저장하기 위한 state 
    const [selectedIndex, setSelectedIndex] = useState(null);


    // 주문 개수를 저장하는 state 
    const [orderCount, setOrderCount] = useState('');

    // 주문내역 렌더링의 여부를 제어하는 state 
    const [showOrderInfo , setShowOrderInfo]  = useState(false) ;



    //P_info 컴포넌트가 처음 렌더링 될 때 실행 
    useEffect(() => {
        //백엔드에 요청해서 조회 
        call("/product", "GET")
            .then(result => {
                setItems(result.data);
            })

    }, [])


    // 상품 추가 기능 
    const addItem = (item) => {
        call("/product", "POST", item)
            .then(result => setItems(result.data))
    }

    //클릭한 라디오 버튼의 index를 저장하는 함수

    const handleRadioChange = (index) => {
        console.log("클릭한 index : " + index)
        setSelectedIndex(index); //state에 저장
        setOrderCount(''); // 라디오버튼 선택시 주문개수를 초기화
    }
    //주문개수의 값이 변할 때마다 state를 저장하는 함수 
    const handleOrderCountChange = (event) => {
        setOrderCount(event.target.value);
    }
    //주문하기
    const orderProduct = () => {
        //주문하기전에 유효성 검사를 수행
        if (selectedIndex && orderCount > 0 && items[selectedIndex - 1]) {
            //백엔드로 전송할 데이터 
            const orderData = {
                productId: items[selectedIndex - 1].productId,
                productCount: parseInt(orderCount)
            }
            //db에 추가요청을 보내고 
            call("/orders", "POST", orderData)
                //items에 다시 반영
                .then(result => { setItems(result.data) })
        } else {
            alert("상품을 선택하고 개수를 입력해 주세요");
        }
    }





    //상품추가 창 상태변경 함수 
    const onButtonClick = () => {
        setOpen(false);
    }

    // 상품추가버튼
    let addProduct = <button type="button" onClick={onButtonClick}>상품추가</button>

    
    let addButton = addProduct;

    //open이 false가 되면 상품추가창을 연다
    if (!open) {
        addButton = <AddProduct setItems={setItems} setOpen={setOpen} />
    }

    //주문내역 버튼클릭시 호출되는 함수 
    const showOrderDetails = () =>{
        setShowOrderInfo(!showOrderInfo);
    }

    //상품조회
    let productItems = items.length > 0 && (
        <div>
            <table border="`1">
                <thead>
                    <tr>
                        <th>단일 선택</th>
                        <th>주문 개수</th>
                        <th>상품 번호</th>
                        <th>상품 이름</th>
                        <th>상품 재고</th>
                        <th>상품 가격</th>
                        <th>등록 날짜</th>
                        <th>수정 날짜</th>
                    </tr>
                </thead>
                {/* db에서 넘어온 상품들을 출력 */}
                {/* map함수의 특징 index를 설정할 수 있다 . */}
                <thead>
                    {items.map((item, index) => ( // items 배열
                        <tr>
                            <td><input type="radio" name="productId" onChange={() => handleRadioChange(index + 1)}
                                checked={selectedIndex === index + 1} /></td>
                            <td><input type="number"
                                value={selectedIndex === index + 1 ? orderCount : ''} onChange={handleOrderCountChange}
                                readOnly={selectedIndex !== index + 1} /></td>
                            <td>{item.productId}</td>
                            <td>{item.productName}</td>
                            <td>{item.productStock}</td>
                            <td>{item.productPrice}</td>
                            <td>{item.registerDate}</td>
                            <td>{item.updateDate}</td>

                        </tr>
                    ))}
                </thead>
            </table>
            <button onClick={orderProduct}>주문완료</button><button type="button" onClick={showOrderDetails}>주문내역</button>
        </div>
    );
    return (
        <div className="container">
            {addButton}
            {productItems}
            {showOrderInfo&& <Orderinfo/>} {/* showOrderInfo 가 참일떄 Orderinfo를 렌더링*/}
        </div>
    )



}
export default P_info;