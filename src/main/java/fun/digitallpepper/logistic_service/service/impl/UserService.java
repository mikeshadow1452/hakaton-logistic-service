package fun.digitallpepper.logistic_service.service.impl;

import fun.digitallpepper.logistic_service.model.User;
import fun.digitallpepper.logistic_service.repository.UserRepository;
import fun.digitallpepper.logistic_service.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements UserServise{
    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Override
    public User newUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return repository.save(user);
    }

    public Optional<User> loadByEmail(String email) {
        return Optional.ofNullable(repository.findByEmail(email));
    }

    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByUsername(username);
    }

    public void deleteUser(User user) {
        repository.delete(user);
    }

    public void deleteByUsername(String username) {
        repository.deleteByUsername(username);
    }

    public void deleteByEmail(String email) {
        repository.deleteByEmail(email);
    }


}
