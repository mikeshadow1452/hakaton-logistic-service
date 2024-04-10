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
    private String name;

    @ManyToMany
    private LinkedHashSet<Edge> edges;

    @OneToMany
    private LinkedHashMap<RegionNode, Edge> connected_regions;

}
