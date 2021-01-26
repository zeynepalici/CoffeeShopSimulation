package business.abstracts;

import entities.concretes.CoffeeShopCampaign;

import java.util.List;

public interface ICoffeeShopCampaignService {
     void add(CoffeeShopCampaign coffeeShopCampaign);
      List<CoffeeShopCampaign> getAll();

}
