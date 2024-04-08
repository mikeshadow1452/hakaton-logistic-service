package fun.digitallpepper.logistic_service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime date;
    private String name;
    private Double price;
    private String description;
    private String imagePath;
    @OneToOne
    @JoinColumn(name = "id", table = "sellers")
    private Seller seller;
}
