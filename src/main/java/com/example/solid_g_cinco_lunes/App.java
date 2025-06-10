package com.example.solid_g_cinco_lunes;

import com.example.solid_g_cinco_lunes.ocp.EmailNotificationSender;
import com.example.solid_g_cinco_lunes.ocp.NotificationService;
import com.example.solid_g_cinco_lunes.ocp.PushNotificationSender;
import com.example.solid_g_cinco_lunes.ocp.SMSNotificationSender;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }

    public void walk() {
        System.out.println("Animal is walking.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

class Fish extends Animal {
    @Override
    public void walk() {
        throw new UnsupportedOperationException("Fish can't walk.");
    }
}

public class App 
{
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal fish = new Fish();

        dog.makeSound();
        dog.walk();

        fish.makeSound();
        fish.walk(); // Excepción: UnsupportedOperationException
        
        //NotificationService service = new NotificationService();
        //EmailNotificationSender emailSender = new EmailNotificationSender();
        //SMSNotificationSender smsSender = new SMSNotificationSender();
        //PushNotificationSender pushSender = new PushNotificationSender();
        // NotificationSender notification = new NotificationSender();
        //service.sendNotification(emailSender, "Hello via Email!");
        //service.sendNotification(smsSender, "Hello via SMS!");
        //service.sendNotification(pushSender, "Hello via Push Notification!");

        //UserManager userManager = new UserManager();
        //userManager.addUser("example@domain.com", "password123");
        //userManager.addUser("invalid-email", "1234");
    }
}
