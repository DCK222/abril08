package Presentacion;

import Modelo.Ejercicio5.*;
import jdk.swing.interop.SwingInterOpUtils;

public class PresentacionTrabajo {
    public static void main(String[] args) {
        IInforme informeTrimestre1 = new InformeTrimestre1();
        IInforme informeTrimestre2 = new InformeTrimestre2();



        Jefe jefe1 = new Jefe(informeTrimestre1);
        Director director = new Director(informeTrimestre2);
        Secretario secretario = new Secretario("Softek", "alejandro@softek.com");


        System.out.println("Tareas Jefe " +  jefe1.getTareas());
        System.out.println("Informe Jefe " +  jefe1.getInforme());


        System.out.println("Tareas del Director: " + director.getTareas());
        System.out.println("Informe director : " + director.getInforme());

        System.out.println("Tareas del Secretario: " + jefe1.getTareas());
    }
}