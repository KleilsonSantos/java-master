package br.com.java.section18.model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import br.com.java.section18.model.entities.CarRental;
import br.com.java.section18.model.entities.Vehicle;
import br.com.java.section18.model.services.BrazilTaxService;
import br.com.java.section18.model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		Locale.setDefault(Locale.UK);
		try {
			String model = "Civic";
			Date in = sdf.parse("25/06/2018 10:30");
			Date out = sdf.parse("25/06/2018 14:40");
			double valuePerHour = 10.0;
			double valuePerDay = 130.0;
			
			CarRental cR = new CarRental(in, out, new Vehicle(model));
			RentalService rS = new RentalService(valuePerHour, valuePerDay, new BrazilTaxService());
			rS.processingInvoice(cR);
			
			System.out.println("INVOICE");
			System.out.println("Basic payment: " + String.format("%.2f", cR.getInvoice().getBasicPayment()));
			System.out.println("Tax: " + cR.getInvoice().getTax());
			System.out.println("Total payment: " + String.format("%.2f", cR.getInvoice().getTotalPayment()));
		} catch (ParseException e) {
			System.err.println("Error: " + e.getMessage());
		} catch (NullPointerException e) {
			System.err.println("Error: " + e.getMessage());
		}

	}
	
}
