import java.util.Scanner;

public class tareaMatricesIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una palabra: ");
        String palabra = scanner.nextLine();
        
        // Crear una matriz con el mismo número de celdas que letras tiene la palabra
        char[] matriz = new char[palabra.length()];
        
        // Almacenar cada letra en una celda de la matriz
        for (int i = 0; i < palabra.length(); i++) {
            matriz[i] = palabra.charAt(i);
        }
        
        // Comprobar si hay algún valor repetido en alguna celda
        if (hayRepetidos(matriz)) {
            System.out.println("Hay valores repetidos en la matriz.");
        } else {
            System.out.println("No hay valores repetidos en la matriz.");
        }
        
        scanner.close();
    }

    public static boolean hayRepetidos(char[] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                if (matriz[i] == matriz[j]) {
                    return true; // Si encontramos un valor repetido, devolvemos true
                }
            }
        }
        // Si no encontramos valores repetidos, devolvemos false
        return false; 
    }
}