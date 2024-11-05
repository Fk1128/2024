package K1.product.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import K1.product.Model.ProductEntity;

@Repository
public interface ProductRepository  extends JpaRepository<ProductEntity, Integer>{
	
}
