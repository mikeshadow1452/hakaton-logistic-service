package fun.digitallpepper.logistic_service.service.impl;

import fun.digitallpepper.logistic_service.config.BuyerDetails;
import fun.digitallpepper.logistic_service.model.Buyer;
import fun.digitallpepper.logistic_service.repository.BuyerRepository;
import fun.digitallpepper.logistic_service.service.BuyerServise;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
@Primary
public class BuyerService implements BuyerServise, UserDetailsService {
    private final BuyerRepository repository;

    @Autowired
    private BuyerServise user;


    @Override
    public Buyer saveBuyer(Buyer buyer) {
        return repository.save(buyer);
    }

    @Override
    public void deleteBuyerById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void updateBuyer(Buyer buyer) {
        repository.save(buyer);
    }

    @Override
    public Buyer findBuyerById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Buyer> getBuyerOrders(Long buyerId) {
        return null; // TODO: Implement this method
    }

    @Override
    public Optional<Buyer> findBuyerByLogin(String login) {
        return
                repository.findByLogin(login);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Buyer> user = this.user.findBuyerByLogin(username);

        return user.map(BuyerDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("No user found with username " + username));
    }
}
