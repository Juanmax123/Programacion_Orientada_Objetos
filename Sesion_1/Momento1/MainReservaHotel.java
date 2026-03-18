public class MainReservaHotel {
     public static void main(String[] args) {
        ReservaHotel Obj1 = new ReservaHotel("Cabaña alegria", "24/10/2025", "26/10/2025", 101);

        // consulto el estado inicil de la habitacion (disponible)
        System.out.println(Obj1.getInfo());
        // reservo la cabaña

        Obj1.ReservarHabitacion();

        // muestro el estado (reservado)

        System.out.println(Obj1.getInfo());

        // muestro que no puedo reservar ya que ya la reserve anteriormente
        Obj1.ReservarHabitacion();

        // Cancelo la reserva
        Obj1.CancelarReserva();

        // imprimo el estado de la cabaña
        System.out.println(Obj1.getInfo());

    }
}
