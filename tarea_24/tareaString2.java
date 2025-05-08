/*
* Alumno: Federico B. Soria
* 2.Diseña un objeto de tipo String que pide por teclado un grupo de dos-tres palabras.
* • Implementar los siguientes métodos:
* • Imprimir la primera mitad de los caracteres de la cadena
* • Imprimir el último carácter
* • Imprimir la cadena de forma inversa
* • Imprimir cada carácter del String separado por un guión
* • Imprimir la cantidad de vocales almacenadaswww.digitechfp.com
* NOTA: Verificar si la cadena se lee igual de izquierda a derecha tanto como de derecha
* a izquierda.
*/

import java.util.Scanner;

public class tareaString2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un grupo de dos o tres palabras:");
        String texto = scanner.nextLine();
        
        //Imprime la primera  mitad  de los caracteres  de la cadena
        int mitad = texto.length() / 2;
        System.out.println("Primera mitad: " + texto.substring(0,mitad));
        
        //Imprime eel ultimo caracter
        char ultimoCaracter = texto.charAt(texto.length() - 1);
        System.out.println("Ultimo caracter: " + ultimoCaracter);
        
        //Imprime la cadena de forma inversa
        StringBuilder inversa = new StringBuilder(texto).reverse();
        System.out.println("Cadena inversa: " + inversa.toString());
        
        //Imprime cada caracter separado por un guion
        StringBuilder conGuiones = new StringBuilder();
        for (int i = 0; i < texto.length(); i++){
            conGuiones.append(texto.charAt(i));
            if (i < texto.length() - 1){
                conGuiones.append("-");
            }
        }
        System.out.println("Separado por guiones: " + conGuiones.toString());
        
        // Imprimie la cantidad de vocales almacenadas
        int contadorVocales = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) {
                contadorVocales++;
            }
        }
        System.out.println("Cantidad de vocales: " + contadorVocales);

        // Verifica si la cadena se lee igual de izquierda a derecha tanto como de derecha a izquierda
        boolean esPalindromo = texto.equals(inversa.toString());
        System.out.println("¿Es palíndromo? " + esPalindromo);

    }
}