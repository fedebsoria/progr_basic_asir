/* 
* alumno: Federico B. Soria
* 
* 1. Escribe un programa que pida 10 números por teclado, los almacene en un array y que luego
* muestre el número mayor, el menor y las posiciones que ocupan en el array
*/

import java.util.Scanner;
import java.util.Arrays;

public class arrays3_1{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int len = 10;
        int[] array1 = new int [len];
        
        System.out.println("Inserte 10 números: ");
        
        for(int i = 0; i < len; i++){
            array1[i] = sc.nextInt();
        }
        
        int min = Arrays.stream(array1).min().getAsInt();
        int minPos = 0;
        int max = Arrays.stream(array1).max().getAsInt();
        int maxPos = 0;
        
        for (int n = 0; n < len; n++){
            if(array1[n] == min){
                minPos = n;
            } else if (array1[n] == max) {
                maxPos = n;
            }
        }
        
        System.out.println("El número menor es " + min + " está en la posicion "+minPos);
        System.out.println("El número mayor es " + max + " está en la posicion "+maxPos);

    }
}