package com.example.solid_g_cinco_lunes;

import com.example.solid_g_cinco_lunes.ocp.EmailNotificationSender;
import com.example.solid_g_cinco_lunes.ocp.NotificationService;
import com.example.solid_g_cinco_lunes.ocp.PushNotificationSender;
import com.example.solid_g_cinco_lunes.ocp.SMSNotificationSender;

public class App 
{
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        EmailNotificationSender emailSender = new EmailNotificationSender();
        SMSNotificationSender smsSender = new SMSNotificationSender();
        PushNotificationSender pushSender = new PushNotificationSender();
        // NotificationSender notification = new NotificationSender();
        service.sendNotification(emailSender, "Hello via Email!");
        service.sendNotification(smsSender, "Hello via SMS!");
        service.sendNotification(pushSender, "Hello via Push Notification!");

        //UserManager userManager = new UserManager();
        //userManager.addUser("example@domain.com", "password123");
        //userManager.addUser("invalid-email", "1234");
    }
}
