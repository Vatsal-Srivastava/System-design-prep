package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem;

public class PayPalPayment implements PaymentStrategy {

	private String email;

	public PayPalPayment(String email) {
		this.email = email;
	}

	@Override
	public void pay(Double amount) {
		System.out.println("Paid " + amount + " using PayPal account: " + email);
	}

}
