/*
* 1.Diseña un código de programación para crear una estructura de la siguiente forma, se debe
* de pedir por pantalla:
*  Se pide por pantalla el número de filas
*  Se pide por pantalla el carácter a utilizar.
* #
* ##
* ###
* ####
* #####
*/

import java.util.Scanner;

public class ifanidados1{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de filas: ");
        int filas = sc.nextInt();
        
        System.out.println("Ingrese un carácter: ");
        char caracter = sc.next().charAt(0);
        
        for (int i = 1; i < filas; i++){
            for (int j = 1; j <= i; j++){
                System.out.printf("%c",caracter);}
            System.out.println();
        }
        
        sc.close();
        
    }
}