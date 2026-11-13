package modelo;

import excepciones.HorarioConflictivoException;

public class Aula {
    private String nombre;
    private int capacidad;
    // Matriz nativa obligatoria: 7 días (0=Domingo..6=Sábado) x 24 horas (0..23)
    private boolean[][] disponibilidad;

    public Aula(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponibilidad = new boolean[7][24]; // Por defecto inicia todo en false (libre)
    }

    public String getNombre() { return nombre; }
    public int getCapacidad() { return capacidad; }

    // Consulta si una hora específica de un día está libre
    public boolean consultarDisponibilidad(int dia, int hora) {
        if (dia < 0 || dia >= 7 || hora < 0 || hora >= 24) {
            return false;
        }
        return !disponibilidad[dia][hora]; // Retorna true si está libre (false en matriz)
    }

    // Verifica disponibilidad en todo el bloque de duración y reserva
    public void reservar(int dia, int horaInicio, int duracion) throws HorarioConflictivoException {
        if (dia < 0 || dia >= 7 || horaInicio < 0 || (horaInicio + duracion) > 24) {
            throw new HorarioConflictivoException("Día u hora fuera de rango permitido.");
        }

        // 1. Verificar que todas las horas del bloque estén libres
        for (int h = horaInicio; h < horaInicio + duracion; h++) {
            if (disponibilidad[dia][h]) {
                throw new HorarioConflictivoException("Conflicto en aula " + nombre + ": día " + dia + " a las " + h + ":00 ya está reservado.");
            }
        }

        // 2. Si todas están libres, marcar como ocupadas (true)
        for (int h = horaInicio; h < horaInicio + duracion; h++) {
            disponibilidad[dia][h] = true;
        }
    }

    // Libera un bloque horario previamente reservado
    public void liberar(int dia, int horaInicio, int duracion) {
        if (dia >= 0 && dia < 7 && horaInicio >= 0 && (horaInicio + duracion) <= 24) {
            for (int h = horaInicio; h < horaInicio + duracion; h++) {
                disponibilidad[dia][h] = false;
            }
        }
    }
}
