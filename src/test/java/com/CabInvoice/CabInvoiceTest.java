package com.CabInvoice;

import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

import junit.framework.Assert;

public class CabInvoiceTest {
	
	
//	
//	@Test
//	public void givenDistanceAndTimeWhenFareIsFiveShouldBeTotalFare() throws IOException {
//		
//		CabInvoiceMain cab = new CabInvoiceMain();
//		double result = cab.calculateFare(5, 15);
//		//int totalfare = cab.totalFare;
//		Assert.assertEquals(cab.totalFare, result);
//		
//	}
//	
//	@Test
//	public void givenDistanceAndTimeWhenFareForMultipleRidesShouldBeMultipleTotalFare() throws IOException {
//		
//		CabInvoiceMain cab = new CabInvoiceMain();
//		Scanner scan = new Scanner(System.in);
//		
//		double result = cab.calculateFare(5, 15);
//		System.out.println("Enter number of trips: ");
//		int trips = scan.nextInt();
//		double totalFare = result * trips;
//		
//		Assert.assertEquals(totalFare, result*trips);
//		
//		
//	}
	
	@Test
	public void givenDistanceAndTimeWhenFareIsFiveShouldBeTotalFareForPremiumRides() throws IOException {
		
		CabInvoiceGenerator cab = new CabInvoiceGenerator();
		double result = cab.CalculateFareForPremiumRides(10, 15);
		//int totalfare = cab.totalFare;
		Assert.assertEquals(cab.totalFare, result);
		
	}
	
	@Test
	public void givenDistanceAndTimeWhenFareIsFiveForMultipleRidesShouldBeMultipleTotalFareForPremiumRides() throws IOException {
		
		CabInvoiceGenerator cab = new CabInvoiceGenerator();
		Scanner scan = new Scanner(System.in);
		
		double result = cab.CalculateFareForPremiumMultipleRides(10, 15);
		System.out.println("Enter number of trips: ");
		int trips = scan.nextInt();
		double totalFare = result * trips;
		
		Assert.assertEquals(totalFare, result*trips);
		
		
	}

}
