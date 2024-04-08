package Presentacion;

import Modelo.*;

public class AnimalesPresentacion {
    public static void main(String[] args) {

        Perro perro1 = new Perro();
        Pez pez1 = new Pez();
        Pajaro pajaro1 = new Pajaro();
        Gusano gusano1 = new Gusano();

        Buitre buitre1 = new Buitre();
        Gorrion gorrion1 = new Gorrion();


        perro1.comer();
        perro1.moverse();

        pez1.comer();
        pez1.moverse();

        pajaro1.comer();
        pajaro1.moverse();

        gusano1.comer();
        gusano1.moverse();

        buitre1.comer();
        buitre1.moverse();

        gorrion1.comer();
        gorrion1.moverse();

    }
}
