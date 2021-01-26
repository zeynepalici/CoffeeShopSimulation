package business.concretes;

import business.abstracts.ICampaignService;
import dataAccess.abstracts.ICampaignDao;
import entities.concretes.Campaign;

import java.util.List;

public class CampaignService implements ICampaignService {
    private ICampaignDao campaignDao;

    public CampaignService(ICampaignDao campaignDao) {
        this.campaignDao = campaignDao;
    }

    @Override

    public void add(Campaign campaign) {
        campaignDao.add(campaign);
    }

    public List<Campaign> getAll(){
       return campaignDao.getAll();
    }
}
