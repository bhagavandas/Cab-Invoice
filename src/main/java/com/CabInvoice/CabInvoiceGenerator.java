package com.CabInvoice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CabInvoiceGenerator {
	
	int minFarePerKm = 5;
	double totalFare = 0;
	final int COST_PER_KM = 10;
	final int COST_PER_MIN = 1;
	int numberOfTrips;
	double multipleTripsFare;
	double average;
	Scanner scan = new Scanner(System.in);

	
	public double calculateFare(double distance, double time) {
		double totalFare = COST_PER_KM * distance + COST_PER_MIN * time;
		if (totalFare > minFarePerKm)
			return totalFare;
		else
			return minFarePerKm;
	}
	
	public double calculateFareForMultipleRides(double distance, double time) {
		totalFare = distance * minFarePerKm;
		System.out.println("Enter number of trips you want: ");
		numberOfTrips = scan.nextInt();
		multipleTripsFare = numberOfTrips * totalFare;
		System.out.println("Multiple trips Total Fare: " + multipleTripsFare);
		return multipleTripsFare;

}
	
	public double generateInvoice(double distance, double time) {
		System.out.println("...................INVOICE......................");
		System.out.println("Total number of Rides: " + numberOfTrips);
		System.out.println("Total Fare: " + multipleTripsFare);
		average = (multipleTripsFare / numberOfTrips);
		System.out.println("Average Fare per Ride: " + average);
		return multipleTripsFare;
}
	public double generateInvoiceSummary(double distance, double time) throws IOException {
		File file = new File("src\\Invoice.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("INVOICE : " + " \n1. Total number of Rides: " + numberOfTrips + " \n2. Total Fare: "
				+ multipleTripsFare + "\n3. Average Fare per Ride: " + average + "\n");
		bw.close();
		return multipleTripsFare;
}
	
	
}
