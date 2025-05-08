import java.util.Scanner;

public class Euroconversor {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca un importe en euros
        System.out.print("Introduce un importe en euros: ");
        double euros = scanner.nextDouble();

        // Definir la tasa de conversión de euros a libras
        double tasaConversion = 0.85; // Ejemplo: 1 euro = 0.85 libras

        // Calcular el importe en libras
        double libras = euros * tasaConversion;

        // Mostrar el resultado
        System.out.printf("El importe en libras es: %.2f%n", libras);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
