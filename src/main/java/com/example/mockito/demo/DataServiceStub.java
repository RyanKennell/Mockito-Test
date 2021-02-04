package com.example.mockito.demo;

public class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		return new int[] {24, 6, 15};
	}

}
