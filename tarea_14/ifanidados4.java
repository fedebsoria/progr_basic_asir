import java.util.Scanner;

public class ifanidados4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        if (!(numero <= 0)) {
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }
        } else {
            System.out.println("Error: El número debe ser distinto de cero y mayor que cero.");
        }
    }
}