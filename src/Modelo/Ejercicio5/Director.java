package Modelo.Ejercicio5;

public class Director implements IEmpleado {
    private IInforme informe;


    public Director(IInforme informe) {
        this.informe = informe;
    }

    public Director() {

    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String getTareas() {
        return "Teareas del Director";
    }
}
