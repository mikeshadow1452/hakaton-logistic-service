package fun.digitallpepper.logistic_service.model;


import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Data
@Entity
@Table(name = "buyerdata")
public class BuyerData {
    @Id
    @GeneratedValue
    private Long id;
//    private Cart cart;
    @OneToMany
    private List<Order> orderHistory;
}
