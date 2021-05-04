package Abstract;

import Entities.Campaign;

public abstract class BaseCampaignManager implements ICampaignService{

	@Override
	public void SaveCampaign(Campaign campaign) {
		System.out.println("Db'e  " + campaign.getCampaignCode() +  " kampanya kodlu �r�n kaydedildi");
		
	}

	@Override
	public void UpdateCampaign(Campaign campaign) {
		System.out.println("Db'deki  " + campaign.getId()+  " kampanya id'li �r�n g�ncellendi");
		
	}

	@Override
	public void DeleteCampaign(Campaign campaign) {
		System.out.println("Db'den  " + campaign.getId()+  " kampanya id'li �r�n silindi");

		
	}

}
