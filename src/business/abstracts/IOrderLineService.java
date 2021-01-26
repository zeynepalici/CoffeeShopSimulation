package business.abstracts;

import entities.concretes.OrderLine;

public interface IOrderLineService {
    void addOrderLine(OrderLine orderLine);
}
