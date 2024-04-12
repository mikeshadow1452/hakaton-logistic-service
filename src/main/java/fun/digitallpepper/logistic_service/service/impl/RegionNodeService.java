package fun.digitallpepper.logistic_service.service.impl;

import fun.digitallpepper.logistic_service.model.Edge;
import fun.digitallpepper.logistic_service.model.RegionConnection;
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
//        edge.setRegion2(node2);
//        edge.setRegion1(node1);
//
//        node2.getEdges().add(edge); // Добавляем ребро ко второй ноде
//        node1.getEdges().add(edge); // Добавляем ребро к первой ноде
//
//        edgeRepository.save(edge); // Сохраняем ребро
//
//
//        // Сохраняем изменения в обеих нодах:
//        repository.save(node2);
//        repository.save(node1);
//        return edge;
//    }

    @Override
    public Edge createEdge(RegionNode node1, RegionNode node2, Long weight) {
        Edge edge = new Edge();
        edge.setWeight(weight);
        edge.setRegion2(node2);
        edge.setRegion1(node1);

        node2.getEdges().add(edge);
        node1.getEdges().add(edge);


        RegionConnection connection1 = new RegionConnection();
        connection1.setRegion1(node1);
        connection1.setRegion2(node2);
        connection1.setEdge(edge);

        RegionConnection connection2 = new RegionConnection();
        connection2.setRegion1(node2);
        connection2.setRegion2(node1);
        connection2.setEdge(edge);

        edgeRepository.save(edge);
        repository.save(node2);
        repository.save(node1);
        return edge;
    }


    @Override
    public List<RegionNode> getAllNodes() {
        return repository.findAll();
    }

    public List<Edge> getAllEdges() {
        return edgeRepository.findAll();
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

//        // 3. Восстановление пути
//        List<RegionNode> path = new ArrayList<>();
//        RegionNode current = target;
//        while (current != null) {
//            path.add(current);
//            current = previous.get(current);
//        }
//        Collections.reverse(path); // Разворачиваем путь, чтобы он был от источника к цели
//
//        return path;
//
//        {
        // ... (существующий код) ...

        // 3. Восстановление пути и сохранение длины
        List<RegionNode> path = new ArrayList<>();
        RegionNode current = target;
        long shortestDistance = distances.get(target);  // Получаем длину кратчайшего пути из distances

        while (current != null) {
            path.add(current);
            current = previous.get(current);
        }
        Collections.reverse(path); // Разворачиваем путь

        // Здесь можно использовать shortestDistance, например, вывести на экран или сохранить куда-то
        System.out.println("Длина кратчайшего пути: " + shortestDistance);
        Map<List<RegionNode>,Long> answers = new HashMap<>();
        answers.put(path, shortestDistance);
        return path;
    }

    public Map<List<RegionNode>, Long> findShortestPathAndWeight(RegionNode source, RegionNode target) {
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

//        // 3. Восстановление пути
//        List<RegionNode> path = new ArrayList<>();
//        RegionNode current = target;
//        while (current != null) {
//            path.add(current);
//            current = previous.get(current);
//        }
//        Collections.reverse(path); // Разворачиваем путь, чтобы он был от источника к цели
//
//        return path;
//
//        {
        // ... (существующий код) ...

        // 3. Восстановление пути и сохранение длины
        List<RegionNode> path = new ArrayList<>();
        RegionNode current = target;
        long shortestDistance = distances.get(target);  // Получаем длину кратчайшего пути из distances

        while (current != null) {
            path.add(current);
            current = previous.get(current);
        }
        Collections.reverse(path); // Разворачиваем путь

        // Здесь можно использовать shortestDistance, например, вывести на экран или сохранить куда-то
        System.out.println("Длина кратчайшего пути: " + shortestDistance);
        Map<List<RegionNode>,Long> answers = new HashMap<>();
        answers.put(path, shortestDistance);
        return answers;
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
