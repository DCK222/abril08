package Modelo;

public class Gusano extends Animal {
    @Override
    public String comer() {
        System.out.println("Gusano comiendo..." );
        return null;
    }

    @Override
    public String moverse() {
        System.out.println("Gusano moviendose");
        return null;
    }
}
