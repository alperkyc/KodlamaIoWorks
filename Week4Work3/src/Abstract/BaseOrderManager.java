package Abstract;

import Entities.Order;

public abstract class BaseOrderManager implements IOrderService{

	@Override
	public void SaveOrder(Order order) {
		System.out.println("Db'e sat�lan " + order.getPurchasedProductName() +  " adl� �r�n kaydedildi");
		
	}

	@Override
	public void UpdateOrder(Order order) {
		System.out.println("Db'deki sat�lan " + order.getId() +  " id'li �r�n g�ncellendi");

		
	}

	@Override
	public void DeleteOrder(Order order) {
		System.out.println("Db'deki sat�lan " + order.getId() +  " id'li �r�n silindi");
		
	}

}
