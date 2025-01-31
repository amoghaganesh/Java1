package service;

public class NotificationServiceImpl implements NotificationService {
    public void sendEmailNotification(String message) {
        System.out.println("Email Notification Sent: " + message);
    }
    public void sendSMSNotification(String message) {
        System.out.println("SMS Notification Sent: " + message);
    }
}