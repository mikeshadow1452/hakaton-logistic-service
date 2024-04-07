package fun.digitallpepper.logistic_service.service.impl;

import fun.digitallpepper.logistic_service.model.Buyer;
import fun.digitallpepper.logistic_service.model.Seller;
import fun.digitallpepper.logistic_service.repositpry.SellerRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class SellerService implements fun.digitallpepper.logistic_service.service.SellerService {

    private final SellerRepository repository;

    @Override
    public Seller saveSeller(Seller seller) {
        return repository.save(seller);
    }

    @Override
    public void deleteSellerById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void updateSeller(Seller seller) {
        repository.save(seller);
    }

    @Override
    public Seller findSellerById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Seller> findAllSellers() {
        return repository.findAll();
    }


}
