package Presentacion;

import Modelo.Ejercicio2.Avion;
import Modelo.Ejercicio2.Barcaza;
import Modelo.Ejercicio2.Helicoptero;
import Modelo.Ejercicio2.Hidroavion;

public class PresentacionEJ2 {
    public static void main(String[] args) {

        Avion avion = new Avion();
        Barcaza barcaza = new Barcaza();
        Helicoptero helicoptero = new Helicoptero();
        Hidroavion hidroavion = new Hidroavion();


        System.out.println("Avión:");
        System.out.println(avion.Despegar());

        System.out.println("Barcaza:");

        System.out.println(barcaza.navegar());

        System.out.println("Helicóptero:");
        System.out.println(helicoptero.Despegar());
        System.out.println(helicoptero.Volar());

        System.out.println("Hidroavión:");

        System.out.println(hidroavion.Aterrizar());
    }
}
