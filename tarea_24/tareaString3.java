/*
* Alumno: Federico B. Soria
* 3. Diseña un programa que pide un texto por pantalla y se muestra de la siguiente
* manera:
* Por ejemplo se teclea: Buenas tardes Lola
* Debe aparecer:
* Buenas
* Tardes
* Lo
*/

import java.util.Scanner;

public class tareaString3 {
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
