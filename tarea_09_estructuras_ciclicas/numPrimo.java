/*
 * Tarea  Bucles
 * 1.Se pide por pantalla, un número, para comprobar si es primo. Si se introduce el
 *  número cero termina el juego.
 * 
 *  Alumno ASIR on-line: Federico B. Soria
 */
import java.util.Scanner;

public class numPrimo {

    public static void main(String args[]) {
        // Se crea el objeto scanner para leer el input del usuario
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        while (num != 0) {
        // Se pide por pantalla un num al usuario
            System.out.println("Ingrese un número para saber si es primo o no"
                    + "(pulse 0 para salir):");
            num = scanner.nextInt();
            
            if(num < 2){
                System.out.println("No es Primo!");
            }
            else if (num == 2 || num == 3){
                System.out.println("Es Primo!");           
            }
            else {
                for(int i=2; i*i<=num; i++){
                    if(num%i==0){
                        System.out.println("No Es Primo!");
                        break;
                    }
                    else{
                        System.out.println("Es Primo!");
                        break;
                    }
                }
            }
        }
        System.out.println("Adios!");
    }
}
