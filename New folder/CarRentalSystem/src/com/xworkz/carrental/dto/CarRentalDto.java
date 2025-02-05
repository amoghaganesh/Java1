// CarRentalDto.java
package com.xworkz.carrental.dto;

import com.xworkz.carrental.constant.CarTypeConstant;
import com.xworkz.carrental.constant.FuelTypeConstant;
import com.xworkz.carrental.constant.RentalPlanConstant;

public class CarRentalDto {
    private String customerName;
    private CarTypeConstant carType;
    private FuelTypeConstant fuelType;
    private RentalPlanConstant rentalPlan;
    private int duration;
    private double price;

    // Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CarTypeConstant getCarType() {
        return carType;
    }

    public void setCarType(CarTypeConstant carType) {
        this.carType = carType;
    }

    public FuelTypeConstant getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelTypeConstant fuelType) {
        this.fuelType = fuelType;
    }

    public RentalPlanConstant getRentalPlan() {
        return rentalPlan;
    }

    public void setRentalPlan(RentalPlanConstant rentalPlan) {
        this.rentalPlan = rentalPlan;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}