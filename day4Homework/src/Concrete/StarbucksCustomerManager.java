package Concrete;

import java.util.Date;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private CustomerCheckService _customerCheckService;
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		_customerCheckService =  customerCheckService;
	}
	
	@Override
	public void save(Customer customer)  {
		
			if (_customerCheckService.checkIfRealPerson(customer)) {
				
				System.out.println("Starbucks : Doðrulama Baþarýlý");
			}
			else {
				System.out.println("Starbucks : Doðrulama Hatasý.");
			}
		
		}

		
}
