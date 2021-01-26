package business.concretes;

import business.abstracts.ICustomerService;
import dataAccess.abstracts.ICustomerDao;
import entities.concretes.Customer;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerDao iCustomerDao;

    public CustomerService(ICustomerDao iCustomerDao) {
        this.iCustomerDao = iCustomerDao;
    }

    @Override
    public void add(Customer customer) {
        iCustomerDao.add(customer);
    }

    @Override
    public List<Customer> getAll() {
        return iCustomerDao.getAll();
    }
}
