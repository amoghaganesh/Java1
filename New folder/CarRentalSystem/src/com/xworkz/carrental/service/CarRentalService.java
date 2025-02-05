// CarRentalService.java
package com.xworkz.carrental.service;

import com.xworkz.carrental.dto.CarRentalDto;

public interface CarRentalService {
    boolean validateAndSave(CarRentalDto dto);
}