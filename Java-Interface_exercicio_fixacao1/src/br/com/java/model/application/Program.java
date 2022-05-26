package br.com.java.model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.java.model.entities.Contract;
import br.com.java.model.entities.Installment;
import br.com.java.model.services.ContractService;
import br.com.java.model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.UK);
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Contract number:");
			int contractNumber = scanner.nextInt();
			System.out.print("Date:");
			Date in = sdf.parse(scanner.next());
			System.out.print("Value:");
			double totalValue = scanner.nextDouble();
			System.out.print("Months number:");
			int monthsNumber = scanner.nextInt();
			Contract contract = new Contract(contractNumber, in, totalValue);
			ContractService contractService = new ContractService(new PaypalService());
			contractService.processContract(contract, monthsNumber);
			for (Installment installment : contract.getList()) {
				System.out.println(installment);
			}
		} catch (ParseException e) {
			e.getMessage();
		}
		scanner.close();
	}

}
