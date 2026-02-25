import java.util.Scanner; //sirve para importar la clase Scanner que se utiliza para leer la entrada del usuario desde la consola.

public class Bucles {
public static void main(String[] args) {
/*  ejercicio 4.7 calculo de pesos de alumnos */
Scanner sc = new Scanner(System.in);
System.out.print("Ingresa el peso del alumno e: ");
int  peso = sc.nextInt();  //lee un número entero ingresado por el usuario y lo asigna a la variable peso.
 if (peso < 40) {

    System.out.println("Menos de 40 kg");

 } else { 

    if (peso >= 40 && peso < 50) {
        System.out.println("entre 40 y 50 kg");
    } else {
        if (peso >= 50 && peso < 60) {
          System.out.println("entre 50 y 60 kg");    
        } else {
            System.out.println("mayor o igual de 60 kg");
        }

    }

      
    }




sc.close(); 

 }


}
