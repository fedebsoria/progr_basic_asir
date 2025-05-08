/*
* Alumno: Federico B Soria
* 
* Codifique un programa que permita cargar una oración por teclado, después mostrar cada
* palabra ingresada en una línea distinta.
*/

import java.util.Scanner;

public class tareaString4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un texto:");
        String texto = scanner.nextLine();

        // Dividee el texto en palabras usando el espacio como delimitador
        String[] palabras = texto.split(" ");

        // Imprime cada palabra en una nueva línea
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
