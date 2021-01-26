package dataAccess.concretes.jdbcImpl;

import dataAccess.abstracts.ICustomerDao;
import entities.concretes.Customer;

import java.util.ArrayList;
import java.util.List;

public class JdbcCustomerDao implements ICustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Jdbc ile veritabanında güncelledi.");

    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Jdbc ile veritabanından silindi.");

    }

    @Override
    public List<Customer> getAll() {

        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer(1, "zeynep", "alici"));
        customers.add(new Customer(2, "berre", "ergün"));
        customers.add(new Customer(3, "melisa", "dönmez"));
        customers.add(new Customer(4, "anil", "zeybek"));
        customers.add(new Customer(5, "ahmet", "akil"));

        return customers;
    }
}
