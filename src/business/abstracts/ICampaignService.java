package business.abstracts;

import entities.concretes.Campaign;

import java.util.List;

public interface ICampaignService {
    void add(Campaign campaign);
    List<Campaign> getAll();
}
