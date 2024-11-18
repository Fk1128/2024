package practice.test1.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practice.test1.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, String>{
	User findByuserName(String userName) ; // 아이디 통해 entity 반환
	boolean existByuserName(String userName) ; // 아이디가 존재하면 true , 존재하지 않으면false 반환 id중복체크?
	
	User findByuserNameAndPassword (String userName,String password) ;
//	 userName , password를 통해 두필드를 모두 만족하는 데이터를 찾는 조건의쿼리생성.
	// 'findBy' 접두사는 조회쿼리를 생성해라 라는 의미이다 .
	

}
