package runner;

import service.*;

public class SmartHomeRunner {
    public static void main(String[] args) {
        // Initializing all services
        SecurityServiceImpl security = new SecurityServiceImpl();
        LightingServiceImpl lighting = new LightingServiceImpl ();
        MediaServiceImpl media = new MediaServiceImpl();
        TemperatureServiceImpl temperature = new TemperatureServiceImpl();
        EnergyServiceImpl energy = new EnergyServiceImpl();
        DoorServiceImpl door = new DoorServiceImpl ();
        NotificationServiceImpl notification = new NotificationServiceImpl ();
        AssistantServiceImpl assistant = new AssistantServiceImpl ();
        SurveillanceServiceImpl surveillance = new SurveillanceServiceImpl ();
        ApplianceServiceImpl appliance = new ApplianceServiceImpl ();

        // Security System
        System.out.println("\n=== Security System ===");
        security.armSystem();
        security.disarmSystem();

        // Lighting System
        System.out.println("\n=== Lighting System ===");
        lighting.turnOnLights();
        lighting.turnOffLights();

        // Media Control
        System.out.println("\n=== Media System ===");
        media.playMusic("Shape of You");
        media.stopMusic();

        // Temperature Control
        System.out.println("\n=== Temperature Control ===");
        temperature.setTemperature(22);
        System.out.println("Current Temperature: " + temperature.getCurrentTemperature() + "°C");

        // Energy Monitoring
        System.out.println("\n=== Energy Monitoring ===");
        System.out.println("Energy Usage: " + energy.getEnergyUsage() + " kWh");
        energy.resetEnergyUsage();

        // Door Lock System
        System.out.println("\n=== Door Lock System ===");
        door.lockDoor();
        door.unlockDoor();

        // Notification System
        System.out.println("\n=== Notification System ===");
        notification.sendEmailNotification("Your door has been unlocked.");
        notification.sendSMSNotification("Security Alert: Motion detected!");

        // Home Assistant
        System.out.println("\n=== Home Assistant ===");
        assistant.executeVoiceCommand("Turn on the heater");
        System.out.println("Weather Update: " + assistant.getWeatherUpdate());

        // Surveillance System
        System.out.println("\n=== Surveillance System ===");
        surveillance.startRecording();
        surveillance.stopRecording();

        // Appliance Control
        System.out.println("\n=== Appliance Control ===");
        appliance.turnOnAppliance("Air Conditioner");
        appliance.turnOffAppliance("Air Conditioner");

        System.out.println("\n=== Smart Home System Operations Completed Successfully! ===");
    }
}