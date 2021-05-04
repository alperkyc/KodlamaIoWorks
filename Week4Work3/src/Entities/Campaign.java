package Entities;

import java.math.BigDecimal;

import Abstract.IEntity;

public class Campaign implements IEntity{

	public int Id;
	public String CampaignCode;
	public BigDecimal discountPercantage;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCampaignCode() {
		return CampaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		CampaignCode = campaignCode;
	}
	public BigDecimal getDiscountPercantage() {
		return discountPercantage;
	}
	public void setDiscountPercantage(BigDecimal discountPercantage) {
		this.discountPercantage = discountPercantage;
	}
	
	
}
