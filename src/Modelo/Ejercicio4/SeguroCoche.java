package Modelo.Ejercicio4;

import Modelo.Ejercicio3.Coche;

public class SeguroCoche implements iTaller{
    private String Aseguradora;

    private iTaller taller;

    public String reparar(CocheEj4 coche){
        return taller.reparar(coche);
    }

    public SeguroCoche(iTaller taller , String Aseguradora) {
        this.taller = taller;
        this.Aseguradora = Aseguradora;
    }


    public void setAseguradora(String aseguradora) {
        Aseguradora = aseguradora;
    }

    public String getAseguradora() {
        return Aseguradora;
    }




}
