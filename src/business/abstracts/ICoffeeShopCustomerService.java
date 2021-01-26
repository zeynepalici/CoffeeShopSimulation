package business.abstracts;

import entities.concretes.CoffeeShopCustomer;

import java.util.List;

public interface ICoffeeShopCustomerService {
     void add(CoffeeShopCustomer coffeeShopCustomer);
     List<CoffeeShopCustomer> getAll();
}
