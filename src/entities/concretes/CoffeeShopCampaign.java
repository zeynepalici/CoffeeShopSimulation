package entities.concretes;

import entities.abstracts.IEntity;

public class CoffeeShopCampaign implements IEntity {

    private CoffeeShop coffeeShop;
    private Campaign campaign;

    public CoffeeShopCampaign(CoffeeShop coffeeShop, Campaign campaign) {
        this.coffeeShop = coffeeShop;
        this.campaign = campaign;
    }


    public CoffeeShop getCoffeeShop() {
        return coffeeShop;
    }

    public void setCoffeeShop(CoffeeShop coffeeShop) {
        this.coffeeShop = coffeeShop;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }


}
