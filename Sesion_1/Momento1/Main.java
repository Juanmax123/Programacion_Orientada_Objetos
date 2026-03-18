public class Main {
    
    public static void main(String[] args) {
         //Inicializo el objeto Objp1
        Productos Objp1 = new Productos("Teclado", 1002, 10, 230.0)  ;
        //mostrar el contendo del objeto Obj1
        System.out.println(Objp1);
        //agrego 5 teclados al stock llamando al metodo AddProd
        Objp1.AddProd(5);
         System.out.println(Objp1);

         //QUITO 10 AL STOCK llamando al metido RestProd
         Objp1.RestProd( 10);
         System.out.println(Objp1);

         //Calculo el inventario
        Double total = Objp1.calcularvalorinventario();
         System.out.println("El total es: " + total);
    }
    
}

