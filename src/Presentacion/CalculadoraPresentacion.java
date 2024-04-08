package Presentacion;

import Modelo.Ejercicio8.Calculadora;
import Modelo.Ejercicio8.ExcepcionCalculadora;

import java.util.Scanner;

public class CalculadoraPresentacion extends Calculadora {
    public static void main(String[] args) throws ExcepcionCalculadora {
        int num1 = 20;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Que Operacion Quieres Realizar (+,-,*,/)");
        String respuesta = sc.nextLine();


        switch (respuesta){
            case "+" :
                System.out.println("Suma : " + Calculadora.sumar(num1,num2));
                break;

            case "-" :
                System.out.println("Resta : " + Calculadora.restar(num1,num2));
                break;
            case "*" :
                System.out.println("Multiplicacion : " + Calculadora.multiplicar(num1,num2));
                break;
            case "/" :
                System.out.println("Division" + Calculadora.dividir(num1,num2));
                break;

        }
    }


}
