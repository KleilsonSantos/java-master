package br.com.java.section18.model.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import br.com.java.section18.model.entities.Contract;
import br.com.java.section18.model.entities.Installment;
import br.com.java.section18.model.services.PaypalService;
import br.com.java.section18.model.services.ContractService;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.UK);

		int number = 8021;
		Date in = sdf.parse("25/06/2018");
		double totalValue = 600.00;
		int months = 3;
		Contract contract = new Contract(number, in, totalValue);
		ContractService cS = new ContractService(new PaypalService());

		cS.processContract(contract, months);
	
		for(Installment installment : contract.getList()) {
			System.out.println(installment);
		}
		
	}

}
