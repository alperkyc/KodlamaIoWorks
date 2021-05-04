package Abstract;

import Entities.Order;

public interface IOrderService {

	void SaveOrder(Order order);
	
	void UpdateOrder(Order order);
	
	void DeleteOrder(Order order);
	
}
