package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements ICampaignService{

	@Override
	public void SaveCampaign(Campaign campaign) {
		System.out.println("Db'e  " + campaign.getCampaignCode() +  " kampanya kodlu ürün kaydedildi");
		
	}

	@Override
	public void UpdateCampaign(Campaign campaign) {
		System.out.println("Db'deki  " + campaign.getId()+  " kampanya id'li ürün güncellendi");
		
	}

	@Override
	public void DeleteCampaign(Campaign campaign) {
		System.out.println("Db'den  " + campaign.getId()+  " kampanya id'li ürün silindi");

		
	}

}
