package fun.digitallpepper.logistic_service.repository;

import fun.digitallpepper.logistic_service.model.BuyerData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerDataRepository extends JpaRepository<BuyerData, Long> {
}
