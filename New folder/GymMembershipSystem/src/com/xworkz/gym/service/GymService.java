// GymService.java
package com.xworkz.gym.service;

import com.xworkz.gym.dto.GymDto;

public interface GymService {
    boolean validateAndSave(GymDto dto);
}