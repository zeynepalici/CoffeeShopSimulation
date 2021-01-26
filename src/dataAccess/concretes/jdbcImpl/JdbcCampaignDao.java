package dataAccess.concretes.jdbcImpl;

import dataAccess.abstracts.ICampaignDao;
import entities.concretes.Campaign;
import entities.concretes.CoffeeShopCustomer;

import java.util.ArrayList;
import java.util.List;

public class JdbcCampaignDao implements ICampaignDao {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Jdbc ile veritabanında güncelledi.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Jdbc ile veritabanından silindi.");
    }

    @Override
    public List<Campaign> getAll() {

        List<Campaign> campaigns = new ArrayList<>();

        campaigns.add(new Campaign(1, "Ekstra bir kahve kazandınız."));
        campaigns.add(new Campaign(2, "Bir yıldız kazandınız."));


        return campaigns;

    }
}
