import React from 'react' ;
import {useState} from 'react' ;
import { call } from '../service/ApiService';


function AddProduct(props) {
    //상품 정보를 저장할수 있는 state
    const [product,setProduct] = useState({productName : "", productStock:0,productPrice:0});

    let setItems = props.setItems;

    const {productName,productStock,productPrice} = product ;

    

    const onChange = (e) => { // 구조분해 할당 .
        const {value , name} = e.target //우선 e.target에서 name 과 value를 추출
        setProduct({
            ...product, // 기존의 input 객체 복사
            [name] : value // name 키를 가진값을 value로 설정 
        })
    }
    
    //등록버튼을 눌렀을 때 input 태그에 정보를 boot를 보낸다 .

    const onButtonClick = () => {
        console.log("전송정보 : " + product)
        call("/product","POST",product)
        .then(result => {setItems(result.data)})
        //입력필드 초기화
        setProduct({productName : "", productStock:0,productPrice:0})
        //입력창 닫기 
        props.setOpen(true) ;
    }

    // const onButtonClick = () => {
    //     console.log(product) ;
    //     addItem(product);
    //     resetFields() ;
    //     setOpen(true) ;
    // }
    
    //입력 필드 초기화 함수 
    const resetFields = () => {
        setProduct({ productName : "" ,productStock : "", productPrice: "" })
    }




    return(
        <div className="register-wrap" style={{width:'500px'}}>
			<div><input style={{width: '98%'}} value={productName} onChange={onChange} name='productName' placeholder='상품 이름'/></div>
			<div><input style={{width: '98%'}} value={productStock} onChange={onChange} name='productStock' placeholder='상품 재고'/></div>
			<div><input style={{width: '98%'}} value={productPrice} onChange={onChange} name='productPrice' placeholder='상품 가격'/></div>
			<input type="button" value="등록" onClick={onButtonClick} style={{width:'100%'}} />
		</div>
    )


}
export default AddProduct;