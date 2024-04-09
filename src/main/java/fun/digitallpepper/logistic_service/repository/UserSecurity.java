package fun.digitallpepper.logistic_service.repository;

import fun.digitallpepper.logistic_service.model.MyUserSecurity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserSecurity extends JpaRepository<MyUserSecurity, Long> {

Optional<MyUserSecurity> findByName(String username);
}
