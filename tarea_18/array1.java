/*
* Alumno: Federico B. Soria
*
* 1.Desarrollar un programa que permita ingresar un Array de n elementos, 
* ingresar n por teclado.Luego imprimir la suma de los números impares 
* y la multiplicación de los números pares.
* 
*/

import java.util.Scanner;

public class array1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int parOimp = 0;
        int sumImpar = 0;
        int mulPar = 1;
        
        //Largo del array
        System.out.println("Inserte un num.:");
        int len_array = sc.nextInt();
        
        //Creación Array
        int[] newArray = new int[len_array];
        System.out.println("Inserte num en el array");
        
        for (int i = 0; i < len_array; i++){
            newArray[i] = sc.nextInt();
        }
        
        for (int n = 0; n < len_array; n++){
            parOimp =  newArray[n] % 2;
            if (parOimp == 0){
                mulPar *= newArray[n];
            } else {
                sumImpar += newArray[n];
            }
        }
        System.out.println("Suma de num impares: " + sumImpar);
        System.out.println("Multiplicacion de num pares: " + mulPar);
        
        sc.close();
    }
}