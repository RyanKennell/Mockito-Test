package com.example.mockito.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessImpl {
	
	@Autowired
	private DataService dataService;
	
	public BusinessImpl(DataService service) {
		this.dataService = service;
	}
	
	public int findLargest() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		
		for(int value : data) {
			if(value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}
}

