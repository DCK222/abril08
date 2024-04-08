package Modelo;

public class Perro extends Animal {

    @Override
    public String comer() {
        System.out.println("Perro comiendo...");
        return null;
    }

    @Override
    public String moverse() {

        System.out.println("Perro moviendose");
        return null;
    }
}
