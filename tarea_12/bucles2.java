/*
* Escribe un programa en Java que utilice un bucle while para solicitar 
* al usuario que ingrese números enteros positivos. 
* El programa debe sumar estos números y mostrar 
* el resultado acumulado en cada iteración.
* El bucle debe finalizar cuando el usuario ingrese un número negativo,
* momento en el cual se mostrará el total de la suma y el programa terminará.
*
* Alumno: Federico Bernardo Soria
*
*/

import java.util.Scanner;

public class bucles2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte un numero para sumar: ");
        
        int userIn = sc.nextInt();
        int totalSum = 0;
        
        while (userIn >= 0){
            System.out.println("Inserte un numero para sumar: ");
            System.out.println("(inserte un numero negativo para finalizar)");
            userIn = sc.nextInt();
            totalSum += userIn;
            System.out.println("Subtotal " + totalSum);
        }
        
        System.out.println("Total final: " + totalSum);
        System.out.println("Adios");
    } 
}