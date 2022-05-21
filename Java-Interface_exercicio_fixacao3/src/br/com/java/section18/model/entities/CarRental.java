package br.com.java.section18.model.entities;

import java.util.Date;

public class CarRental {
	private Date datePickup;
	private Date dateReturn;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {
	}

	public CarRental(Date datePickup, Date dateReturn, Vehicle vehicle) {
		this.datePickup = datePickup;
		this.dateReturn = dateReturn;
		this.vehicle = vehicle;
	}

	public Date getDatePickup() {
		return datePickup;
	}

	public void setDatePickup(Date datePickup) {
		this.datePickup = datePickup;
	}

	public Date getDateReturn() {
		return dateReturn;
	}

	public void setDateReturn(Date dateReturn) {
		this.dateReturn = dateReturn;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}


}
