package fun.digitallpepper.logistic_service.service.impl;



import fun.digitallpepper.logistic_service.model.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import fun.digitallpepper.logistic_service.config.BuyerDetails;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private BuyerService buyerService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Buyer> user = buyerService.findBuyerByLogin(username);

        return user.map(BuyerDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("No user found with username " + username));
    }
}