package business.concretes;

import business.abstracts.ICampaignService;
import business.abstracts.IOrderLineService;
import dataAccess.abstracts.IOrderLineDao;
import entities.concretes.Campaign;
import entities.concretes.OrderLine;

public class OrderLineService implements IOrderLineService {

    ICampaignService campaignService;
    IOrderLineDao orderLineDao;


    public OrderLineService(CampaignService campaignService) {
        this.campaignService = campaignService;
    }

    @Override
    public void addOrderLine(OrderLine orderLine) {
        System.out.println(orderLine.getQuantity() + " adet " + orderLine.getCoffeeName() + " aldınız.");
        for (Campaign campaign : campaignService.getAll()) {
            System.out.println(campaign.getContent());
        }
        if (orderLineDao != null)
            orderLineDao.add(orderLine);
    }
}
