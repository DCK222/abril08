package Presentacion;

import Modelo.Ejercicio7.ExcepcionProducto;
import Modelo.Ejercicio7.Producto;

public class ProductoPresentacion {
    public static void main(String[] args) throws ExcepcionProducto {
        Producto producto1 = new Producto(1,"Platanos", 3.2,"CanariasPlatanos", "Platanos de canarias");

        Producto producto2 = new Producto(0,"manzanas", 3.2,"Canariasmanzanas", "manzanas de Muercia");

        producto2.comprobar();
    }
}
