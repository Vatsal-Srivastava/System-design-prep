package com.vatsal.SystemDesign.LowLevelDesign.ParkingLotSystem.model;

import com.vatsal.SystemDesign.LowLevelDesign.ParkingLotSystem.enums.VehicleType;

public class Bike extends Vehicle {

	public Bike(String licenseNumber, VehicleType type) {
		super(licenseNumber, VehicleType.BIKE);
	}

}
