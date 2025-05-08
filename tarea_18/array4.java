/*
* Alumno: Federico B. Soria
*
* 4. Elabore un programa que lea 2 arrays de n elementos
* cada uno e intercambie sus elementos, la salida debe ser los arrays antes y 
* después del intercambio. No utilizar un tercer arrays
* 
*/

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir el tamaño de los array");
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];

        //Lee elementos del 1er array
        System.out.println("Introduce los elementos del primer array: ");
        for (int i = 0; i < n; i++) {
            array1[i] = scanner.nextInt();
        }

        //Lee elementos del 2do array
        System.out.println("Introduce los elementos del segundo array: ");

        for (int i = 0; i < n; i++){
            array2[i] = scanner.nextInt();
        }
        //muestra los arrays antes del intercambio
        System.out.println("Antes del intercambio");
        mostrarArrays(array1, array2);
        
        //Intercambiar elementos
        for (int i = 0; i < n; i++){
            array1[i] = array1[i] + array2[i];
            array2[i] = array1[i] - array2[i];
            array1[i] = array1[i] - array2[i];
        }
        //muestra los arrays despues del intercambio
        System.out.println("Arrays despues del intercambio:");
        mostrarArrays(array1, array2);
    }
    
    //Funcion para imprimir arrays
    public static void mostrarArrays(int[] array1, int[] array2){
        System.out.println("Array 1: ");
        for (int i : array1){
            System.out.println(i + " ");
        }
        System.out.println();
        
        System.out.println("Array 2: ");
        for (int i : array2){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
