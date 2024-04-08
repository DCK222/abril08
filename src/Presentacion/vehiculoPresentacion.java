package Presentacion;

import Modelo.Ejercicio3.Coche;
import Modelo.Ejercicio3.Conductor;
import Modelo.Ejercicio3.Ivehiculo;

public class vehiculoPresentacion {
    public static void main(String[] args) {

        Coche coche1 = new Coche();

        coche1.deposito = 50;

        System.out.println( "Coche " + coche1.moverse());
    }
}
