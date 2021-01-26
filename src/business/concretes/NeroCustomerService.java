package business.concretes;

import dataAccess.abstracts.ICoffeeShopCustomerDao;

public class NeroCustomerService extends CoffeeShopCustomerService {

    public NeroCustomerService(ICoffeeShopCustomerDao coffeeShopCustomerDao, EmailService emailService) {
        super(coffeeShopCustomerDao, emailService);

    }
}
