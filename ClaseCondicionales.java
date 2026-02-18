import java.util.Scanner;

public class ClaseCondicionales {
    public static void main(String[] args) {
        // sc es una variable que permite leer datos desde la consola (le pertenece al
        // metodo main)
        int a = 0;
        int b = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a: "); // solicitamos por teclado el valor de a

        a = sc.nextInt(); // leemos el valor de a que se digito por teclado y lo asignamos a la variable a

        System.out.println("Digite b: "); // solicitamos por teclado el valor de b
        b = sc.nextInt(); // leemos el valor de b que se digito por teclado y lo asignamos a la variable b

        if (a <= b) {
            System.out.println("Orden Creciente");
        } else {

            System.out.println("Orden Decreciente");
        }
        sc.close();
    }

}
