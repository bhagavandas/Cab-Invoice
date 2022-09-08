package com.CabInvoice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CabInvoiceMain {
	int minFarePerKm = 5;
	int totalFare = 0;
	int numberOfTrips;
	int multipleTripsFare;
	int average;

	public int calculateFare(int distance) throws IOException {
		int count = 1;

		if (distance <= 10) {
			do {
				System.out.println(" 1. For Single Trip\n 2. For multiple Trips and For Invoice ");
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
					numberOfTrips = scan.nextInt();
					multipleTripsFare = numberOfTrips * totalFare;
//					int total = 0;
//					for (int i = 1; i <= 10; i++) {
//						total = total + totalFare;
					count++;
					// }
					// System.out.println("Multiple trips Total Fare: " + total);
					System.out.println("Multiple trips Total Fare: " + multipleTripsFare);
					
				case "3":
					System.out.println("...................INVOICE......................");
					System.out.println("Total number of Rides: " + numberOfTrips);
					System.out.println("Total Fare: " + multipleTripsFare);
					average = (multipleTripsFare / numberOfTrips);
					System.out.println("Average Fare per Ride: " + average);
					File file = new File("src\\Invoice.txt");
					file.createNewFile();
					FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write("INVOICE : " + " \n1. Total number of Rides: " + numberOfTrips + " \n2. Total Fare: " + multipleTripsFare + "\n3. Average Fare per Ride: "
							+ average + "\n");
					bw.close();
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
