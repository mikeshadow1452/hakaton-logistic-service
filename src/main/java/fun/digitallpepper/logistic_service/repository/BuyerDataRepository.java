package fun.digitallpepper.logistic_service.repository;

import fun.digitallpepper.logistic_service.model.BuyerData;
import fun.digitallpepper.logistic_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerDataRepository extends JpaRepository<BuyerData, Long> {
    BuyerData getBuyerDataByUser(User user);
}
