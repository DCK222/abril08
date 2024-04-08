package Modelo.Ejercicio5;

public class Jefe implements IEmpleado{
    private IInforme informe;

    public Jefe(IInforme informe) {
        this.informe = informe;
    }

    public Jefe() {

    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String getTareas() {
        return "Trabajo del jefe";
    }
}
