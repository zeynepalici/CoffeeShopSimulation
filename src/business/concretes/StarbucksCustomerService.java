package business.concretes;

import dataAccess.abstracts.ICoffeeShopCustomerDao;

public class StarbucksCustomerService extends CoffeeShopCustomerService {

    private EDevletService eDevletService;
    public StarbucksCustomerService(ICoffeeShopCustomerDao coffeeShopCustomerDao, EDevletService registerService) {
        super(coffeeShopCustomerDao, registerService);
        this.eDevletService = registerService;
    }
}
