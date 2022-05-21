package br.com.java.section18.model.services;

public interface OnlinePaymentService {
	double paymentFree(Double amount);
	double interest(Double amount, Integer months);
}
