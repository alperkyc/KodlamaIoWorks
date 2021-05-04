package Abstract;

import java.math.BigDecimal;
import java.math.RoundingMode;

import Entities.Product;

public abstract class BaseProductManager implements IProductService{

	@Override
	public void SaveProduct(Product product) {
		System.out.println("DB'e " + product.getProductName() + " adlý ürün eklendi");
		
	}

	@Override
	public void UpdateProduct(Product product) {
		System.out.println("DB'deki " + product.getId() + " id'li ürün güncellendi");
		
	}

	@Override
	public void DeleteProduct(Product product) {
		System.out.println("DB'den " + product.getId() + " id'li ürün silindi");
		
	}
	
	public BigDecimal executeDiscount(String campaignCode,BigDecimal price) {
		BigDecimal discountedProduct = price;
		if(campaignCode.equals("ÇANAKKALE17")) {
			discountedProduct = discountedProduct.subtract(discountedProduct.divide(new BigDecimal(10)).setScale(2,RoundingMode.HALF_UP));
			System.out.println("%10 luk bir indirim uygulandý. Ürünün yeni fiyatý : " + discountedProduct + " TL'dir");
		}
		return discountedProduct;
	}

}
