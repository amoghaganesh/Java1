package service;

public class TemperatureServiceImpl implements TemperatureService {
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to " + temperature + "°C");
    }

    public int getCurrentTemperature() {
        return this.temperature;
    }
}