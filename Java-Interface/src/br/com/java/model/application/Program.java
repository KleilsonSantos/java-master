package br.com.java.model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.java.model.entities.CarRental;
import br.com.java.model.entities.Vehicle;
import br.com.java.model.services.BrazilTaxService;
import br.com.java.model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		Locale.setDefault(Locale.UK);
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Model car:");
			String model = scanner.next();
			System.out.print("Date In: ");
			Date in = sdf.parse(scanner.next());
			System.out.print("Date Out: ");
			Date out = sdf.parse(scanner.next());
			System.out.print("Value per hour: ");
			double valuePerHour = 10.00;
			System.out.print("Value per day: ");
			double valuePerDay = 130.00;

			CarRental carRental = new CarRental(in, out, new Vehicle(model));
			RentalService rentalService = new RentalService(valuePerHour, valuePerDay, new BrazilTaxService());
			rentalService.processingInvoice(carRental);

			System.out.println("INVOICE");
			System.out.println("Basic payment: " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
			System.out.println("Tax: " + carRental.getInvoice().getTax());
			System.out.println("Total payment: " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
		} catch (ParseException e) {
			System.err.println("Error: " + e.getMessage());
		} catch (NullPointerException e) {
			System.err.println("Error: " + e.getMessage());
		}
		scanner.close();
	}

}
