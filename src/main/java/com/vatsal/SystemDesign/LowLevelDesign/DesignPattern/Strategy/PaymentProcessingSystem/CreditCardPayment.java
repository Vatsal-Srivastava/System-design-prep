package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem;

public class CreditCardPayment implements PaymentStrategy {

	private Long cardNumber;

	public CreditCardPayment(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(Double amount) {
		System.out.println("Paid " + amount + " using Card number: " + cardNumber);
	}

}
