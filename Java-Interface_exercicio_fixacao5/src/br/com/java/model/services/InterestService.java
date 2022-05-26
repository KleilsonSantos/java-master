package br.com.java.model.services;

import br.com.java.model.entities.InvalideOperation;

public interface InterestService {
	double getInterest();

	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalideOperation("Error: mês inválido.");
		}
		return amount * Math.pow((1 + (getInterest() / 100)), months);
	}
}
