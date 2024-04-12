package fun.digitallpepper.logistic_service.service.impl;

import fun.digitallpepper.logistic_service.model.BuyerData;
import fun.digitallpepper.logistic_service.model.User;
import fun.digitallpepper.logistic_service.repository.BuyerDataRepository;
import fun.digitallpepper.logistic_service.service.BuyerDataServise;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BuyerDataService implements BuyerDataServise {
    BuyerDataRepository repository;
    @Override
    public BuyerData newData(BuyerData data) {
        return repository.save(data);
    }

    @Override
    public BuyerData loadByUser(User user) {
        return repository.getBuyerDataByUser(user);
    }
}
