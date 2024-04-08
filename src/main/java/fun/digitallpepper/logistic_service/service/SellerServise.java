package fun.digitallpepper.logistic_service.service;

import fun.digitallpepper.logistic_service.model.Seller;

import java.util.List;

public interface SellerServise {

    Seller saveSeller(Seller seller);


    void deleteSellerById(Long id);

    void updateSeller(Seller seller);

    Seller findSellerById(Long id);

    List<Seller> findAllSellers();


}
