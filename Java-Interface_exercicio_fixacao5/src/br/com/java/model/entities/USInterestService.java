package br.com.java.model.entities;

import br.com.java.model.services.InterestService;

public class USInterestService implements InterestService {

	public double interest;

	public USInterestService(Double interest) {
		this.interest = interest;
	}

	@Override
	public double getInterest() {
		return interest;
	}

}
