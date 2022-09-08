package com.CabInvoice;

import java.util.Scanner;

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
	
	@Test
	public void givenDistanceAndTimeWhenFareIsFiveForMultipleRidesShouldBeMultipleTotalFare() {
		
		CabInvoiceMain cab = new CabInvoiceMain();
		Scanner scan = new Scanner(System.in);
		
		int result = cab.calculateFare(10);
		System.out.println("Enter number of trips: ");
		int trips = scan.nextInt();
		int totalFare = result * trips;
		//int totalfare = cab.totalFare;
		Assert.assertEquals(totalFare, result*trips);
		System.out.println(totalFare);
		
	}

}
