package fun.digitallpepper.logistic_service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.HashMap;

@Data
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime date;
    private Double price;

    @ElementCollection
    @MapKeyColumn(name = "id", table = "products")
    private HashMap<Product, Long> products;
    private OrderStatusEnum status;
//    TODO: Сделать пвз и склады
//    private ... where;
//    private ... from;
}
