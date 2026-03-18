public class Libro {
     // Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroPaginas;
    private boolean disponible; // true = disponible, false = prestado

    // Constructor
    public Libro(String titulo, String autor, String isbn, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
        this.disponible = true; // Ainicializo el atributo para que este disponible 
    }

    // Método para verificar disponibilidad
    public boolean estaDisponible() {
        return disponible;
    }

    // Método para prestar el libro
    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Has prestado el libro: " + titulo);
        } else {
            System.out.println("Error: El libro '" + titulo + "' ya se encuentra prestado.");
        }
    }

    // Método para devolver el libro
    public void devolver() {
        //Si no esta disponible
        if (!disponible) {
            disponible = true;
            System.out.println("Has devuelto el libro: " + titulo);
        } else {
            System.out.println("El libro '" + titulo + "' ya estaba en la biblioteca.");
        }
    }

    // Getters para mostrar info
    public String getInfo() {
     //si estado es disponible entonces muestra disponible si no prestado
        String estado = disponible ? "Disponible" : "Prestado"; 

        return titulo + " (" + autor + ") - Estado: " + estado;
    }
    
}
