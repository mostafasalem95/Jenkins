package com.alten.vehicles.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alten.vehicles.entity.Customer;
import com.alten.vehicles.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService vs;
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		return vs.getAllCustomers();
	}
	
	
	
}
