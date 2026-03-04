package Clase5;

public class Celular {

    //Atributos 
    String marca ;
    String modelo;
    int bateria = 100;

//Metodo
/*
firma del metodo
* Publico
*Void no retorna 
* metodo se tiene de nombre "llamar"
*tiene un parametro y es de tipo entero (numero)
*/
public void llamar(int numero){
System.out.println("llamando al " + numero + "....");
this.bateria -=5;

}


    
}
