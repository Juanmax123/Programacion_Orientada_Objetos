package MomentoFinal;

public class Boton {
     // Atributos

    private boolean luzBoton;

    // constructor no recibe nada y por defecto esta apagado

    public Boton() {
        this.luzBoton = false;
    }

    // Metodos

    public void encenderBoton() {
        if (luzBoton == false) {
            luzBoton = true;
            System.out.println("Boton encendido [verde]!!");
        } else {
            System.out.println("El boton ya estaba encendido.");
        }

    }

    public void apagarBoton() {

        if (luzBoton == false) {

            System.out.println("El boton ya esta apagado!!");

        } else {
            luzBoton = false;

            System.out.println("El boton ha sido apagado");
        }

    }

    // Metodos de subir y bajar para simular

    public String subir() {
        // enciendo el botón automáticamente al llamar la acción
        encenderBoton();
        return "El sistema ha registrado una orden para SUBIR.";
    }

    public String bajar() {
        // enciendo el botón automáticamente al llamar la acción
        encenderBoton();
        return "El sistema ha registrado una orden para BAJAR.";
    }

    // El Getter para la luz del botón
    public boolean isLuzBoton() {
        return this.luzBoton;
    }

    


    
}
