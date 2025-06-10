package com.example.solid_g_cinco_lunes.ocp;

public class PushNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}

 
