package Modelo;

public class Pez extends Animal {
    @Override
    public String comer() {
        System.out.println("Pez comiendo...");
        return null;
    }

    @Override
    public String moverse() {
        System.out.println("Pez moviendose");
        return null;
    }
}
