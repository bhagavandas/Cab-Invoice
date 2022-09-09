package com.CabInvoice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CabInvoiceMain {
	int minFarePerKm = 5;
	double totalFare = 0;
	final int COST_PER_KM = 10;
	final int COST_PER_MIN = 1;
	int numberOfTrips;
	double multipleTripsFare;
	double average;

	public double calculateFare(double distance, double time) throws IOException {
		int count = 1;
		CabInvoiceGenerator cabinvoice = new CabInvoiceGenerator();

		if (distance <= 10) {
			do {
				System.out.println(" 1. For Single Trip Fare\n 2. For multiple Trips\n 3. For Invoice\n 4. InvoiceSummary\n "
						+ "5.For Premium Multiple Rides Fare\n 6.Invoice For Premium Rides\n 7.Invoice Summary For Multiple Rides\n");
				
				System.out.print(" Please enter your choice: ");
				Scanner scan = new Scanner(System.in);

				String option = scan.next();

				switch (option) {

				case "1":
					cabinvoice.calculateFare(distance, time);
					break;
					
				case "2":
					cabinvoice.calculateFareForMultipleRides(distance, time);
					break;

				case "3":
					cabinvoice.calculateFareForMultipleRides(distance, time);
					cabinvoice.generateInvoice(distance, time);
					break;
					
				case "4":
					cabinvoice.calculateFareForMultipleRides(distance, time);
					cabinvoice.generateInvoice(distance, time);
					cabinvoice.generateInvoiceSummary(distance, time);
					break;
					
				case "5":
					cabinvoice.CalculateFareForPremiumMultipleRides(distance, time);
					break;
					
				case "6":
					cabinvoice.CalculateFareForPremiumMultipleRides(distance, time);
					cabinvoice.generateInvoiceForPremiumRides(distance, time);
					break;
					
				case "7":
					cabinvoice.CalculateFareForPremiumMultipleRides(distance, time);
					cabinvoice.generateInvoiceForPremiumRides(distance, time);
					cabinvoice.generateInvoiceSummaryForPremiumRides(distance, time);
					break;
					
				default:
					System.out.println("Invalid entry");
				}
			} while (count < 1);
			{

			}

			return totalFare;

		}
		return count;
	}

}
