package fun.digitallpepper.logistic_service.service;

import fun.digitallpepper.logistic_service.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserServise extends UserDetailsService {
    User newUser(User user);
    Optional<User> loadByEmail(String email);
    void deleteUser(User user);
    void deleteByUsername(String username);
    void deleteByEmail(String email);
}
