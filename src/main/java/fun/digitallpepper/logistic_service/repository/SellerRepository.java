package fun.digitallpepper.logistic_service.repository;

import fun.digitallpepper.logistic_service.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {

//    Optional<MyUserSecurity> findByLogin(String username);

}
