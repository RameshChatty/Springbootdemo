package io.controller.service;

import io.controller.dao.CustomerDao;
import io.controller.entity.CopyOfCustomer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

	//@Autowired
	//private DatabaseRepositry db;
	
	@Autowired
	private CustomerDao cd;
	
	@org.springframework.transaction.annotation.Transactional
	public void saveCustomer(CopyOfCustomer customer) {
		
		cd.save(customer);
	}

	
	@org.springframework.transaction.annotation.Transactional
	public List<CopyOfCustomer> getData() {
		
		List<CopyOfCustomer> customers1=cd.getAllData();
		System.out.println("customers1"+customers1.size());
		
		/*List<Customer> customers = new ArrayList<>();
		db.findAll().forEach(customers::add);		
		
		customers.stream().forEach(x->{
			System.out.println(x.getcId());
		});*/
		return customers1;
	}

}
