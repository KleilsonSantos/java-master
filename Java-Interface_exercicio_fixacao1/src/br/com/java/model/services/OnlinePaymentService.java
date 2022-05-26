package br.com.java.model.services;

public interface OnlinePaymentService {
	double paymentFree(Double amount);
	double interest(Double amount, Integer months);
}
