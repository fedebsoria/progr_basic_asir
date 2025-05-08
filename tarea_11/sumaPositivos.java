/*
 * Escribe un programa en Java que utilice un bucle while para solicitar al usuario que ingrese números enteros positivos. 
 * El programa debe sumar estos números y mostrar el resultado acumulado en cada iteración.
 * El bucle debe finalizar cuando el usuario ingrese un número negativo, momento en el cual se mostrará el total de la suma y el programa terminará.
 * 
 * Alumno: Federico B. Soria - ASIR
 */

public class sumaPositivos {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int suma = 0;
        int numero = 0;

        while (numero >= 0) {
            System.out.println("Introduce un número entero positivo: ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                suma += numero;
                System.out.println("Suma acumulada: " + suma);
            }
        }
        
        scanner.close();
        System.out.println("Total de la suma: " + suma);
    }
}