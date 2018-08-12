package io.controller.restcontroller;

import io.controller.entity.CopyOfCustomer;
import io.controller.service.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@Autowired
	private CustomerService cs;
	
	@RequestMapping(value="/display")
	public List<CopyOfCustomer> displayDetails(){
		cs.getData();
		return cs.getData();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="save")
	public void SaveCustomer(@RequestBody CopyOfCustomer customer){
		System.out.println(customer);
		cs.saveCustomer(customer);
	}

}
