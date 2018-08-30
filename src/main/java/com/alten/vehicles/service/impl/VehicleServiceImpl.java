package com.alten.vehicles.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alten.vehicles.entity.Customer;
import com.alten.vehicles.repository.ICustomerRepo;
import com.alten.vehicles.service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private ICustomerRepo customerRepo;
	
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> c = new ArrayList<Customer>();
		try{
			c = customerRepo.findAll();
		}catch(Exception ex) {
			// do some logging and exception handling
			System.out.println(ex.getMessage());
		}
		return c;
	}


	
	
}
