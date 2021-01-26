package business.abstracts;

import entities.concretes.CoffeeShop;

import java.util.List;

public interface ICoffeeShopService {
    void add(CoffeeShop coffeeShop);
    List<CoffeeShop> getAll();
}
