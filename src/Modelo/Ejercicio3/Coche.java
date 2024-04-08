package Modelo.Ejercicio3;

public class Coche {
    public int deposito;


    public Coche() {

    }

    public String moverse(){
        if (deposito > 0 ) {
            return "moviendose";
        } else{
            return "no hay combustible";
        }
    }
}
