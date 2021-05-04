package Concrete;

import Abstract.BaseCampaignManager;
import Entities.Campaign;

public class CampaignManager extends BaseCampaignManager{
	@Override
	public void SaveCampaign(Campaign campaign) {
			super.SaveCampaign(campaign);
	}
	
	@Override
	public void UpdateCampaign(Campaign campaign) {
			super.UpdateCampaign(campaign);
	}
	
	@Override
	public void DeleteCampaign(Campaign campaign) {
			super.DeleteCampaign(campaign);
	}

}
