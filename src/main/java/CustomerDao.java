package main.java;

import java.util.List;

public interface CustomerDao {
	
	public void addCustomer(Customer customer);
	public Customer getCustomerById(Integer id);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(Integer id);
	
	
	public List<Customer> getAllCustomers();
	public List<Customer> getCustomersByCity(String city);

}
