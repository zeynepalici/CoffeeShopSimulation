package entities.concretes;

import entities.abstracts.IEntity;

import java.util.List;

public class Order implements IEntity {
    private int id;
    private List<OrderLine> orderLines;

    public Order(int id, List<OrderLine> orderLines) {
        this.id = id;
        this.orderLines = orderLines;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
