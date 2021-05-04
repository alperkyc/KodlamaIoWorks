package Abstract;

import java.rmi.RemoteException;

import Entities.Customer;

public  abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void SaveCustomer(Customer customer) throws NumberFormatException, RemoteException {
		System.out.println("Db'e " + customer.getFirstName() + " " + customer.getLastName() + " adlý müþteri kaydedildi");

	}

	@Override
	public void UpdateCustomer(Customer customer) {
		System.out.println(customer.getId() + " id 'li müþteri güncellendi");

		
	}

	@Override
	public void DeleteCustomer(Customer customer) {
		System.out.println(customer.getId() + " id 'li müþteri silindi");
		
	}




}
