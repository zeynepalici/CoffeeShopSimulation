package business.concretes;

import business.abstracts.IOrderLineService;
import business.abstracts.IOrderService;
import dataAccess.abstracts.IOrderDao;
import entities.concretes.Order;

public class OrderService implements IOrderService {
    IOrderDao orderDao;

    public OrderService(IOrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    public void addOrder(Order order) {
        orderDao.add(order);
    }
}
