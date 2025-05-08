/* 
* alumno: Federico B. Soria
* 
* 2. Escribe un programa que genere 20 números enteros aleatorios entre 0 y 99 y los almacene
* en un array. El programa debe crear un nuevo array con los números primos que haya entre esos
* 20 números. Luego debe mostrar los dos arrays.
*/

import java.util.Random;

public class arrays3_2{
    public static void main(String[] args){
        Random random = new Random();
        int min = 0;
        int max = 99;
        int maxArray = 20;
        int[] array1 = new int [maxArray];
        int[] arrayPrimo = new int [maxArray];
        
        for(int n = 0; n < maxArray; n++){
            array1[n] = random.nextInt((max - min)+1) + min;
            System.out.print(array1[n]+",");
        }
        System.out.println();
        System.out.println("-----------");
        System.out.println("Nums primos en la lista:");
        
        for (int j = 0; j < maxArray; j++){
            if (esPrimo(array1[j]) == true){
                arrayPrimo[j] = array1[j];
                System.out.print(arrayPrimo[j] + ",");
            }
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
            return true;
        }
}