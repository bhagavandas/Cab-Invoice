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

				}

			} while (count < 10);
			{

			}

			return totalFare;

		}
		return count;
	}

}
