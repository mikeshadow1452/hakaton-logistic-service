package fun.digitallpepper.logistic_service.model;
/*
- логин (ключ)
- пароль (шифрованный с фронта)
- почта
- телефон
- Корзина
- массив с историями заказов (заказы тож сущностями)
- логин сессия (ну так, если времени хватит, хых)

*/

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data

@Entity
@Table(name = "buyers")
public class Buyer {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String login;
    private String email;
    private String phone;
    private String password;
//    private Cart cart;
//    private Order[] orderHistory;
//    private String sessionLogin;
}
