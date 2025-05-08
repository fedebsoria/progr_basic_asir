/*
* Alumno: Federico B. Soria
*
* 2. Desarrollar un programa que permita cargar 5 nombres 
* de personas y sus edades respectivas.
* Se utilizarán dos arrays uno para los nombres y otro para las edades. 
* Después de realizar la carga por teclado de todos los datos
* imprimir los nombres de las personas mayores de edad.
* 
*/

import java.util.Scanner;

public class array3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int len = 5;
                
        int[] numeros = new int[len];
        
        System.out.println("Ingrese 5 numeros:");
        
        for(int i = 0; i < len; i++){
            numeros[i] = sc.nextInt();
        }
        
        System.out.println("Ingrese un num. para ver si esta en el array:");
        
        int numeroInput = sc.nextInt();
        
        for(int i = 0; i < len; i++){
            if (numeros[i] == numeroInput ){
                System.out.println("El numero se encuentra en la posicion: "
                        + i);
            }
        }
        
        sc.close();
    }
}