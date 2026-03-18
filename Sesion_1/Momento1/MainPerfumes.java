public class MainPerfumes {

        public static void main(String[] args) {

        Perfumes Obj1 = new Perfumes("Club de Nuit", "Armaf", 100, 200.000);

        Obj1.aplicarPerfume(10);
        // aqui imprimo la cantidad
        System.out.println(Obj1.getInfo());

        Obj1.ajustarPrecio(180.00);

        Obj1.aplicarPerfume(20);

        Obj1.ajustarPrecio(100.00);
        System.out.println(Obj1.getInfo());

    }
}
    

