package com.example.solid_g_cinco_lunes.lsp;

import com.example.solid_g_cinco_lunes.lsp.Animal;
import com.example.solid_g_cinco_lunes.lsp.AnimalTerrestre;

public class Dog extends AnimalTerrestreimplements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
    
    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }
    
}

