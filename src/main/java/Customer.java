package main.java;

import java.util.ArrayList;
import java.util.List;

public class Customer implements CustomerDao {
	
	private Integer id;
	private String name;
	private String city;
	private String email;
	private String phone;  // FIXit: come back to this. This is for MyMatis

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<Customer> customers = new ArrayList<Customer>();
		// SELECT * FROM CUSTOMERS
		return customers;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomerById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getCustomersByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
