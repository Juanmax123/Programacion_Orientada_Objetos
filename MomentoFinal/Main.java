package MomentoFinal;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("CONFIGURACIÓN INICIAL DEL EDIFICIO ");
        System.out.print("¿Cuántos pisos tiene el edificio?: ");
        int totalPisos = teclado.nextInt();
        
        // Inicializamos la infraestructura por defecto
        Piso[] edificio = new Piso[totalPisos];
        for (int i = 0; i < totalPisos; i++) {
            edificio[i] = new Piso(i + 1);
        }
        
        Ascensor ascensorPrincipal = new Ascensor(totalPisos);
        // Creamos el control definiendo un peso máximo de 400 kg
        SistemaDeControl control = new SistemaDeControl(edificio, ascensorPrincipal, 400);
        
        System.out.println("\n SIMULADOR DE CONSOLA ");
        //inicializo con 0 personas
        int numPersonas = 0;
        
        // Validación para que sea entre 1 y 5 personas ya que asi lo quise plantear
        while (numPersonas < 1 || numPersonas > 5) {
            System.out.print("¿Cuántas personas usarán el ascensor (Mínimo 1, Máximo 5)?: ");
            numPersonas = teclado.nextInt();
        }
        
        // Creamos el arreglo de personas con el tamaño seleccionado
        Persona[] pasajeros = new Persona[numPersonas];
        int pesoAcumulado = 0;
        
        // Ciclo para capturar los datos de cada uno
        for (int i = 0; i < numPersonas; i++) {
            teclado.nextLine(); // Limpiar el buffer de entrada
            System.out.println("\n--- Datos del Pasajero #" + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();
            System.out.print("Peso en kg: ");
            int peso = teclado.nextInt();
            System.out.print("Piso de destino: ");
            int destino = teclado.nextInt();
            
            // Creamos el objeto persona y lo metemos al vector
            pasajeros[i] = new Persona(nombre, peso, destino);
            pesoAcumulado += peso; // Sumamos para la báscula
        }
        
        // PRIMERA VALIDACIÓN: El peso
        if (control.controlPeso(pesoAcumulado)) {
            // SEGUNDA PARTE: Si el peso está bien, se ejecuta la ruta optimizada con la burbuja
            control.controlDeMovimiento(pasajeros);
        } else {
            System.out.println("Por favor, bajen peso de la cabina y reinicien la simulación.");
        }
        
        teclado.close();
    }
    
}
