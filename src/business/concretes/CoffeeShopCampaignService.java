package business.concretes;

import business.abstracts.ICampaignService;
import business.abstracts.ICoffeeShopCampaignService;
import dataAccess.abstracts.ICoffeeShopCampaignDao;
import entities.concretes.CoffeeShopCampaign;

import java.util.List;

public class CoffeeShopCampaignService implements ICoffeeShopCampaignService {
    ICoffeeShopCampaignDao coffeeShopCampaignDao;


    public CoffeeShopCampaignService(ICoffeeShopCampaignDao coffeeShopCampaignDao) {
        this.coffeeShopCampaignDao = coffeeShopCampaignDao;
    }

    @Override
    public void add(CoffeeShopCampaign coffeeShopCampaign) {
        coffeeShopCampaignDao.add(coffeeShopCampaign);
    }

    @Override
    public List<CoffeeShopCampaign> getAll() {
        return coffeeShopCampaignDao.getAll();
    }


}
