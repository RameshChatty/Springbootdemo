package io.controller.service;

import io.controller.entity.CopyOfCustomer;

import java.util.List;

public interface CustomerService {

	void saveCustomer(CopyOfCustomer customer);

	List<CopyOfCustomer> getData();

}
