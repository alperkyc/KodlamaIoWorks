package Concrete;

import Abstract.BaseOrderManager;
import Entities.Order;

public class OrderManager extends BaseOrderManager{
	
	@Override
	public void SaveOrder(Order order) {
			super.SaveOrder(order);
	}
	
	@Override
	public void UpdateOrder(Order order) {
			super.UpdateOrder(order);
	}
	
	@Override
	public void DeleteOrder(Order order) {
			super.DeleteOrder(order);
	}
		
}
