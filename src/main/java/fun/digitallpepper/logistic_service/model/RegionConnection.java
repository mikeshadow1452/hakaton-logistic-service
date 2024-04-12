package fun.digitallpepper.logistic_service.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "region_connections")
public class RegionConnection {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private RegionNode region1;

    @ManyToOne
    private RegionNode region2;

    @OneToOne
    private Edge edge;
}