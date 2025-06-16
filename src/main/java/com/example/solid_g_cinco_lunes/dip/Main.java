package com.example.solid_g_cinco_lunes.dip;


class Phone implements Device, Rechargeable {
    @Override
    public void turnOn() {
        System.out.println("Phone is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Phone is turning off.");
    }

    @Override
    public void charge() {
        System.out.println("Phone is charging.");
    }
}

class DisposableCamera implements Device {
    @Override
    public void turnOn() {
        System.out.println("Disposable camera is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Disposable camera is turning off.");
    }
}

class Tablet implements Device, Rechargeable {
    @Override
    public void turnOn() {
        System.out.println("Tablet is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Tablet is turning off.");
    }

    @Override
    public void charge() {
        System.out.println("Tablet is charging.");
    }
}

class DisposableFlashlight implements Device {
    @Override
    public void turnOn() {
        System.out.println("Disposable flashlight is turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Disposable flashlight is turning off.");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DISPOSITIVOS RECARGABLES ===");
        
        Device phone = new Phone();
        phone.turnOn();
        if (phone instanceof Rechargeable) {
            ((Rechargeable) phone).charge();
        }
        phone.turnOff();
        
        System.out.println();
        
        Device tablet = new Tablet();
        tablet.turnOn();
        if (tablet instanceof Rechargeable) {
            ((Rechargeable) tablet).charge();
        }
        tablet.turnOff();
        
        System.out.println("\n=== DISPOSITIVOS NO RECARGABLES ===");
        
        Device camera = new DisposableCamera();
        camera.turnOn();
        if (camera instanceof Rechargeable) {
            ((Rechargeable) camera).charge();
        } else {
            System.out.println("Disposable camera cannot be charged.");
        }
        camera.turnOff();
        
        System.out.println();
        
        Device flashlight = new DisposableFlashlight();
        flashlight.turnOn();
        if (flashlight instanceof Rechargeable) {
            ((Rechargeable) flashlight).charge();
        } else {
            System.out.println("Disposable flashlight cannot be charged.");
        }
        flashlight.turnOff();
        
        System.out.println("\n=== DEMOSTRACIÓN DE POLIMORFISMO ===");
        
        Device[] devices = {
            new Phone(),
            new DisposableCamera(),
            new Tablet(),
            new DisposableFlashlight()
        };
        
        for (Device device : devices) {
            System.out.println("\nProcessing device: " + device.getClass().getSimpleName());
            device.turnOn();
            
            if (device instanceof Rechargeable) {
                ((Rechargeable) device).charge();
            } else {
                System.out.println("This device is not rechargeable.");
            }
            
            device.turnOff();
        }
    }
}