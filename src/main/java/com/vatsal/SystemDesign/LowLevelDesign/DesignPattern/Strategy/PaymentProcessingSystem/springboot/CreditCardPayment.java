package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem.springboot;

import org.springframework.stereotype.Component;

@Component("creditCardPayment")
public class CreditCardPayment implements PaymentStrategy {

	private Long cardNumber = 123456789L;


	@Override
	public void pay(Double amount) {
		System.out.println("Paid " + amount + " using Card number: " + cardNumber);
	}

}
