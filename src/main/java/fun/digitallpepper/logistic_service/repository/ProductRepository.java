package fun.digitallpepper.logistic_service.repository;

import fun.digitallpepper.logistic_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
