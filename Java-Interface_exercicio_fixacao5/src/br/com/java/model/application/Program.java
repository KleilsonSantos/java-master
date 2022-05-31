package br.com.java.model.application;

import java.util.Locale;

import br.com.java.model.entities.BrazilInterestService;
import br.com.java.model.entities.UsInterestService;
import br.com.java.model.services.InterestService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double amount = 200.00;
		int months = 3;
		
		InterestService brazil = new BrazilInterestService(2.0);
		InterestService us = new UsInterestService(1.0);
		System.out.println("Juros de Empréstimo no Brazil: " + String.format("%.2f", brazil.payment(amount, months)));
		System.out.println("Juros de Empréstimo no USA: " + String.format("%.2f", us.payment(amount, months)));
	}
}
