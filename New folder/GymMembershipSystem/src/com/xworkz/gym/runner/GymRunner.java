// GymRunner.java
package com.xworkz.gym.runner;

import com.xworkz.gym.constant.MembershipPlanConstant;
import com.xworkz.gym.constant.PaymentModeConstant;
import com.xworkz.gym.constant.TrainerTypeConstant;
import com.xworkz.gym.dto.GymDto;
import com.xworkz.gym.service.GymService;
import com.xworkz.gym.service.GymServiceImpl;

public class GymRunner {
    public static void main(String[] args) {
        GymDto dto = new GymDto();
        dto.setMemberName("Bob");
        dto.setMembershipPlan(MembershipPlanConstant.YEARLY);
        dto.setPaymentMode(PaymentModeConstant.ONLINE);
        dto.setTrainerType(TrainerTypeConstant.PERSONAL);
        dto.setDuration(12);
        dto.setFees(15000.00);

        GymService service = new GymServiceImpl();
        service.validateAndSave(dto);
    }
}