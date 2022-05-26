package br.com.java.model.entities;

import br.com.java.model.services.InterestService;

public class BrazilInterestService implements InterestService {

	public double interest;

	public BrazilInterestService(Double interest) {
		this.interest = interest;
	}

	@Override
	public double getInterest() {
		return interest;
	}

}
