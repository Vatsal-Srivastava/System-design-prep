package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem;

public class PaymentContext {
	private PaymentStrategy payStrat;
	
	public void setPaymentStrategy(PaymentStrategy payStrat) {
		this.payStrat = payStrat;
	}
	
	public void payBill(double amount) {
		payStrat.pay(amount);
	}
}
