public class CuentaBancaria {

     // Atributos

    private String numCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria(String numCuenta, double saldo, String titular) {

        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.titular = titular;

    }

    public void Depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if ( saldo < cantidad) {
            System.out.println("El valor a retirar supera el saldo de la cuenta");
        } else {
            saldo -= cantidad;
        }
    }

   public String toString() {
        return "CuentaBancaria[ Estimado " + titular + ", tienes un saldo de : " + saldo + "]";


}
    
}
