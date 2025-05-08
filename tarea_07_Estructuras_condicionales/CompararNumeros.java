/*
* Tarea Condicionales
*
* Alumno: Federico B. Soria
*
* 1. Se piden por pantalla tres números. 
* Hay que comparar cual es el menor de los tres y el mayor
*/


import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar tres números al usuario
        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();
        
        System.out.println("Introduce el tercer número:");
        int num3 = scanner.nextInt();

        // Inicializar variables para el menor y el mayor
        int menor = num1;
        int mayor = num1;

        // Comparar para encontrar el menor
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        // Comparar para encontrar el mayor
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        // Mostrar los resultados
        System.out.println("El menor de los tres números es: " + menor);
        System.out.println("El mayor de los tres números es: " + mayor);

        // Cerrar el scanner
        scanner.close();
    }
}

