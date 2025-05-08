/*
* 
* Alumno: Federico B. Soria
* 
* Tarea Clase Random II
* Escribe un programa en Java que utilice la clase Random para simular el lanzamiento de
* uno o más dados. El programa debe incluir las siguientes características:
* 1. Cantidad de dados: Solicita al usuario que ingrese cuántos dados desea lanzar
* (por ejemplo, 1 dado, 2 dados, etc.).
* 2. Número de caras: Pide al usuario que ingrese el número de caras de los dados
* (por ejemplo, dados estándar de 6 caras o dados personalizados como de 20
* caras).
* 3. Generación de valores: Utiliza la clase Random para generar los resultados de
* cada dado.
* 4. Mostrar resultados: Imprime los resultados del lanzamiento de cada dado.
* 5. Sumar los valores: Calcula e imprime la suma total de los valores obtenidos en
* los dados.
* Extras opcionales:
* • Simula múltiples rondas de lanzamientos y muestra las estadísticas, como el
* promedio de los resultados en cada ronda.
* • Agrega reglas para determinar un "ganador" si estás simulando un juego.
*/

import java.util.*;

public class tarea_clase_random_2 {
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas rondas deseas simular?: ");
        int rondas = scanner.nextInt();

        System.out.print("¿Cuántos dados quieres lanzar por ronda?: ");
        int cantidadDados = scanner.nextInt();

        System.out.print("¿Cuántas caras tiene cada dado?: ");
        int caras = scanner.nextInt();

        System.out.print("¿Cuántos jugadores hay?: ");
        int jugadores = scanner.nextInt();

        int[][] resultados = new int[jugadores][rondas];
        int[] totales = new int[jugadores];

        for (int ronda = 0; ronda < rondas; ronda++) {
            System.out.println("\n--- Ronda " + (ronda + 1) + " ---");

            for (int jugador = 0; jugador < jugadores; jugador++) {
                int suma = 0;
                System.out.print("Jugador " + (jugador + 1) + " lanza: ");

                for (int dado = 0; dado < cantidadDados; dado++) {
                    int resultado = random.nextInt(caras) + 1; // de 1 a caras
                    System.out.print(resultado + " ");
                    suma += resultado;
                }

                resultados[jugador][ronda] = suma;
                totales[jugador] += suma;
                System.out.println("→ Total: " + suma);
            }
        }

        System.out.println("\n=== Resultados finales ===");
        int ganador = 0;
        for (int jugador = 0; jugador < jugadores; jugador++) {
            double promedio = (double) totales[jugador] / rondas;
            System.out.printf("Jugador %d - Total: %d | Promedio: %.2f%n", 
                jugador + 1, totales[jugador], promedio);

            if (totales[jugador] > totales[ganador]) {
                ganador = jugador;
            }
        }

        System.out.println("\n🏆 ¡El ganador es el Jugador " + (ganador + 1) + "!");
        scanner.close();
    }
}
