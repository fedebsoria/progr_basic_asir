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

public class array2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int len = 5;
        
        String[] nombres = new String[len];
        
        int[] edades = new int[len];
        
        System.out.println("Ingrese 5 nombres:");
        
        for(int i = 0; i < len; i++){
            nombres[i] = sc.nextLine();
        }
        
        System.out.println("Ingrese las edades en orden:");
        
        for(int i = 0; i < len; i++){
            edades[i] = sc.nextInt();
        }
        
        System.out.println("Son mayores de edad: ");
        for(int i = 0; i < len; i++){
            if (edades[i] >= 18 ){
                System.out.println(nombres[i]);
            }
        }
        
        sc.close();
    }
}