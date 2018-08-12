package io.controller.dao;

import io.controller.entity.CopyOfCustomer;

import java.util.List;

public interface CustomerDao {

	List<CopyOfCustomer> getAllData();

	void save(CopyOfCustomer customer);

}
