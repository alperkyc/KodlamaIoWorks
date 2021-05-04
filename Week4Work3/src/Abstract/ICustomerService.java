package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public interface ICustomerService {
	
	void SaveCustomer(Customer customer) throws NumberFormatException, RemoteException;
	
	void UpdateCustomer(Customer customer);
	
	void DeleteCustomer(Customer customer);
}
