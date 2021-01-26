import business.concretes.*;
import dataAccess.concretes.jdbcImpl.*;
import entities.concretes.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CoffeeShopService coffeeShopService = new CoffeeShopService(new JdbcCoffeeShopDao());
        List<CoffeeShop> coffeeShops = coffeeShopService.getAll();

        CustomerService customerService = new CustomerService(new JdbcCustomerDao());
        List<Customer> customers = customerService.getAll();

        CampaignService campaignService = new CampaignService(new JdbcCampaignDao());


        CampaignService starbucksCampaignService = new StarCampaignService(new JdbcCampaignDao());
        CampaignService neroCampaignService = new ExtraCoffeeCampaignService(new JdbcCampaignDao());

        CoffeeShopCustomerService starbucksCoffeeShopCustomerService = new CoffeeShopCustomerService(new JdbcCoffeeShopCustomerDao(), new EDevletService());
        CoffeeShopCustomerService neroCoffeeShopCustomerService = new CoffeeShopCustomerService(new JdbcCoffeeShopCustomerDao(), new EmailService());

        OrderLineService starbucksOrderLineService = new OrderLineService(starbucksCampaignService);
        OrderLineService neroOrderLineService = new OrderLineService(neroCampaignService);

        OrderLine orderLine1 = new OrderLine(1, 2, "latte", starbucksCoffeeShopCustomerService.getAll().get(0));
        OrderLine orderLine2 = new OrderLine(1, 3, "espresso", neroCoffeeShopCustomerService.getAll().get(1));


        starbucksOrderLineService.addOrderLine(orderLine1);

        System.out.println("\n");

        neroOrderLineService.addOrderLine(orderLine2);

        System.out.println("\n");

        starbucksCoffeeShopCustomerService.add(new CoffeeShopCustomer(coffeeShops.get(0), new Customer(6, "özge", "yılmaz")));

        System.out.println("\n");

        neroCoffeeShopCustomerService.add(new CoffeeShopCustomer(coffeeShops.get(1), new Customer(7, "beyza", "kayci")));

    }
}