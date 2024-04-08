package fun.digitallpepper.logistic_service.service.impl;

import fun.digitallpepper.logistic_service.model.Buyer;
import fun.digitallpepper.logistic_service.repository.BuyerRepository;
import fun.digitallpepper.logistic_service.service.BuyerServise;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
@Primary
public class BuyerService implements BuyerServise {
    private final BuyerRepository repository;

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
}
