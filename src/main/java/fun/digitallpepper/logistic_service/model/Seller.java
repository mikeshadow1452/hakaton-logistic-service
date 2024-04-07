package fun.digitallpepper.logistic_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

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
//    todo мааааакс сделай пжпжпж

//    private List<Product> products;
//    private List<PickupPoint> pickupPoints;
//    private List<Warehouse> warehouses;

}
