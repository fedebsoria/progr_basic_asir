/*
 * Tarea  Bucles
 *5 - Escribir un programa que pide por pantalla un número entre el 0 y 999.
 *Nos apareceun mensaje, con el número de dígitos 
 *que tiene el número que introduce. 
 *Si se teclea el valor cero, se acaba el juego 
 *
 *  Alumno ASIR on-line: Federico B. Soria
 */

import java.util.Scanner;

public class juegoDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {
            System.out.print("Introduce un número entre 0 y 999 (0 para salir): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Juego terminado.");
                break;
            }

            if (numero < 0 || numero > 999) {
                System.out.println("Número fuera de rango. Inténtalo de nuevo.");
            } else {
                int digitos = String.valueOf(numero).length();
                System.out.println("El número " + numero + " tiene " + digitos + " dígitos.");
            }
        }

        scanner.close();
    }
}

