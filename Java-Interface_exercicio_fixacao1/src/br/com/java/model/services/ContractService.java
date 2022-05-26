package br.com.java.model.services;

import java.util.Calendar;
import java.util.Date;

import br.com.java.model.entities.Contract;
import br.com.java.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService = new PaypalService();
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer month) {
		double free = onlinePaymentService.paymentFree(contract.getTotalValue() / month);
		for (int i = 1; i <= month; i++) {
			Date date = addMonths(contract.getDate(), i);
			double interest = onlinePaymentService.interest(free, i);
			contract.addInstalment(new Installment(date, interest));
		}
	}

	public Date addMonths(Date date, Integer number) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, number);
		return cal.getTime();
	}
}
