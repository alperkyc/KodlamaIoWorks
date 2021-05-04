package Entities;

import java.math.BigDecimal;

import Abstract.IEntity;

public class Product implements IEntity{

	public int Id;
	public String ProductName;
	public BigDecimal Price;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public BigDecimal getPrice() {
		return Price;
	}
	public void setPrice(BigDecimal price) {
		Price = price;
	}
	
	
}
