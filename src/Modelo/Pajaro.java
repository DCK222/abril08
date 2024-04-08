package Modelo;

public class Pajaro extends Animal {
    @Override
    public String comer() {
        System.out.println("pajaro comiendo...");
        return null;
    }

    @Override
    public String moverse() {
        System.out.println("Pez moviendose...");
        return null;
    }
}
