package fun.digitallpepper.logistic_service.repository;

import fun.digitallpepper.logistic_service.model.SellerData;
import fun.digitallpepper.logistic_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerDataRepository extends JpaRepository<SellerData, Long> {
    SellerData getSellerDataByUser(User user);
}
