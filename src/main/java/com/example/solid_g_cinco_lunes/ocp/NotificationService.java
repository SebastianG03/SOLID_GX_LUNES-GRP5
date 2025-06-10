package com.example.solid_g_cinco_lunes.ocp;

public class NotificationService {
    public void sendNotification(NotificationSender sender, String message) {
        if (sender != null && sender instanceof NotificationSender) {
            sender.sendNotification(message);
        } else {
            System.out.println("No notification sender provided.");
        }
    }
}



