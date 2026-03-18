public class ReservaHotel {

      // atributos

    String nombre;
    String fechaEntrada;
    String fechaSalida;
    int numHabita;
    boolean disponibilidad;

    // constructot

    public ReservaHotel(String nombre, String fechaEntrada, String fechaSalida, int numeroHabita) {
        this.nombre = nombre;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.numHabita = numeroHabita;
        this.disponibilidad = true;

    }

    // metodos
    // metodo para reservar la habitacion
    public void ReservarHabitacion() {
        if (disponibilidad) {
            disponibilidad = false;
            System.out.println("Estimado Usuario tienes una reserva con fecha Inicial " + fechaEntrada
                    + " Y fecha de Salida: " + fechaSalida + " Con Numero de Habitacion : " + numHabita);

        } else {
            System.out.println("La habitacion: " + nombre + "-" + numHabita + " Ya se encuenrea reservada!!");

        }

    }

    public void CancelarReserva() {

        if (!disponibilidad) {
            System.out.println("Acabas de cancelar la reserva para la habitación: " + nombre + "-" + numHabita);
            disponibilidad = true;
        }

    }

    public String getInfo() {

        String estado = disponibilidad ? "Disponible" : "Reservado";

        return " La habitación " + nombre + "-" + numHabita + " Se encuentra : " + estado;

    }
    
}
