package com.example.mockito.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class BusinessImplTest {
	
	@Mock
	DataService mock;
	
	@InjectMocks
	BusinessImpl businessImpl;
	
	
	@Test
	public void test() {
		
		// dataServiceMock.retrieveAllData() => new int[] {24, 15,3}
		when(mock.retrieveAllData()).thenReturn(new int[] {24, 15,3});
		
		int result = businessImpl.findLargest();
		assertEquals(24, result);
	}
	
	@Test
	public void test2() {
		
		// dataServiceMock.retrieveAllData() => new int[] {24, 15,3}
		when(mock.retrieveAllData()).thenReturn(new int[] {15});
		
		int result = businessImpl.findLargest();
		assertEquals(15, result);
	}
	
	@Test
	void testFindLargest() {
		when(mock.retrieveAllData()).thenReturn(new int[] {24, 15, 3});
		int result = businessImpl.findLargest();
		assertEquals(result, 24);
	}
	
	@Test
	void testNoValues() {
		when(mock.retrieveAllData()).thenReturn(new int[] {  });
		int result = businessImpl.findLargest();
		assertEquals(result, 0);
	}

}


