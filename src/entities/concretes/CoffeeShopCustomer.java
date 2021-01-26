package entities.concretes;

import entities.abstracts.IEntity;

public class CoffeeShopCustomer implements IEntity {

    private CoffeeShop coffeeShop;
    private Customer customer;

    public CoffeeShopCustomer(CoffeeShop coffeeShop, Customer customer) {
        this.coffeeShop = coffeeShop;
        this.customer = customer;
    }


    public CoffeeShop getCoffeeShop() {
        return coffeeShop;
    }

    public void setCoffeeShop(CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}
