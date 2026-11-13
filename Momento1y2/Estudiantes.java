package modelo;

public class Estudiante extends Persona {

    private int semestreActual;
    private Double[][] notasSemestres; // Arreglo estático obligatorio para las notas: [10][20]

    public Estudiante(String nombre, String id, String email, int semestreActual) {
        super(nombre, id, email);   
        this.semestreActual = semestreActual;
        this.notasSemestres = new Double[10][20]; // 10 semestres, 20 materias 
    }

    public int getSemestreActual() {
        return semestreActual;
    }

    public void setSemestreActual(int semestreActual) {
        this.semestreActual = semestreActual;
    }

    public Double[][] getNotasSemestres() {
        return notasSemestres;
    }

    // Registrar nota en un semestre y posición específica
    public void registrarNota(int semestre, int indexMateria, double nota) {
        if (semestre >= 0 && semestre < 10 && indexMateria >= 0 && indexMateria < 20) {
            notasSemestres[semestre][indexMateria] = nota;
        }
    }


    //el metodo pertenece a la clase Persona, y se implementa en la clase Estudiante para mostrar la información del estudiante.
    @Override
    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
        System.out.println("Semestre actual: " + semestreActual);
    }

}

