package com.CabInvoice;

import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

import junit.framework.Assert;

public class CabInvoiceTest {
	
	@Test
	public void givenDistanceAndTimeWhenFareIsFiveShouldBeTotalFare() throws IOException {
		
		CabInvoiceMain cab = new CabInvoiceMain();
		double result = cab.calculateFare(5, 15);
		//int totalfare = cab.totalFare;
		Assert.assertEquals(cab.totalFare, result);
		
	}
	
	@Test
	public void givenDistanceAndTimeWhenFareIsFiveForMultipleRidesShouldBeMultipleTotalFare() throws IOException {
		
		CabInvoiceMain cab = new CabInvoiceMain();
		Scanner scan = new Scanner(System.in);
		
		double result = cab.calculateFare(5, 15);
		System.out.println("Enter number of trips: ");
		int trips = scan.nextInt();
		double totalFare = result * trips;
		
		Assert.assertEquals(totalFare, result*trips);
		System.out.println(totalFare);
		
	}

}
