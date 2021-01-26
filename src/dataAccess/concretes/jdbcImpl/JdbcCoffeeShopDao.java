package dataAccess.concretes.jdbcImpl;

import dataAccess.abstracts.ICoffeeShopDao;
import entities.concretes.CoffeeShop;

import java.util.ArrayList;
import java.util.List;

public class JdbcCoffeeShopDao implements ICoffeeShopDao {
    @Override
    public void add(CoffeeShop coffeeShop) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }

    @Override
    public void update(CoffeeShop coffeeShop) {
        System.out.println("Jdbc ile veritabanında güncelledi.");
    }

    @Override
    public void delete(CoffeeShop coffeeShop) {
        System.out.println("Jdbc ile veritabanından silindi.");
    }

    @Override
    public List<CoffeeShop> getAll() {
        List<CoffeeShop> coffeeShops = new ArrayList<>();

        coffeeShops.add(new CoffeeShop(1,"Starbucks"));
        coffeeShops.add(new CoffeeShop(2,"Nero"));

        return coffeeShops;
    }
}
