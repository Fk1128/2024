package com.korea.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.korea.product.entity.OrderEntity;
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,Integer  > {

	
	//총 결제금액 
	// 상품 가격 * 주문수량
	@Query("select o.orderId," // 상품번호
			+ "o.product.productName," // 상품이름 
			+ "o.productCount, " // 주문 개수 
			+ "o.product.productPrice," // 상품 가격 
			+ "(o.product.productPrice * o.productCount) As totalPrice, " // 결제금액
			+ "o.orderDate " // 주문날짜 
			+ "from OrderEntity o ")
	List<Object[]> findAllOrderTotalPrices() ;

}
