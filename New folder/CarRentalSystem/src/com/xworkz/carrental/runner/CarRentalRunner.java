// CarRentalRunner.java
package com.xworkz.carrental.runner;

import com.xworkz.carrental.constant.CarTypeConstant;
import com.xworkz.carrental.constant.FuelTypeConstant;
import com.xworkz.carrental.constant.RentalPlanConstant;
import com.xworkz.carrental.dto.CarRentalDto;
import com.xworkz.carrental.service.CarRentalService;
import com.xworkz.carrental.service.CarRentalServiceImpl;

public class CarRentalRunner {
    public static void main(String[] args) {
        CarRentalDto dto = new CarRentalDto();
        dto.setCustomerName("Charlie");
        dto.setCarType(CarTypeConstant.SUV);
        dto.setFuelType(FuelTypeConstant.DIESEL);
        dto.setRentalPlan(RentalPlanConstant.DAILY);
        dto.setDuration(5);
        dto.setPrice(5000.00);

        CarRentalService service = new CarRentalServiceImpl();
        service.validateAndSave(dto);
    }
}