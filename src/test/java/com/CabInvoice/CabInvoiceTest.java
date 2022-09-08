package com.CabInvoice;

import org.junit.Test;

import junit.framework.Assert;

public class CabInvoiceTest {
	
	@Test
	public void givenDistanceAndTimeWhenFareIsFiveShouldBeTotalFare() {
		
		CabInvoiceMain cab = new CabInvoiceMain();
		int result = cab.calculateFare(10);
		//int totalfare = cab.totalFare;
		Assert.assertEquals(50, result);
		
	}

}
