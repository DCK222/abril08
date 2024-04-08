package Modelo.Ejercicio2;

public class Avion extends Vehiculo implements ObjetoVolador{

    public String Despegar(){
        return " Despegando...";
    }
    public String Aterrizar(){
        return " Aterrizando";
    }

    public String Volar(){
        return " Volando";
    }
}
