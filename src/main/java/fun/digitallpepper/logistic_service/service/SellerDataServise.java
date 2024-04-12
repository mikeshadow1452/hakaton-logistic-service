package fun.digitallpepper.logistic_service.service;

import fun.digitallpepper.logistic_service.model.SellerData;
import fun.digitallpepper.logistic_service.model.User;

public interface SellerDataServise {
    SellerData newData(SellerData data);
    SellerData loadByUser(User user);

}
