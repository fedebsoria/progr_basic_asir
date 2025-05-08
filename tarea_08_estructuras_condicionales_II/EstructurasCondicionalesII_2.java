/*
 * Práctica Estructura de control
 * 
 * Alumno Federico B. Soria
 *
 * 2.Se pide un número por pantalla, comprobar si el número es par o impar. 
 *  En el caso de que sea par se muestra el mensaje:"El número es par", 
 *  en el caso de que sea impar aparece el mensaje
 * "El número es impar"
 */

import java.util.Scanner;

public class EstructurasCondicionalesII_2 {

    public static void main(String args[]) {
    //Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar número por pantalla
        System.out.println("Introduce un número para saber si es par: ");
        int num = scanner.nextInt();
        
        //Se controla si el num es par y se imprime el resultado
        if ((num % 2) == 0) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
