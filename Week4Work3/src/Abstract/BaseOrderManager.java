package Abstract;

import Entities.Order;

public abstract class BaseOrderManager implements IOrderService{

	@Override
	public void SaveOrder(Order order) {
		System.out.println("Db'e satýlan " + order.getPurchasedProductName() +  " adlý ürün kaydedildi");
		
	}

	@Override
	public void UpdateOrder(Order order) {
		System.out.println("Db'deki satýlan " + order.getId() +  " id'li ürün güncellendi");

		
	}

	@Override
	public void DeleteOrder(Order order) {
		System.out.println("Db'deki satýlan " + order.getId() +  " id'li ürün silindi");
		
	}

}
