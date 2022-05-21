package br.com.java.section18.model.services;

public class BrazilTaxService implements TaxService{

	public double taxService(Double amount) {
		if(amount <= 100.0) {
			return amount * 0.2;
		}else{
			return amount * 0.15;	
		}
		
	}
}
