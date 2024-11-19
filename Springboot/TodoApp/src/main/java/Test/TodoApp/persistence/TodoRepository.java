package Test.TodoApp.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import Test.TodoApp.model.TodoEntity;

@Repository
public interface TodoRepository  extends JpaRepository<TodoEntity, Integer>{

	
	@Query("SELECT t FROM TodoEntity t where t.userId= ?1")
	List<TodoEntity> findByUserId(String userId);
}
