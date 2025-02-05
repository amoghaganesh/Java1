// GymServiceImpl.java
package com.xworkz.gym.service;

import com.xworkz.gym.dto.GymDto;

public class GymServiceImpl implements GymService {

    @Override
    public boolean validateAndSave(GymDto dto) {
        if (dto != null) {
            System.out.println("Validating and saving gym membership: " + dto.getMemberName());
            return true;
        }
        return false;
    }
}