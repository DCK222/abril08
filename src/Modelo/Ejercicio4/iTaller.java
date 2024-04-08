package Modelo.Ejercicio4;

public interface iTaller {
    default String reparar(CocheEj4 coche) {

        return  coche.getMatricula() + " reparado...";

    }
}
