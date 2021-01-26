package business.concretes;

import business.abstracts.ICampaignService;
import dataAccess.abstracts.ICampaignDao;
import entities.concretes.Campaign;

import java.util.ArrayList;
import java.util.List;

public class ExtraCoffeeCampaignService extends CampaignService {

    ICampaignDao campaignDao;

    public ExtraCoffeeCampaignService(ICampaignDao campaignDao) {
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
        for (Campaign campaign : campaignDao.getAll()) {
            if (campaign.getId() == 1) {
                campaigns.add(campaign);
            }
        }
        return campaigns;
    }
}
