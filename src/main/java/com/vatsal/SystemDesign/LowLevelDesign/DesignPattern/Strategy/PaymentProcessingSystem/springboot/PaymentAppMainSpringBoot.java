package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("strategydemo")
@Component
public class PaymentAppMainSpringBoot implements CommandLineRunner {

	@Autowired
	private PaymentContext context;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Running Payment Processing System Strategy Design Pattern Demo...");
		context.payBill("creditCardPayment", 2500.0);
		context.payBill("payPalPayment", 3000.0);
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
//Strategy Pattern = Encapsulate interchangeable behaviors (algorithms) under a common interface so the client can switch them dynamically.

//Component          	Role	                                                   In your code
//Strategy (Interface)	Defines a common contract that all algorithms must follow.	PaymentStrategy
//Concrete Strategies	Implement different variations of that algorithm.	CreditCardPayment, UPIPayment, PayPalPayment
//Context	            Holds a reference to a Strategy and delegates the work to it.	PaymentContext
//Client	            Chooses which strategy to use at runtime.	PaymentAppMainSpringBoot
