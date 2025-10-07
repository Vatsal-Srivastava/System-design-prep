package com.vatsal.SystemDesign.LowLevelDesign.ParkingLotSystem.model;

import com.vatsal.SystemDesign.LowLevelDesign.ParkingLotSystem.enums.VehicleType;

public abstract class Vehicle {
	private String licenseNumber;
	private VehicleType type;
	
	public Vehicle(String licenseNumber, VehicleType type) {
		super();
		this.licenseNumber = licenseNumber;
		this.type = type;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public VehicleType getType() {
		return type;
	}
	public void setType(VehicleType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Vehicle [licenseNumber=" + licenseNumber + ", type=" + type + "]";
	}
	
}
