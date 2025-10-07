package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem.springboot;

import org.springframework.stereotype.Component;

@Component("upiPayment")
public class UpiPayment implements PaymentStrategy {
	
	private String upiId = "vatsal@ybl";
	
	@Override
	public void pay(Double amount) {
		System.out.println("Paid " + amount + " using UPI ID: " + upiId);
	}

}
