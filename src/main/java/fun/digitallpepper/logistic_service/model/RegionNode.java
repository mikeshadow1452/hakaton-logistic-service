package fun.digitallpepper.logistic_service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

@Entity
@Data
@Table(name = "regions")
public class RegionNode {
    @Id
    private Long id;

    private String name;

    @ManyToMany
    private LinkedHashSet<Edge> edges;

    @ManyToMany
    private LinkedHashMap<RegionNode, Edge> connected_regions;

}
