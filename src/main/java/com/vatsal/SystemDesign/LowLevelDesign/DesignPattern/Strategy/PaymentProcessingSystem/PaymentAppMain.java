package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem;

public class PaymentAppMain {

	public static void main(String[] args) {
		PaymentContext payment = new PaymentContext();
		
		payment.setPaymentStrategy(new CreditCardPayment(Long.valueOf(1234567890)));
		payment.payBill(2000);
		
		payment.setPaymentStrategy(new UpiPayment("vatsal@ybl"));
		payment.payBill(2500);
		
		payment.setPaymentStrategy(new PayPalPayment("vatsal@mail.com"));
		payment.payBill(3000);
	}

}

//NOTES
//Strategy Pattern is a behavioral design pattern that lets you define a family of algorithms (or behaviors), encapsulate each one as a separate class, and make them interchangeable at runtime — without changing the client code.
//
//It helps you switch behavior dynamically.
//Instead of using if-else everywhere, you delegate the work to different strategy classes that share a common interface.
//
//Think of a payment gateway:
//You can pay by Credit Card, PayPal, or UPI — each has a different process, but all achieve the same goal: make payment.
//The system just picks the strategy you choose at runtime.
//
//Core Components
//Component	Role
//Strategy Interface	Declares the common behavior (e.g., pay()).
//Concrete Strategies	Implement specific behaviors (e.g., PayPal, UPI).
//Context	Uses a Strategy and delegates the call.
//Client	Chooses which Strategy to use at runtime.
