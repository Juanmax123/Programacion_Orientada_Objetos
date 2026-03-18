public class MainLibro {

     public static void main(String[] args) {
        // creo varios objetos
        Libro Obj1 = new Libro("El señor de los anillos", "JR.TOLKEIN", "11-22", 500);
        Libro Obj2 = new Libro("Viaje al Centro de la Tierra", "Julio Verne", "11-23", 300);

        // 2. Miro el estado del libro
        System.out.println(Obj1.getInfo());

        // presto el libro
        // aqui ya se ejecuta la logica del metodo, sin recibir parametros
        Obj1.prestar();

        // aqui ejecuto la logica del metodo para devolver

        Obj1.devolver();

        // aqui muestro el estado
        System.out.println(Obj1.getInfo());

        System.out.println(Obj2.getInfo());

        // presto el libro
        // aqui ya se ejecuta la logica del metodo, sin recibir parametros
        Obj2.prestar();

        // aqui ejecuto la logica del metodo para devolver

        // aqui muestro el estado
        System.out.println(Obj2.getInfo());
        // Se espera que muestre el error de ya esta prestado
        Obj2.prestar();

    }
    
}
