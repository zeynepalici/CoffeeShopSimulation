package business.concretes;

import business.abstracts.ICoffeeShopCustomerService;
import business.abstracts.IRegisterService;
import dataAccess.abstracts.ICoffeeShopCustomerDao;
import entities.concretes.CoffeeShopCustomer;
import entities.concretes.Customer;

import java.util.List;

public class CoffeeShopCustomerService implements ICoffeeShopCustomerService {
    private ICoffeeShopCustomerDao coffeeShopCustomerDao;
    private IRegisterService registerService;

    public CoffeeShopCustomerService(ICoffeeShopCustomerDao coffeeShopCustomerDao, IRegisterService registerService) {
        this.coffeeShopCustomerDao = coffeeShopCustomerDao;
        this.registerService = registerService;
    }

    @Override
    public void add(CoffeeShopCustomer coffeeShopCustomer) {
        Customer customer = new Customer(coffeeShopCustomer.getCustomer().getId(), coffeeShopCustomer.getCustomer().getFirstName(), coffeeShopCustomer.getCustomer().getLastName());

        if (registerService.register(customer)) {
            coffeeShopCustomerDao.add(coffeeShopCustomer);
        }

    }

    public List<CoffeeShopCustomer> getAll() {
        return coffeeShopCustomerDao.getAll();
    }

}
