package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class CustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	public CustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService  = customerCheckService;
	}

	@Override
	public void SaveCustomer(Customer customer) throws NumberFormatException, RemoteException {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("M��teri do�ruland�");
			super.SaveCustomer(customer);
		}
		else {
			System.out.println("M��teri do�rulama ba�ar�s�z");
		}
	}
	
	
}
