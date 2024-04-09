package fun.digitallpepper.logistic_service.service;

import fun.digitallpepper.logistic_service.repository.UserSecurity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserSecurity security;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<UserSecurity> user = security.findByUsername(username);
//        if (user.isPresent()) {
//            return user.get();
//        }

        return null;
    }
}
