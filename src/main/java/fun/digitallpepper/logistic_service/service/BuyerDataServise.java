package fun.digitallpepper.logistic_service.service;

import fun.digitallpepper.logistic_service.model.BuyerData;
import fun.digitallpepper.logistic_service.model.User;

public interface BuyerDataServise {
    BuyerData newData(BuyerData data);
    BuyerData loadByUser(User user);

}
