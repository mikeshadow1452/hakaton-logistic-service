package fun.digitallpepper.logistic_service.service.impl;

import fun.digitallpepper.logistic_service.model.Buyer;
import fun.digitallpepper.logistic_service.service.BuyerServise;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InMymoryBuyerServicr implements BuyerServise {
    @Override
    public Buyer saveBuyer(Buyer buyer) {
        return null;
//        todo сюда кароч бд ёбнуть
    }

    @Override
    public void deleteBuyerById(Long id) {

    }

    @Override
    public void updateBuyer(Buyer buyer) {

    }

    @Override
    public Buyer findBuyerById(Long id) {
        return null;
    }

    @Override
    public List<Buyer> getBuyerOrders(Long buyerId) {
        return null;
    }
}
