package fun.digitallpepper.logistic_service.service;

import fun.digitallpepper.logistic_service.config.MyUserDetails;
import fun.digitallpepper.logistic_service.model.MyUserSecurity;
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
    private UserSecurity user;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyUserSecurity> user = this.user.findByName(username);


        return user.map(MyUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("No user found with username " + username));
    }
}
