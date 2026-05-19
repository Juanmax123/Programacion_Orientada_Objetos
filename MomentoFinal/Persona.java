package MomentoFinal;

public class Persona {

      private String nombre;
    private int peso;
    private int pisoDestino;

    public Persona(String nombre, int peso, int pisoDestino) {
        this.nombre = nombre;
        this.peso = peso;
        this.pisoDestino = pisoDestino;
    }

    // Getters para el Sistema de Control
    public String getNombre() {
        return nombre;
    }
    
    public int getPeso() {
        return peso;
    }

    public int getPisoDestino() {
        return pisoDestino;
    }
    
}
