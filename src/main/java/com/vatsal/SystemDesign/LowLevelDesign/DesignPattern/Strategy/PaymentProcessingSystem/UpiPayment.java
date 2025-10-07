package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem;

public class UpiPayment implements PaymentStrategy {
	
	private String upiId;

	public UpiPayment(String upiId) {
		this.upiId = upiId;
	}
	
	@Override
	public void pay(Double amount) {
		System.out.println("Paid " + amount + " using UPI ID: " + upiId);
	}

}
