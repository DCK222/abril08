package Presentacion;

import Modelo.Ejercicio4.CocheEj4;
import Modelo.Ejercicio4.TallerMecanica;
import Modelo.Ejercicio4.TallerPintura;

public class PresentacionEjercicio4 {
    public static void main(String[] args) {

        CocheEj4 coche = new CocheEj4();
        coche.setMatricula("7231HTK");
        coche.setModeloCoche("Honda Civic");


        String Modelo = coche.getModeloCoche();
        String Mat = coche.getMatricula();

        System.out.println("Modelo del coche... : " + Modelo);
        System.out.println( "Matricula del coche : " + Mat);


        TallerMecanica tallerMecanica = new TallerMecanica();

        System.out.println("Talle Mecanica" + tallerMecanica.reparar(coche));


        TallerPintura tallerPintura = new TallerPintura();

        System.out.println("Taller Pintura: " + tallerPintura.reparar(coche));
    }
}