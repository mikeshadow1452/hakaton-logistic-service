package fun.digitallpepper.logistic_service.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Data
@Table(name = "regions")
@NoArgsConstructor
public class RegionNode {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany
//    private LinkedHashSet<Edge> edges;
    private Set<Edge> edges = new LinkedHashSet<>();

    @ManyToMany
    private LinkedHashMap<RegionNode, Edge> connected_regions;

    @Override
    public int hashCode() {
        return Objects.hash(id, name); // исключаем edges
    }
}
