package service;

public class AssistantServiceImpl implements AssistantService {
    public void executeVoiceCommand(String command) {
        System.out.println("Executing Voice Command: " + command);
    }
    public String getWeatherUpdate() {
        return "Sunny, 25°C";
    }
}