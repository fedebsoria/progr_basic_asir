/*
* Alumno: Federico B. Soria
* 2.Se pide por pantalla el número de posiciones que queremos
* que tenga nuestro array, se piden los datos por pantalla.
* Se crea otro array, pidiendo el número de posiciones por pantalla.
* Los valores se cargan con un bucle for.
* Crear un tercer array que contiene, los datos de los dos arrays
*/

import java.util.Scanner;

public class arrays2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Pedido de número de posiciónes
        System.out.println("Inserte un número de posiciones para el array: ");
        int lenghtArray1 = sc.nextInt();
        
        //Se crea el array
        int[] array1 = new int [lenghtArray1];
        
        //Se piden los datos para el array
        for(int i = 0; i < lenghtArray1; i++){
            System.out.println("Inserte numero: ");
            array1[i] = sc.nextInt();
        }
        
        //Pedido de número de posiciónes
        System.out.println("Inserte un num para largo del arrayt: ");
        int lenghtArray2 = sc.nextInt();
        
        //Se crea el array
        int[] array2 = new int [lenghtArray2];
        
        //Se piden los datos para el array
        for(int i = 0; i < lenghtArray1; i++){
            array2[i] = i + 1;
        }
        
        //se unen los array
        int[] array3 = new int [lenghtArray1 + lenghtArray2];
        
        System.arraycopy(array1, 0, array3, 0, array1.length);
        
        System.arraycopy(array2, 0, array3, array1.length, array2.length);
        
        //ver el array3
        /*
        for (int i : array3){
            System.out.print(i + " ");
        }
        */
    }
}