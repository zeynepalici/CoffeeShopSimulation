package dataAccess.concretes.jdbcImpl;

import dataAccess.abstracts.ICoffeeShopCampaignDao;
import entities.concretes.Campaign;
import entities.concretes.CoffeeShop;
import entities.concretes.CoffeeShopCampaign;

import java.util.ArrayList;
import java.util.List;

public class JdbcCoffeShopCampaignDao implements ICoffeeShopCampaignDao {
    @Override
    public void add(CoffeeShopCampaign coffeeShopCampaign) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }

    @Override
    public void update(CoffeeShopCampaign coffeeShopCampaign) {
        System.out.println("Jdbc ile veritabanında güncelledi.");
    }

    @Override
    public void delete(CoffeeShopCampaign coffeeShopCampaign) {
        System.out.println("Jdbc ile veritabanından silindi.");
    }

    @Override
    public List<CoffeeShopCampaign> getAll() {


        CoffeeShop starbucks = new CoffeeShop(1,"starbucks");
        CoffeeShop nero = new CoffeeShop(2,"nero");

        Campaign campaign1 = new Campaign(1,"Bir yıldız kazandınız");
        Campaign campaign2 = new Campaign(2,"Ekstra kahve kazandınız");

        List<CoffeeShopCampaign> coffeeShopCampaigns = new ArrayList<>();

        coffeeShopCampaigns.add(new CoffeeShopCampaign(nero,campaign1));
        coffeeShopCampaigns.add(new CoffeeShopCampaign(nero,campaign2));
        coffeeShopCampaigns.add(new CoffeeShopCampaign(starbucks,campaign1));

        return coffeeShopCampaigns;
    }
}
