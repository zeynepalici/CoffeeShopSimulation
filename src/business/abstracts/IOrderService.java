package business.abstracts;

import entities.concretes.Order;

public interface IOrderService {
    void addOrder(Order order);
}
