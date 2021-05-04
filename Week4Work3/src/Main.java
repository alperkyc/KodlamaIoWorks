import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.Date;

import Adapters.MernisServerAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.OrderManager;
import Concrete.ProductManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Order;
import Entities.Product;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		CustomerManager customerManager = new CustomerManager(new MernisServerAdapter());
		
		System.out.println("************MÜÞTERÝ EKLEME************");
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Alper"); //kendi adýnýzý giriniz
		customer1.setLastName("Kuyucu"); //kendi soyadýnýzý giriniz
		customer1.setDateOfBirthDayYear(1994); //kendi dogum yýlýný giriniz
		customer1.setNationalityId("123123123"); //kendi tc nizi giriniz.
		
		Customer customer2 = new Customer();
		customer2.setId(1);
		customer2.setFirstName("Alper");
		customer2.setLastName("Kuyucu");
		customer2.setDateOfBirthDayYear(1994);
		customer2.setNationalityId("13855885890");
		
		customerManager.SaveCustomer(customer1);
		customerManager.SaveCustomer(customer2);
		
		customerManager.UpdateCustomer(customer1);
		customerManager.DeleteCustomer(customer2);
		
		System.out.println("************ÜRÜN EKLEME************");
		ProductManager productManager = new ProductManager();
		Product product1 = new Product();
		product1.setId(1);
		product1.setPrice(new BigDecimal(100));
		product1.setProductName("FIFA 2021");
		
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setPrice(new BigDecimal(200));
		product2.setProductName("NBA 2021");
		
		productManager.SaveProduct(product1);
		productManager.SaveProduct(product2);
		
		productManager.UpdateProduct(product1);
		productManager.UpdateProduct(product2);
		
		System.out.println("************KAMPANYA EKLEME************");
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignCode("ÇANAKKALE17");
		campaign1.setDiscountPercantage(new BigDecimal(10));
		
		campaignManager.SaveCampaign(campaign1);
		campaignManager.UpdateCampaign(campaign1);
		campaignManager.DeleteCampaign(campaign1);
		
		
		System.out.println("************SATIÞ EKLEME************");
		OrderManager orderManager = new OrderManager();
		Order order1 = new Order();
		order1.setId(1);
		order1.setPurchasedprice(productManager.executeDiscount(campaign1.getCampaignCode(), new BigDecimal(100)));
		order1.setPurchasedPerson(customer1.getFirstName() + " " + customer1.getLastName());
		order1.setPurchasedTime(new Date());
		order1.setPurchasedProductName(product1.getProductName());
		
		orderManager.SaveOrder(order1);
		orderManager.UpdateOrder(order1);
		orderManager.DeleteOrder(order1);
		
		
		
		
		
		

	}

}
