package service;

public class EnergyServiceImpl implements EnergyService {
    private double energyUsage = 100.5;

    public double getEnergyUsage() {
        return energyUsage;
    }

    public void resetEnergyUsage() {
        energyUsage = 0.0;
        System.out.println("Energy usage reset.");
    }
}
