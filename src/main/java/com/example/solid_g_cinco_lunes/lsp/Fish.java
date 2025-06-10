package com.example.solid_g_cinco_lunes.lsp;

public class Fish extends AnimalMaritimo implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Fish makes bubbles.");
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}