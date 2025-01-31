package service;

public class ApplianceServiceImpl implements ApplianceService {
    public void turnOnAppliance(String appliance) {
        System.out.println(appliance + " turned on.");
    }
    public void turnOffAppliance(String appliance) {
        System.out.println(appliance + " turned off.");
    }
}