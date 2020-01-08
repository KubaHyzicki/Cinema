package Application.DataAccess;

import Application.Users.*;

public interface CustomerDB {

	/**
	 * 
	 * @param customer
	 */
	void modifyCustomer(Customer customer);

	/**
	 * 
	 * @param email
	 */
	Customer findCustomerByEmail(String email);

}