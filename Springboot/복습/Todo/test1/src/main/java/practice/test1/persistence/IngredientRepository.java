package practice.test1.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practice.test1.model.Ingredients;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredients, Integer>{
	@Query("SELECT t FROM Ingredients t where t.id=?1")
	List<Ingredients> findByIngredientsId(Integer id) ;

}
