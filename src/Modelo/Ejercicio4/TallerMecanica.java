package Modelo.Ejercicio4;

public class TallerMecanica implements iTaller {
    public TallerMecanica() {
    }

    @Override
    public String reparar(CocheEj4 coche) {
        return "Coche Arreglado...";
    }
}
