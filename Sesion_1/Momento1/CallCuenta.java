public class CallCuenta {
        public static void main(String[] args) {
        CuentaBancaria Obj1 = new CuentaBancaria("110-369-114", 80.000, " Juan Manuel Gallego");
        Obj1.Depositar(100.000);
        System.out.println(Obj1);

        Obj1.retirar(500.000);
        System.out.println(Obj1);

        Obj1.retirar(80.000);
        System.out.println(Obj1);

    }
    
}
