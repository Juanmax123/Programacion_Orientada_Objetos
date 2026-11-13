
package modelo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;

public class Materia {
    private String codigo;
    private String nombre;
    private int cuposMaximos;
    private int creditos;
    private LinkedList<String> preRequisitos; // Lista enlazada para códigos de pre-requisitos
    private LinkedList<Estudiante> estudiantesInscritos;
    private Queue<Estudiante> colaDeEspera; // Cola para cuando la materia se llene

    public Materia(String codigo, String nombre, int cuposMaximos, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cuposMaximos = cuposMaximos;
        this.creditos = creditos;
        this.preRequisitos = new LinkedList<>();
        this.estudiantesInscritos = new LinkedList<>();
        this.colaDeEspera = new ArrayDeque<>(); // Usamos ArrayDeque como Cola (Queue)
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuposMaximos() {
        return cuposMaximos;
    }

    public int getCreditos() {
        return creditos;
    }

    public LinkedList<String> getPreRequisitos() {
        return preRequisitos;
    }

    public Queue<Estudiante> getColaDeEspera() {
        return colaDeEspera;
    }

    // Agregar un pre-requisito a la lista enlazada
    public void agregarPreRequisito(String codigoMateria) {
        preRequisitos.add(codigoMateria);
    }

    // Validar si hay cupos disponibles
    public boolean hayCupo() {
        return estudiantesInscritos.size() < cuposMaximos;
    }

    // Inscribir estudiante directamente
    public void inscribirEstudiante(Estudiante est) {
        estudiantesInscritos.add(est);
    }

    // Agregar a la cola de espera si hay cupo lleno
    public void agregarAColaEspera(Estudiante est) {
        colaDeEspera.add(est);
    }

    // Liberar cupo y asignar automáticamente al primero de la cola si existe
    public Estudiante liberarCupo(Estudiante estCancela) {
        estudiantesInscritos.remove(estCancela);
        if (!colaDeEspera.isEmpty()) {
            Estudiante siguienteEnCola = colaDeEspera.poll(); // Saca al primero de la cola
            estudiantesInscritos.add(siguienteEnCola); // Lo inscribe
            return siguienteEnCola;
        }
        return null;
    }

    public void mostrarDetalles() {
        System.out.println("Materia: [" + codigo + "] " + nombre + " (Créditos: " + creditos + ")");
        System.out.println("Cupos ocupados: " + estudiantesInscritos.size() + "/" + cuposMaximos);
        System.out.println("Estudiantes en cola de espera: " + colaDeEspera.size());
    }
}
