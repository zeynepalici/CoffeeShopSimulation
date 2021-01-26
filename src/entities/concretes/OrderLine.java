package entities.concretes;

import entities.abstracts.IEntity;

public class OrderLine implements IEntity {
    private int id;
    private int quantity;
    private String coffeeName;
    private CoffeeShopCustomer coffeeShopCustomer;

    public OrderLine(int id, int quantity, String coffeeName, CoffeeShopCustomer coffeeShopCustomer) {
        this.id = id;
        this.quantity = quantity;
        this.coffeeName = coffeeName;
        this.coffeeShopCustomer = coffeeShopCustomer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public CoffeeShopCustomer getCoffeeShopCustomer() {
        return coffeeShopCustomer;
    }

    public void setCoffeeShopCustomer(CoffeeShopCustomer coffeeShopCustomer) {
        this.coffeeShopCustomer = coffeeShopCustomer;
    }
}
