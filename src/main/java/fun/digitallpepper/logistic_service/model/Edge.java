package fun.digitallpepper.logistic_service.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.LinkedHashSet;

@Entity
@Data
@Table(name = "edges")
public class Edge {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private RegionNode region1;  // Первый регион

    @ManyToOne
    private RegionNode region2;  // Второй регион

    private Long weight;

    public RegionNode getOtherNode(RegionNode node) {

        if (region1.equals(node)) {
            return region2;
        } else if (region2.equals(node)) {
            return region1;
        }

        return null; // Не должно достигаться, если размер regions = 2
    }
}