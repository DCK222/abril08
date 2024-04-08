package Modelo.Ejercicio5;

public class Secretario implements IEmpleado{
    private IInforme informe;
    private IEmpleado tareas;
    private String empresa;
    private String email ;

    public Secretario(String empresa, String email) {
        this.empresa = empresa;
        this.email = email;
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    @Override
    public String getTareas() {
        return tareas.getTareas();
    }


    public void setInforme(IInforme informe){
    this.informe = informe;
    }


}
