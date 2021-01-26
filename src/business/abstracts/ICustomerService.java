package business.abstracts;

import entities.concretes.Customer;

import java.util.List;

public interface ICustomerService {
    void add(Customer customer);

    List<Customer> getAll();
}
