package br.com.java.model.entities;

import br.com.java.model.services.InterestService;

public class UsInterestService implements InterestService {

	private double interestRate;

	public UsInterestService(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}

}
