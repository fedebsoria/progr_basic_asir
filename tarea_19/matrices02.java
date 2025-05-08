/*

Alumno: Federico B. Soria

2. Crear dos matrices de nxn y sumar sus valores, los resultados se deben almacenar en otra
matriz. Los valores y la longitud, seran insertados por el usuario. Mostrar las matrices
originales y el resultado.

*/

import java.util.Scanner;
import java.util.Random;

public class matrices01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        //se pide al usuario las columnas
        System.out.println("Inserte la cantidad de comlumnas:");
        int n_columnas = sc.nextInt();
        
        int[][] matriz = new int[5][n_columnas];
        
        for (int i = 0; i < 5; i++){
            for (int n = 0; n < n_columnas; n++){
                matriz[i][n] = random.nextInt(11);
            }
        }
        
        printMatrix(matriz);
    }
    
    public static void printMatrix(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int n = 0; n < matriz[i].length; n++){
                System.out.print(matriz[i][n] + "");
            }
            System.out.println();
        }
    }
}

