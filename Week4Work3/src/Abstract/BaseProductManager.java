package Abstract;

import java.math.BigDecimal;
import java.math.RoundingMode;

import Entities.Product;

public abstract class BaseProductManager implements IProductService{

	@Override
	public void SaveProduct(Product product) {
		System.out.println("DB'e " + product.getProductName() + " adl� �r�n eklendi");
		
	}

	@Override
	public void UpdateProduct(Product product) {
		System.out.println("DB'deki " + product.getId() + " id'li �r�n g�ncellendi");
		
	}

	@Override
	public void DeleteProduct(Product product) {
		System.out.println("DB'den " + product.getId() + " id'li �r�n silindi");
		
	}
	
	public BigDecimal executeDiscount(String campaignCode,BigDecimal price) {
		BigDecimal discountedProduct = price;
		if(campaignCode.equals("�ANAKKALE17")) {
			discountedProduct = discountedProduct.subtract(discountedProduct.divide(new BigDecimal(10)).setScale(2,RoundingMode.HALF_UP));
			System.out.println("%10 luk bir indirim uyguland�. �r�n�n yeni fiyat� : " + discountedProduct + " TL'dir");
		}
		return discountedProduct;
	}

}
