package Entities;

import java.math.BigDecimal;
import java.util.Date;

import Abstract.IEntity;

public class Order implements IEntity{
	public int Id;
	public String purchasedProductName;
	public String purchasedPerson;
	public BigDecimal purchasedprice;
	public Date purchasedTime;
	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPurchasedProductName() {
		return purchasedProductName;
	}
	public void setPurchasedProductName(String purchasedProductName) {
		this.purchasedProductName = purchasedProductName;
	}
	public String getPurchasedPerson() {
		return purchasedPerson;
	}
	public void setPurchasedPerson(String purchasedPerson) {
		this.purchasedPerson = purchasedPerson;
	}
	public BigDecimal getPurchasedprice() {
		return purchasedprice;
	}
	public void setPurchasedprice(BigDecimal purchasedprice) {
		this.purchasedprice = purchasedprice;
	}
	public Date getPurchasedTime() {
		return purchasedTime;
	}
	public void setPurchasedTime(Date purchasedTime) {
		this.purchasedTime = purchasedTime;
	}

	
	

}
