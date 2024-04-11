package fun.digitallpepper.logistic_service.controller;

import fun.digitallpepper.logistic_service.model.Edge;
import fun.digitallpepper.logistic_service.model.RegionNode;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import fun.digitallpepper.logistic_service.service.impl.RegionNodeService;

import java.util.List;

@RestController
@RequestMapping("/api/graph")
@AllArgsConstructor
public class GraphController {
    private final RegionNodeService regionNodeService;
//    private final RegionNodeService regionNodeService;

    @PostMapping("/create-node/{name}")
    public RegionNode createNode(@PathVariable String name) {
        return regionNodeService.createNode(name);
//        todo
    }

    @PostMapping("/create-edge")
    public Edge createEdge(@RequestBody Edge edge) {

        RegionNode node1 = regionNodeService.getRegionNode(String.valueOf(edge.getRegion1()));
        RegionNode node2 = regionNodeService.getRegionNode(String.valueOf(edge.getRegion2()));

        return regionNodeService.createEdge(node1, node2,edge.getWeight());
    }


    @GetMapping("/get-all-nodes")
    public List<RegionNode> allNodes(){
        return regionNodeService.getAllNodes();

    }

    @PostMapping("/create-connected-nodes")
    public Edge createConnectedNodes(@RequestBody ConnectedNodesRequest nodesRequest) {

        return regionNodeService.createConnectedNodes(nodesRequest.getName1(),nodesRequest.getName2(),nodesRequest.getWeight());
    }


} 