package fun.digitallpepper.logistic_service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "edges")
public class Edge {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JsonBackReference
    private RegionNode region1;  // Первый регион

    @ManyToOne
    @JsonBackReference
    private RegionNode region2;  // Второй регион

    private Integer weight;//цена - руб
    private Integer distance;//дист - км
    private Integer time;//время - час
    public RegionNode getOtherNode(RegionNode node) {

        if (region1.equals(node)) {
            return region2;
        } else if (region2.equals(node)) {
            return region1;
        }

        return null; // Не должно достигаться, если размер regions = 2
    }
}