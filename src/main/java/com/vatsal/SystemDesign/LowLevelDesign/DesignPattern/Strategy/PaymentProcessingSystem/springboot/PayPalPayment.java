package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem.springboot;

import org.springframework.stereotype.Component;

@Component("payPalPayment")
public class PayPalPayment implements PaymentStrategy {

	private String email = "vatsal@email.com";

	@Override
	public void pay(Double amount) {
		System.out.println("Paid " + amount + " using PayPal account: " + email);
	}

}
