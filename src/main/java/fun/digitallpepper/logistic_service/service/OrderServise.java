package fun.digitallpepper.logistic_service.service;

import fun.digitallpepper.logistic_service.model.Order;

public interface OrderServise {
    Order newOrder(Order order);
    void deleteOrderById(Long id);
    Order updateOrder(Order order);
}
