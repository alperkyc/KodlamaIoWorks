package Concrete;

import java.math.BigDecimal;

import Abstract.BaseProductManager;
import Entities.Product;

public class ProductManager extends BaseProductManager{
	@Override
	public void SaveProduct(Product product) {
			super.SaveProduct(product);
	}
	
	@Override
	public void UpdateProduct(Product product) {
			super.UpdateProduct(product);
	}
	
	@Override
	public void DeleteProduct(Product product) {
			super.DeleteProduct(product);
	}
	
	@Override
	public  BigDecimal executeDiscount(String campaignCode,BigDecimal price) {
			return super.executeDiscount(campaignCode, price);
	}
		
	
}
