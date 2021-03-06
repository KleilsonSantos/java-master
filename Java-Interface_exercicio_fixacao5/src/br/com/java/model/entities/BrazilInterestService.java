package br.com.java.model.entities;

import br.com.java.model.services.InterestService;

public class BrazilInterestService implements InterestService {

	private double interestRate;

	public BrazilInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
