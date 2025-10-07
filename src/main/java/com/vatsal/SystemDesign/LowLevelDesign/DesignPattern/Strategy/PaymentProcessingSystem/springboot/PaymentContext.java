package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Strategy.PaymentProcessingSystem.springboot;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentContext {
	
	@Autowired
	private Map<String, PaymentStrategy> payStrat;
	
	public void payBill(String method, Double amount) {
		PaymentStrategy strategy = payStrat.get(method);
		if(strategy == null) throw new IllegalArgumentException("Unknown Method");
		strategy.pay(amount);
	}
}
