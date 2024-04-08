package fun.digitallpepper.logistic_service.repository;

import fun.digitallpepper.logistic_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
