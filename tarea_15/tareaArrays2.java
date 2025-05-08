/* 
* alumno: Federico B. Soria
* 
* Tarea Arrays
* 1. Diseña el siguiente programa:
* Se pide por pantalla el número de celdas de la tabla o Array
* Si hay 10 celdas, cada celda guarda el número correspondiente a su posición.
* Imprimir el array con un bucle for
* Imprimir el array con un bucle while
* Se debe pintar la tabla, con caracteres gráficos -------, 
* o por el contrario: |, simulando una tabla visualmente.
*/

import java.util.Scanner;

public class tareaArrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir por pantalla el número de celdas de la tabla o Array
        System.out.print("Introduce el número de celdas del array: ");
        int numCeldas = sc.nextInt();

        // Crear el array y asignar valores
        int[] array = new int[numCeldas];
        for (int i = 0; i < numCeldas; i++) {
            array[i] = i + 1; // Cada celda guarda el número correspondiente a su posición
        }

        // Imprimir el array con un bucle for
        System.out.println("Impresión del array con bucle for:");
        for (int i = 0; i < numCeldas; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Imprimir el array con un bucle while
        System.out.println("Impresión del array con bucle while:");
        int j = 0;
        while (j < numCeldas) {
            System.out.print(array[j] + " ");
            j++;
        }
        System.out.println();

        // Pintar la tabla visualmente
        System.out.println("Tabla visual:");
        for (int i = 0; i < numCeldas; i++) {
            System.out.print("-------");
        }
        System.out.println();
        for (int i = 0; i < numCeldas; i++) {
            System.out.print("|  " + array[i] + "  ");
        }
        System.out.println("|");
        for (int i = 0; i < numCeldas; i++) {
            System.out.print("-------");
        }
        System.out.println();
    }
}