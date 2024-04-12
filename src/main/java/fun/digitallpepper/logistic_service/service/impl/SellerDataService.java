package fun.digitallpepper.logistic_service.service.impl;

import fun.digitallpepper.logistic_service.model.SellerData;
import fun.digitallpepper.logistic_service.model.User;
import fun.digitallpepper.logistic_service.repository.SellerDataRepository;
import fun.digitallpepper.logistic_service.service.SellerDataServise;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SellerDataService implements SellerDataServise {
    SellerDataRepository repository;
    @Override
    public SellerData newData(SellerData data) {
        return repository.save(data);
    }

    @Override
    public SellerData loadByUser(User user) {
        return repository.getSellerDataByUser(user);
    }
}
