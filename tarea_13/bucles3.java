/*
*  Pregunar por pantalla tu nombre y el número de veces que deseamos imprimir el
*  nombre
*  
*  Alumno; Federico B Soria
*/

import java.util.Scanner;

public class bucles3{
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        int n;
        
        System.out.println("Inserte su nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Cuantas veces quiere repetirlo: ");
        n = sc.nextInt();
        
        for (int i = n; i > 0; i--){
            System.out.println(nombre);
        }
    }
}

