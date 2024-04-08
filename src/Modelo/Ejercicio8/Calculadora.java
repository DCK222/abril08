package Modelo.Ejercicio8;

public class Calculadora {

    public static int sumar( int num1,  int num2){
        return num1 + num2;
    }
    public static int restar(int num1, int num2){
        return num1 + num2;
    }

    public static int multiplicar(int num1, int num2){
        return  num1 * num2;
    }


    public static int dividir(int num1, int num2) throws ExcepcionCalculadora {
        if (num2 == 0){
            throw new ExcepcionCalculadora("El numero tiene que ser mayor que 0");
        }
        return num1 / num2;
    }



}
