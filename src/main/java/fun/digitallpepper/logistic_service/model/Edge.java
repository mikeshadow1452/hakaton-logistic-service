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

    @ManyToMany
    private LinkedHashSet<RegionNode> Regions;
}
