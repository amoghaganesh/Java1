// GymDto.java
package com.xworkz.gym.dto;

import com.xworkz.gym.constant.MembershipPlanConstant;
import com.xworkz.gym.constant.PaymentModeConstant;
import com.xworkz.gym.constant.TrainerTypeConstant;

public class GymDto {
    private String memberName;
    private MembershipPlanConstant membershipPlan;
    private PaymentModeConstant paymentMode;
    private TrainerTypeConstant trainerType;
    private int duration;
    private double fees;

    // Getters and Setters
    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public MembershipPlanConstant getMembershipPlan() {
        return membershipPlan;
    }

    public void setMembershipPlan(MembershipPlanConstant membershipPlan) {
        this.membershipPlan = membershipPlan;
    }

    public PaymentModeConstant getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentModeConstant paymentMode) {
        this.paymentMode = paymentMode;
    }

    public TrainerTypeConstant getTrainerType() {
        return trainerType;
    }

    public void setTrainerType(TrainerTypeConstant trainerType) {
        this.trainerType = trainerType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
}