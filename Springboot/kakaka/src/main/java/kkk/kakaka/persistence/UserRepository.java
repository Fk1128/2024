package kkk.kakaka.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kkk.kakaka.entity.UserEntity;

@Repository
public interface UserRepository  extends JpaRepository<UserEntity,String >{
	UserEntity findByUserName(String userName) ;
	//Username 의 값으로 userEntity를 찾아 반환한다 .
	Boolean existsByUserName(String userName);
	//해당 userName의 존재유무로 true,false 반환 
	UserEntity findByUserNameAndPassword(String userName,String password ) ;
	// userName과Passwor를 기준으로 UserEntity를 조회하늠ㄴ 메서드
	// And가 사용되었으므로 , 두 필드를 모두 만족하는 데이터를 찾는 조건의 쿼리가 자동 생성되었다 .
	
}
