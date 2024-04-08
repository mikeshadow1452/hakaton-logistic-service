package fun.digitallpepper.logistic_service.repository;

import fun.digitallpepper.logistic_service.model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Buyer, Long> {

}
