public class Perfumes {
    
    // 1. Atributos
    String nombre;
    String marca;
    double capacidad; // Cambiado a double para poder restar
    double precio;

    // 2. Constructor
    public Perfumes(String nombre, String marca, double capacidad, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    // 3. Métodos

    // Método para aplicar el perfume (reduce la capacidad)
    public void aplicarPerfume(double cantidad) {
        //si mi capacidad es mayor a la cantidad a aplicar entonces resto
        if (capacidad >= cantidad) {
            capacidad = capacidad - cantidad; // Restamos la cantidad usada
            System.out.println("Aplicando perfume... Se usaron " + cantidad + " ml.");
        } else {
            System.out.println("¡Agotado! No queda suficiente perfume.");
        }
    }

    // Método para consultar cantidad restante
    public String  getInfo () { 
        return "Quedan " + capacidad + " ml";
    }

    // Método para ajustar el precio
    public void ajustarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
        System.out.println("El nuevo precio de " + nombre + " es: $" + precio);
    }
    
}
