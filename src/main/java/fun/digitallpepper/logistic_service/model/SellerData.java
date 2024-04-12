package fun.digitallpepper.logistic_service.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

/*
логин (ключ)
почта
телефон
пароль (шифрованный с фронта)
список товаров (сущностями)
пвз
склады
* */
@Entity
@Data
@Table(name = "sellerdata")
public class SellerData {
    @Id
    @GeneratedValue
    private Long id;
    private String companyName;
    @OneToMany
    private List<Product> products;
//    todo мааааакс сделай пжпжпж
//    private List<PickupPoint> pickupPoints;
//    private List<Warehouse> warehouses;

}
