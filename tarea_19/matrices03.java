import java.util.Scanner;

public class matrices03{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int[][] matriz = new int[4][4];
    boolean matrizRellena = false;
    int opcion;
    
    do {
        System.out.println("Menú:");
        System.out.println("1. Rellenar toda la matriz");
        System.out.println("2. Sumar una fila");
        System.out.println("3. Sumar una columna");
        System.out.println("4. Sumar la diagonal principal");
        System.out.println("5. Sumar la diagonal inversa");
        System.out.println("6. Calcular la media de todos los valores");
        System.out.println("7. Salir");
        System.out.print("Elige una opción: ");
        opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                rellenarMatriz(matriz, scanner);
                matrizRellena = true;
                break;
            case 2:
                if (matrizRellena){
                    sumarFila(matriz, scanner);
                } else {
                    System.out.println("Debes rellenar la matriz primero.");
                }
                break;
            case 3:
                if (matrizRellena){
                    sumarColumna(matriz, scanner);
                } else {
                    System.out.println("Debes rellenar la matriz primero.");
                }
                break;
            case 4:
                if (matrizRellena) {
                    sumarDiagonalPrincipal(matriz);
                } else {
                    System.out.println("Debes rellenar la matriz primero.");
                }
                break;
            case 5:
                if (matrizRellena) {
                    sumarDiagonalInversa(matriz);
                } else {
                    System.out.println("Debes rellenar la matriz primero.");
                }
                break;
            case 6:
                if (matrizRellena) {
                    sumarDiagonalInversa(matriz);
                } else {
                    System.out.println("Debes rellenar la matriz primero.");
                }
                break;
            case 7:
                System.out.println("Saliendo del programa.");
                break;
            default:
                System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        scanner.close();
    }
    
    public static void rellenarMatriz(int[][] matriz, Scanner scanner){
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    
    public static void sumarFila(int[][] matriz, Scanner scanner) {
        System.out.print("Introduce el número de fila (0-3): ");
        int fila = scanner.nextInt();
        if (fila < 0 || fila > 3) {
            System.out.println("Fila no válida.");
            return;
        }
        int suma = 0;
        for (int j = 0; j < 4; j++) {
            suma += matriz[fila][j];
        }
        System.out.println("La suma de la fila " + fila + " es: " + suma);
    }

    public static void sumarColumna(int[][] matriz, Scanner scanner) {
        System.out.print("Introduce el número de columna (0-3): ");
        int columna = scanner.nextInt();
        if (columna < 0 || columna > 3) {
            System.out.println("Columna no válida.");
            return;
        }
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[i][columna];
        }
        System.out.println("La suma de la columna " + columna + " es: " + suma);
    }

    public static void sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[i][i];
        }
        System.out.println("La suma de la diagonal principal es: " + suma);
    }

    public static void sumarDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma += matriz[i][3 - i];
        }
        System.out.println("La suma de la diagonal inversa es: " + suma);
    }

    public static void calcularMedia(int[][] matriz) {
        int suma = 0;
        int elementos = 4 * 4;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                suma += matriz[i][j];
            }
        }
        double media = (double) suma / elementos;
        System.out.println("La media de todos los valores de la matriz es: " + media);
    }
}