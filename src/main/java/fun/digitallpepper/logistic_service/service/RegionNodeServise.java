package fun.digitallpepper.logistic_service.service;

import fun.digitallpepper.logistic_service.model.Edge;
import fun.digitallpepper.logistic_service.model.RegionNode;

import java.util.HashMap;
import java.util.List;

public interface RegionNodeServise {
//    RegionNode addRegionNode(RegionNode node);
    RegionNode createNode(String name);  // Создаёт новую ноду
//    RegionNode createNode(RegionNode node);  // Создаёт новую ноду
    RegionNode getRegionNode(Integer id);
    RegionNode getRegionNode(String name);

    Edge createEdge(RegionNode node1, RegionNode node2, Long weight);  // Создаёт ребро между двумя нодами
    List<RegionNode> getAllNodes();

}
