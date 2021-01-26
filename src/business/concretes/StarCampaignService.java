package business.concretes;

import business.abstracts.ICampaignService;
import dataAccess.abstracts.ICampaignDao;
import dataAccess.abstracts.ICoffeeShopCampaignDao;
import entities.concretes.Campaign;

import java.util.ArrayList;
import java.util.List;

public class StarCampaignService extends CampaignService {
    ICampaignDao campaignDao;
    ICoffeeShopCampaignDao coffeeShopCampaignDao;

    public StarCampaignService(ICampaignDao campaignDao) {
        super(campaignDao);
        this.campaignDao = campaignDao;
    }

    @Override
    public void add(Campaign campaign) {
        campaignDao.add(campaign);
    }

    @Override
    public List<Campaign> getAll() {
        List<Campaign> campaigns = new ArrayList<>();


        for(Campaign campaign: campaignDao.getAll()){
            if (campaign.getId() == 2){
                campaigns.add(campaign);
            }
        }
        return campaigns;


    }
}
