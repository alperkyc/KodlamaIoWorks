package Abstract;

import Entities.Campaign;

public interface ICampaignService {
	
	void SaveCampaign(Campaign campaign);
	
	void UpdateCampaign(Campaign campaign);
	
	void DeleteCampaign(Campaign campaign);

}
