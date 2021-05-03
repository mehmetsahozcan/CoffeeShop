package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	
	@Override
	public void save(Customer customer) {

		if (customerCheckService.CheckIfRealPerson(customer)) {

			System.out.println("Saved to database: " + customer.getFirstName()+ " "+customer.getLastName());
		}

		else {

			System.out.println("Kiþi Bulunamadý...");
		}
	
	
	

	}
	}
