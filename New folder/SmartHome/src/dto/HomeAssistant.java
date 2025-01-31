package dto;

public interface HomeAssistant {
    void executeVoiceCommand(String command);
    String getWeatherUpdate();
}
