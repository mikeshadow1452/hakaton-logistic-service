package fun.digitallpepper.logistic_service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

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
@Table(name = "sellers")
public class Seller {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String login;
    private String companyName;
    private String email;
    private String phone;
    private String password;
    @OneToMany
    private ArrayList<Product> products;
//    todo мааааакс сделай пжпжпж
//    private List<PickupPoint> pickupPoints;
//    private List<Warehouse> warehouses;

}
