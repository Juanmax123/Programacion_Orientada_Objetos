package Clase5;

public class Main {

    public static void main(String[] args) {
      //es del tipo de la clase celular la variable u objeto objTelefono1
      //se instancia el objeto miTelefono
       Celular miTelefono = new Celular() ; //miTelefono me permite ingresar a la clase es como una llave

       miTelefono.marca = "Samsumg" ; 
       
       miTelefono.llamar(123);  //llamar es el metodo y le estoy mandando el numero 123

    }
    
}
