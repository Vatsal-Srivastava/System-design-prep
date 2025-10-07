package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem.springboot;

public interface PaymentStrategy {
//	Purpose: Defines the common interface for all payment methods.
	public void pay(Double amount);
}
