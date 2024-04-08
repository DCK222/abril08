package Modelo.Ejercicio7;

public class Producto {
    private int ID;
    private String Nombre;
    private double Precio;
    private String Proveedor;
    private String Descripcion;

    public Producto() {

    }

    public Producto(int ID, String nombre, double precio, String proveedor, String descripcion) {
        this.ID = ID;
        Nombre = nombre;
        Precio = precio;
        Proveedor = proveedor;
        Descripcion = descripcion;
    }


    public void comprobar() throws ExcepcionProducto{
    if (this.ID == 0){
    throw new ExcepcionProducto("El Producto No tiene id...");
    }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
