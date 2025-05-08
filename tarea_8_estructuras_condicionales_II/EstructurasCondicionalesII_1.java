/*
 * Práctica Estructura de control
 * 
 * Alumno Federico B. Soria
 *
 *  1.Se pide por pantalla dos números, la aplicación debe mostrar un mensaje 
 *   con un mensaje del tipo:
 *   "El numero: ... es mayor que el número ..."
 *  "El numero: ... es menor que el número ..."
 */

import java.util.Scanner;

public class EstructurasCondicionalesII_1 {
    public static void main(String args[]) {
        //Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar por pantalla dos números
        System.out.println("Introduce el 1er número: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Introduce el 2do número: ");
        int num2 = scanner.nextInt();
        
        //Se incializan los mensajes que luego se imprimiran
        String mayor = "El numero: %d es mayor que el número %d \n";
        String menor = "El numero: %d es menor que el número %d \n";
        
        //Se comparan los números y se imprime el resultado
        
        if (num1 > num2) {
            System.out.printf(mayor, num1, num2);
            System.out.printf(menor, num2, num1);
        } else {
            System.out.printf(mayor, num2, num1);
            System.out.printf(menor, num1, num2);
        }
    }
}