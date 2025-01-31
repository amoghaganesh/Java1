package dto;

public interface SmartNotification {
    void sendEmailNotification(String message);
    void sendSMSNotification(String message);
}
