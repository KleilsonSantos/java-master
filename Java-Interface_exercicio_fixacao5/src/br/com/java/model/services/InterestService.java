package br.com.java.model.services;

public interface InterestService {
	
	double getInterestRate();

	default public double payment(double amount, int months) {
		if (months < 1) {
			throw new IllegalAccessError();
		} else {
			return amount * Math.pow((1 + getInterestRate() / 100), months);
		}
	}
}
