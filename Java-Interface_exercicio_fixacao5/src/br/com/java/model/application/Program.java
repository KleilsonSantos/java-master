package br.com.java.model.application;

import java.util.Locale;

import br.com.java.model.entities.BrazilInterestService;
import br.com.java.model.entities.USInterestService;
import br.com.java.model.services.InterestService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double amount = 200.00;
		int months = 3;

		InterestService serviceBrasil = new BrazilInterestService(2.0);
		InterestService serviceUS = new USInterestService(1.0);

		System.out.println(String.format("%.2f", serviceBrasil.payment(amount, months)));
		System.out.println(String.format("%.2f", serviceUS.payment(amount, months)));
	}
}
