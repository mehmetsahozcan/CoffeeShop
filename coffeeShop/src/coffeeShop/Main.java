package coffeeShop;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		//BaseCustomerManager customerManager = new NeroCustomerManager();
		//Customer customer = new Customer(1,"Mehmet","Özcan",1999,"126456789");
		//customerManager.save(customer);

		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1,"Mehmet","Özcan",1999,"12345"));
	}

}
