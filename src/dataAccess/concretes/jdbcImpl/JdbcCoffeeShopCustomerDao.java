package dataAccess.concretes.jdbcImpl;

import dataAccess.abstracts.ICoffeeShopCustomerDao;
import entities.concretes.CoffeeShop;
import entities.concretes.CoffeeShopCustomer;
import entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class JdbcCoffeeShopCustomerDao implements ICoffeeShopCustomerDao {
    @Override
    public void add(CoffeeShopCustomer coffeeShopCustomer) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }

    @Override
    public void update(CoffeeShopCustomer coffeeShopCustomer) {
        System.out.println("Jdbc ile veritabanında güncelledi.");
    }

    @Override
    public void delete(CoffeeShopCustomer coffeeShopCustomer) {
        System.out.println("Jdbc ile veritabanından silindi.");
    }

    @Override
    public List<CoffeeShopCustomer> getAll() {
        List<CoffeeShopCustomer> coffeeShopCustomers = new ArrayList<>();

        CoffeeShop starbucks = new CoffeeShop(1,"starbucks");
        CoffeeShop nero = new CoffeeShop(2,"nero");

        Customer customer1 = new Customer(1,"zeynep","alici");
        Customer customer2 = new Customer(2,"berre","ergun");
        Customer customer3 = new Customer(3,"melisa","dönmez");
        Customer customer4 = new Customer(3,"anil","zeybek");
        Customer customer5 = new Customer(5,"ahmet","akıl");

        coffeeShopCustomers.add(new CoffeeShopCustomer(starbucks,customer1));
        coffeeShopCustomers.add(new CoffeeShopCustomer(starbucks,customer2));
        coffeeShopCustomers.add(new CoffeeShopCustomer(nero,customer3));
        coffeeShopCustomers.add(new CoffeeShopCustomer(nero,customer4));
        coffeeShopCustomers.add(new CoffeeShopCustomer(nero,customer5));

        return coffeeShopCustomers;

    }

}
