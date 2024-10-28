package com.test1.Todo123.persistence;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test1.Todo123.entity.TodoEntity;

@Repository // 데이터 엑세스 계층을 나타내기위해 사용
// 데이터베이스와 상호작용하는 DAO 클래스의 적용한다 . CRUD 작업을 수행하는 메서드를 포함하고있다 .
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
	// 제네릭타입은 관리하는 엔티티와 그 엔티티의 기본타입이다 .
	// JPA 를 사용하여 DB와 상호작용할수있는 기본적인 CRUD 기능을 제공한다 .
	// 사용자 정의 메서드를 추가할 수 있다
// DB에서 사용할 쿼리를  repository 에서 메서드를선언하면 JPA 가 자동으로 쿼리를 생성한다 .

	@Query("SELECT t FROM TodoEntity t where t.userId=?1")
	List<TodoEntity> findByUserIdQuery(String userId);

}
