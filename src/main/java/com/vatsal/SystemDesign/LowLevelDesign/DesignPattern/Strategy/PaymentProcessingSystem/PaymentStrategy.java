package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem;

public interface PaymentStrategy {
//	Purpose: Defines the common interface for all payment methods.
	public void pay(Double amount);
}
