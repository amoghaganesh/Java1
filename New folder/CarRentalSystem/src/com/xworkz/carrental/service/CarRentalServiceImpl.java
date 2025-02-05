// CarRentalServiceImpl.java
package com.xworkz.carrental.service;

import com.xworkz.carrental.dto.CarRentalDto;

public class CarRentalServiceImpl implements CarRentalService {

    @Override
    public boolean validateAndSave(CarRentalDto dto) {
        if (dto != null) {
            System.out.println("Validating and saving car rental: " + dto.getCustomerName());
            return true;
        }
        return false;
    }
}