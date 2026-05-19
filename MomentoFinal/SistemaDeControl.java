package MomentoFinal;

public class SistemaDeControl {

     // Atributos del diagrama
    private int pesoActual;
    private int pesoMaximo;

    // El sistema controla al ascensor y conoce los pisos
    private Ascensor ascensor;
    private Piso[] pisosDelEdificio;

    // Constructor donde creo todo el sistema
    public SistemaDeControl(Piso[] pisosDelEdificio, Ascensor ascensor, int pesoMaximo) {
        this.pisosDelEdificio = pisosDelEdificio;
        this.ascensor = ascensor;
        this.pesoMaximo = pesoMaximo;
        this.pesoActual = 0;
    }

    // Método Controlar Peso
    public boolean controlPeso(int pesoTotal) {
        this.pesoActual = pesoTotal;
        System.out.println(
                "Peso actual en cabina: " + this.pesoActual + " kg / Máximo: " + this.pesoMaximo + " kg.");

        if (this.pesoActual > this.pesoMaximo) {
            System.out.println(" ¡ALERTA! Exceso de peso. El ascensor NO se moverá.");
            return false; // Retorna false si no pasa la prueba
        }

        System.out.println(" Peso permitido. Iniciando sistemas de movimiento...");
        return true; // Retorna true si todo está OK
    }

    // Control de Movimiento (Recibe el arreglo de personas del Main)
    public void controlDeMovimiento(Persona[] listaPersonas) {
        // MÉTODO BURBUJA(este lo use en Algoritmia con el Decano): Ordenamos a las
        // personas por su pisoDestino de menor a mayor
        int n = listaPersonas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listaPersonas[j].getPisoDestino() > listaPersonas[j + 1].getPisoDestino()) {
                    // Intercambiamos los objetos Persona completos dentro del vector
                    Persona temporal = listaPersonas[j];
                    listaPersonas[j] = listaPersonas[j + 1];
                    listaPersonas[j + 1] = temporal;
                }
            }
        }

        for (Persona p : listaPersonas) {
            System.out.println("- " + p.getNombre() + " va hacia el Piso " + p.getPisoDestino());
        }

        //  Ejecución del viaje en orden
        System.out.println("\n--- INICIO DE OPERACIÓN DEL ASCENSOR ---");

        for (int i = 0; i < listaPersonas.length; i++) {
            Persona personaActual = listaPersonas[i];

            // Le ordenamos al ascensor moverse al piso destino de esta persona
            ascensor.moverAscensor(personaActual.getPisoDestino());

            // Sincronizamos y abrimos las puertas en el piso de llegada
            System.out.println("[SISTEMA] Abriendo puertas en piso " + ascensor.getPisoActual());
            pisosDelEdificio[ascensor.getPisoActual() - 1].abrirPuertaPiso();
            ascensor.getPuertaCabina().abrirPuerta();

            // Notificamos el desembarque tal como querías
            System.out.println("[PASAJERO] " + personaActual.getNombre() + " se ha bajado en el Piso "
                    + personaActual.getPisoDestino());

            // Cerramos puertas antes de ir al siguiente destino
            System.out.println("[SISTEMA] Cerrando puertas de seguridad...");
            ascensor.getPuertaCabina().cerrarPuerta();
            pisosDelEdificio[ascensor.getPisoActual() - 1].cerrarPuertaPiso();
        }

        System.out.println("\n--- FIN DE LA RUTA. TODOS LOS PASAJEROS LLEGARON ---");
    }
    
}
