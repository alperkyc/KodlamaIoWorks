package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public  abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void SaveCustomer(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Db'e " + customer.getFirstName() + " " + customer.getLastName() + " adl� m��teri kaydedildi");

	}

	@Override
	public void UpdateCustomer(Customer customer) {
		System.out.println(customer.getId() + " id 'li m��teri g�ncellendi");

		
	}

	@Override
	public void DeleteCustomer(Customer customer) {
		System.out.println(customer.getId() + " id 'li m��teri silindi");
		
	}




}
