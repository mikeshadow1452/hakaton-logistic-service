package fun.digitallpepper.logistic_service.controller;

import fun.digitallpepper.logistic_service.model.Edge;
import fun.digitallpepper.logistic_service.model.RegionNode;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import fun.digitallpepper.logistic_service.service.impl.RegionNodeService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/graph")
@AllArgsConstructor
public class GraphController {
    private final RegionNodeService regionNodeService;

//    private final RegionNodeService regionNodeService;

    @GetMapping("/create-node/{name}")
    public RegionNode createNode(@PathVariable String name) {
        RegionNode node = regionNodeService.createNode(name);
        return node;
    }
    @PostMapping("/create-node-post")
    public RegionNode createNodePost(@RequestBody NodeRequest name) {
        RegionNode node = regionNodeService.createNode(name.getName());
        return node;
    }




//    @PostMapping("/create-edge")
//    public EdgeRequest createEdge(@RequestBody EdgeRequest edge) {
//        RegionNode node1 = regionNodeService.getRegionNode(String.valueOf(edge.getRegion1()));
//        RegionNode node2 = regionNodeService.getRegionNode(String.valueOf(edge.getRegion2()));
//        Edge edge1 = regionNodeService.createEdge(node1, node2, edge.getWeight());
//        return edge;
//    }

//    @GetMapping("/create-edge/{region1}/{region2}/{weight}")
//    public EdgeRequest createEdge(@PathVariable String region1,
//                                  @PathVariable String region2,
//                                  @PathVariable Long weight
//    ) {
//
//        RegionNode node1 = regionNodeService.getRegionNode(region1);
//        RegionNode node2 = regionNodeService.getRegionNode(region2);
//
//        Edge edge1 = regionNodeService.createEdge(node1, node2, weight);
//        EdgeRequest edge = new EdgeRequest();
//
//        edge.setRegion1(region1);
//        edge.setRegion2(region2);
//        edge.setWeight(weight);
//        return edge;
//    }

    @PostMapping("/create-edge")
    public Edge createEdgePOST(@RequestBody EdgeRequest edgeRequest) {
        RegionNode node1 = regionNodeService.getRegionNode(String.valueOf(edgeRequest.getRegion1()));
        RegionNode node2 = regionNodeService.getRegionNode(String.valueOf(edgeRequest.getRegion2()));
        Edge edge1 = regionNodeService.createEdge(node1, node2, edgeRequest);
        return edge1;
    }


    @GetMapping("/get-all-nodes")
    public List<RegionNode> allNodes() {
        return regionNodeService.getAllNodes();

    }
//
//    @PostMapping("/create-connected-nodes")
//    public Edge createConnectedNodes(@RequestBody ConnectedNodesRequest nodesRequest) {
//
//        return regionNodeService.createConnectedNodes(nodesRequest.getName1(), nodesRequest.getName2(), nodesRequest);
//    }
// todo
//    @GetMapping("/create-connected-nodes/{name1}/{name2}/{weight}")
//    public Edge createConnectedNodes(@PathVariable String name1,
//                                     @PathVariable String name2,
//                                     @PathVariable Long weight
//    ) {
//
//        return regionNodeService.createConnectedNodes(name1, name2, weight);
//    }

    @GetMapping("get-all-edges")
    public List<Edge> getAllEdges() {
        return regionNodeService.getAllEdges();
    }

    @GetMapping("/shortest-path-nodes/{start}/{end}")
    public List<RegionNode> shortestPathNodes(@PathVariable String start, @PathVariable String end) {

        return regionNodeService.findShortestPath(regionNodeService.getRegionNode(start), regionNodeService.getRegionNode(end));

    }
//    @GetMapping("/fasters-path-nodes/{start}/{end}")
//    public List<RegionNode> fastersPathNodes(@PathVariable String start, @PathVariable String end) {
//
//        return regionNodeService.findShortestPath(regionNodeService.getRegionNode(start), regionNodeService.getRegionNode(end));
//
//    }



//    --------------------------------------------------------------------------------------------------------------------------------------------------
//    --------------------------------------------------------------------------------------------------------------------------------------------------
//    --------------------------------------------------------------------------------------------------------------------------------------------------

    @GetMapping("/lightest-path/{start}/{end}")
    public Map<String, Object> lightestPath(@PathVariable String start, @PathVariable String end) {

         Map<List<RegionNode>, Integer> path = regionNodeService.findLightestPathAndWeight(regionNodeService.getRegionNode(start), regionNodeService.getRegionNode(end));

        List<String> nodeNames = new ArrayList<>();
        long totalWeight = 0;

        for (List<RegionNode> nextList : path.keySet()) {
            for (RegionNode next : nextList) {
                nodeNames.add(next.getName());
            }
            totalWeight = path.get(nextList);
            break;
        }

        Map<String, Object> result = new HashMap<>();
        result.put("nodeNames", nodeNames);
        result.put("totalWeight", totalWeight);
        return result;
    }
    @GetMapping("/fastest-path/{start}/{end}")
    public Map<String, Object> fastestPath(@PathVariable String start, @PathVariable String end) {

         Map<List<RegionNode>, Integer> path = regionNodeService.findFastestPathAndWeight(regionNodeService.getRegionNode(start), regionNodeService.getRegionNode(end));

        List<String> nodeNames = new ArrayList<>();
        long totalWeight = 0;

        for (List<RegionNode> nextList : path.keySet()) {
            for (RegionNode next : nextList) {
                nodeNames.add(next.getName());
            }
            totalWeight = path.get(nextList);
            break;
        }

        Map<String, Object> result = new HashMap<>();
        result.put("nodeNames", nodeNames);
        result.put("totalTime", totalWeight);
        return result;
    }
    @GetMapping("/shortest-path/{start}/{end}")
    public Map<String, Object> shortestPath(@PathVariable String start, @PathVariable String end) {

         Map<List<RegionNode>, Integer> path = regionNodeService.findShortestPathAndWeight(regionNodeService.getRegionNode(start), regionNodeService.getRegionNode(end));

        List<String> nodeNames = new ArrayList<>();
        long totalWeight = 0;

        for (List<RegionNode> nextList : path.keySet()) {
            for (RegionNode next : nextList) {
                nodeNames.add(next.getName());
            }
            totalWeight = path.get(nextList);
            break;
        }

        Map<String, Object> result = new HashMap<>();
        result.put("nodeNames", nodeNames);
        result.put("totalTime", totalWeight);
        return result;
    }


}


