package br.com.java.model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public double paymentFree(Double amount) {
		return amount +(amount * 0.02);
	}

	@Override
	public double interest(Double amount, Integer months) {
		return amount + (amount * 0.01 * months);
	}
}
