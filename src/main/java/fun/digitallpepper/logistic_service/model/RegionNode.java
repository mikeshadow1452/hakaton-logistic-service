package fun.digitallpepper.logistic_service.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

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

    @JsonManagedReference
    private Set<Edge> edges = new LinkedHashSet<>();

    //    @ManyToMany
//    @JsonIgnore
////    private Map<RegionNode, Edge> connected_regions;
//    private Map<RegionNode, Edge> connected_regions = new HashMap<>(); // Инициализируем Map
    @OneToMany(mappedBy = "region1")
    @JsonIgnore
    private Set<RegionConnection> connections;


    @Override
    public int hashCode() {
        return Objects.hash(id, name); // исключаем edges
    }

    // Метод для добавления связанного региона
//    public void addConnectedRegion(RegionNode region, Edge edge) {
//        connected_regions.put(region, edge);
//    }

}
