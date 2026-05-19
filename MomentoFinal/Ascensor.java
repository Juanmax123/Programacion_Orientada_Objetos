package MomentoFinal;

public class Ascensor {

      // Atributos
    private int pisoActual;
    private boolean enMovimiento; // true = moviéndose, false = quieto

    //  El ascensor tiene una puerta de cabina y  botones que
    // los hago con un arreglo
    private PuertaAscensor puertaCabina;
    private BotonAscensor[] botonesInternos; // Arreglo para guardar objetos de la clase BotonAscensor del 1 al X

    // Constructor donde solo pido el total de los pisos

    public Ascensor(int totalPisos) {

        // inicia todo en 0, sin moverse, cerrado y en el piso 1(por logica siempre
        // arranca asi)
        this.pisoActual = 1;
        this.enMovimiento = false;
        this.puertaCabina = new PuertaAscensor();

        // creo el panel de botones según el total de pisos utilizando mi vector
        // previamente creado
        this.botonesInternos = new BotonAscensor[totalPisos];

        for (int i = 0; i < totalPisos; i++) {
            // ejecuto el constructor para crear el boton en cada posición
            this.botonesInternos[i] = new BotonAscensor(i + 1);
        }
    }

    // Métodos (Para simular el movimiento)
    public void moverAscensor(int pisoDestino) {
        if (pisoDestino == this.pisoActual) {

            System.out.println("Ya te encuentras en el piso " + pisoDestino);

            // uso return para que si entra en este if detenga el codigo
            return;
        }

        this.enMovimiento = true;
        System.out.println("----ASCENSOR EN MOVIMIENTO----");
        System.out.println("Saliendo del piso: " + this.pisoActual);

        // aqui actualizo el piso actual con el piso destino que llega al metodo
        this.pisoActual = pisoDestino;

        this.enMovimiento = false;
        System.out.println("Ascensor llegó al piso: " + this.pisoActual);
        System.out.println("==============================");
    }

    // Getters necesarios para el Sistema de Control
    public int getPisoActual() {
        return pisoActual;
    }

    public boolean isEnMovimiento() {
        return enMovimiento;
    }

    public PuertaAscensor getPuertaCabina() {
        return puertaCabina;
    }

    public BotonAscensor[] getBotonesInternos() {
        return botonesInternos;
    }

}

    

