package fun.digitallpepper.logistic_service.service;

import fun.digitallpepper.logistic_service.model.Buyer;

import java.util.List;


public interface BuyerServise {

    Buyer saveBuyer(Buyer buyer);

    void deleteBuyerById(Long id);

    void updateBuyer(Buyer buyer);

    Buyer findBuyerById(Long id);

    List<Buyer> getBuyerOrders(Long buyerId);


//    Buyer findBuyerByEmail(String email);
//

//    Buyer findBuyerByPhoneNumber(String phoneNumber);


}