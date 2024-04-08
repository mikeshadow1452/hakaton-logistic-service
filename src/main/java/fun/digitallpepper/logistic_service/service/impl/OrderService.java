package fun.digitallpepper.logistic_service.service.impl;

import fun.digitallpepper.logistic_service.model.Order;
import fun.digitallpepper.logistic_service.repository.OrderRepository;
import fun.digitallpepper.logistic_service.service.OrderServise;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Primary
public class OrderService implements OrderServise {
    private final OrderRepository repository;
    @Override
    public Order newOrder(Order order) {
        return repository.save(order);
    }

    @Override
    public void deleteOrderById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Order updateOrder(Order order) {
        return repository.save(order);
    }
}
