package com.CabInvoice;

import java.util.Scanner;

public class CabInvoiceMain {
	int minFarePerKm = 5;
	int totalFare = 0;

	public int calculateFare(int distance) {
		int count = 1;

		if (distance <= 10) {
			do {
				System.out.println(" 1. For Single Trip\n 2. For multiple Trips ");
				System.out.print(" Please enter your choice: ");
				Scanner scan = new Scanner(System.in);

				String option = scan.next();

				switch (option) {

				case "1":
					totalFare = distance * minFarePerKm;
					System.out.println("Single trip Fare: " + totalFare);
					break;
				case "2":
					totalFare = distance * minFarePerKm;
					System.out.println("Enter number of trips you want: ");
					int numberOfTrips = scan.nextInt();
					int trips = numberOfTrips * totalFare;
//					int total = 0;
//					for (int i = 1; i <= 10; i++) {
//						total = total + totalFare;
					count++;
					// }

					// System.out.println("Multiple trips Total Fare: " + total);
					System.out.println("Multiple trips Total Fare: " + trips);
					break;
				default:
					System.out.println("Invalid entry");
				}
			} while (count < 10);
			{

			}

			return totalFare;

		}
		return count;
	}

}
