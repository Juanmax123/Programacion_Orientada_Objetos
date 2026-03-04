package Clase5;

public class Personajes {
//atributos
String nombre;
int nivel;

//constructures
public Personajes(String nombre, int nivel )  {
this.nombre = nombre ;  //this.nombre es para llamar el atributo
this.nivel = nivel; //empiezan en 1 por defecto

}

public void mostrarinfo(){
System.out.println("Heroe: " + nombre + " Nivel " + nivel);

}

    
}
