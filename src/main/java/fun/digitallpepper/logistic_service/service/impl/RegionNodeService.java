package fun.digitallpepper.logistic_service.service.impl;

import fun.digitallpepper.logistic_service.model.Edge;
import fun.digitallpepper.logistic_service.model.RegionNode;
import fun.digitallpepper.logistic_service.repository.EdgeRepository;
import fun.digitallpepper.logistic_service.repository.RegionRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@AllArgsConstructor
@Primary
public class RegionNodeService implements fun.digitallpepper.logistic_service.service.RegionNodeServise {

    private final RegionRepository repository;
    private final EdgeRepository edgeRepository;

//    @Override
//    public Edge createEdge(RegionNode node1, RegionNode node2, Long weight) {
//        Edge edge = new Edge();
//        edge.setWeight(weight);
//        edge.setRegion1(node1);
//        edge.setRegion2(node2);
//
//        node1.getEdges().add(edge);
//        node2.getEdges().add(edge);
//
//        repository.save(node1); // Сохраняем изменения в нодах
//        repository.save(node2);
//        return edgeRepository.save(edge);
//    }

    @Override
    public Edge createEdge(RegionNode node1, RegionNode node2, Long weight) {
        Edge edge = new Edge();
        edge.setWeight(weight);
        edge.setRegion1(node1);
        edge.setRegion2(node2);

        edge = edgeRepository.save(edge); // Сохраняем ребро перед добавлением к регионам

        node1.getEdges().add(edge);
        node2.getEdges().add(edge);

        repository.save(node1); // Сохраняем изменения в нодах
        repository.save(node2);
        return edge;
    }

    @Override
    public List<RegionNode> getAllNodes() {
        return repository.findAll();
    }

    public List<RegionNode> findShortestPath(RegionNode source, RegionNode target) {
        // 1. Инициализация
        Map<RegionNode, Long> distances = new HashMap<>(); // Расстояния до вершин
        Map<RegionNode, RegionNode> previous = new HashMap<>(); // Предыдущие вершины на пути
        Set<RegionNode> visited = new HashSet<>(); // Посещенные вершины
        PriorityQueue<RegionNode> queue = new PriorityQueue<>(Comparator.comparingLong(distances::get)); // Очередь с приоритетом по расстоянию

        for (RegionNode node : repository.findAll()) {
            distances.put(node, Long.MAX_VALUE); // Изначально расстояния до всех вершин бесконечны
        }
        distances.put(source, 0L); // Расстояние до источника равно 0
        queue.add(source);

        // 2. Основной цикл
        while (!queue.isEmpty()) {
            RegionNode current = queue.poll(); // Извлекаем вершину с минимальным расстоянием
            if (current.equals(target)) {
                break; // Если достигли цели, выходим из цикла
            }

            visited.add(current);

            for (Edge edge : current.getEdges()) {

                RegionNode neighbor = edge.getOtherNode(current); // Получаем соседнюю вершину
                if (visited.contains(neighbor)) {
                    continue; // Пропускаем уже посещенные вершины
                }

                long newDistance = distances.get(current) + edge.getWeight();
                if (newDistance < distances.get(neighbor)) {
                    distances.put(neighbor, newDistance);
                    previous.put(neighbor, current);
                    queue.add(neighbor);
                }
            }
        }

        // 3. Восстановление пути
        List<RegionNode> path = new ArrayList<>();
        RegionNode current = target;
        while (current != null) {
            path.add(current);
            current = previous.get(current);
        }
        Collections.reverse(path); // Разворачиваем путь, чтобы он был от источника к цели

        return path;
    }
    @Override
    public RegionNode createNode(String name) {
        RegionNode node = new RegionNode();
        node.setName(name);

        return repository.save(node);
    }



    public Edge createConnectedNodes(String name1, String name2, Long weight) {
        RegionNode node1 = createNode(name1);
        RegionNode node2 = createNode(name2);
        return createEdge(node1, node2, weight);
    }


//    public List

    @Override
    public RegionNode getRegionNode(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public RegionNode getRegionNode(String name) {
        return repository.findByName(name);
    }

}
