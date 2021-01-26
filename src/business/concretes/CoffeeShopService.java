package business.concretes;

import business.abstracts.ICoffeeShopService;
import dataAccess.abstracts.ICoffeeShopDao;
import entities.concretes.CoffeeShop;

import java.util.List;

public class CoffeeShopService implements ICoffeeShopService {
    private ICoffeeShopDao coffeeShopDao;

    public CoffeeShopService(ICoffeeShopDao coffeeShopDao) {
        this.coffeeShopDao = coffeeShopDao;
    }

    @Override
    public void add(CoffeeShop coffeeShop) {
        coffeeShopDao.add(coffeeShop);
    }

    @Override
    public List<CoffeeShop> getAll() {
        return coffeeShopDao.getAll();
    }
}
