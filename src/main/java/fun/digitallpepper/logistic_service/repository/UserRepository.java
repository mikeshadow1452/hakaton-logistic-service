package fun.digitallpepper.logistic_service.repository;

import fun.digitallpepper.logistic_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByEmail(String email);
    void deleteByUsername(String username);
    void deleteByEmail(String email);

}
