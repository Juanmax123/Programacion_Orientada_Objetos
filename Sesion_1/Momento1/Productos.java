
public class Productos {
     // atributos
    private String nombre;
    private int codigo;
    private int cantidad;
    private double precio;

    // constructor permite inicializar la clse, se reconoce por que tiene el mismo
    // nombre de la clase
    public Productos(String nombre, int codigo, int cantidad, double precio) {

        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;

    }

    // METODOOOOS son como las funciones en pl sql

    public void AddProd(int cantidad) {

        this.cantidad += cantidad;
    }

    public void RestProd(int cantidad) {

        this.cantidad -= cantidad;
    }

    public double calcularvalorinventario() {
        return cantidad * precio;
    }

    // se usa toString para imprimir
    public String toString() {
        return "Productos[ nombre: " + nombre + " Codigo: " + codigo + " Cantidad: " + cantidad + " Precio: " + precio
                + "]";

    }

    
}
