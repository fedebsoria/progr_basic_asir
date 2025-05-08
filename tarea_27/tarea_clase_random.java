/*
Tarea Clase Random
Crea un programa en Java que utilice la clase Random para generar contraseñas seguras
de una longitud especificada por el usuario. El programa debe cumplir con las siguientes
características:
1. Longitud personalizada: Pide al usuario que introduzca la longitud de la
contraseña (por ejemplo, 8, 12, 16 caracteres, etc.).
2. Caracteres incluidos:
o Letras mayúsculas (A-Z).
o Letras minúsculas (a-z).
o Números (0-9).
o Caracteres especiales (!, @, #, $, %, &, *, etc.).
3. Aleatoriedad: Usa la clase Random para seleccionar aleatoriamente caracteres
de los distintos grupos mencionados.
4. Validación: Asegúrate de que la contraseña generada contiene al menos un
carácter de cada grupo (mayúsculas, minúsculas, números y caracteres
especiales).
5. Salida: Muestra la contraseña generada por consola.
Extras opcionales:
• Permite al usuario elegir qué tipos de caracteres incluir (por ejemplo, solo
números y letras).
• Genera varias contraseñas a la vez, en caso de que el usuario lo solicite
*/

import java.util.*;

public class tarea_clase_random {
    static final String MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    static final String NUMEROS = "0123456789";
    static final String ESPECIALES = "!@#$%&*";

    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas contraseñas quieres generar?: ");
        int cantidad = scanner.nextInt();

        System.out.print("Introduce la longitud de la contraseña: ");
        int longitud = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("¿Incluir letras mayúsculas? (s/n): ");
        boolean incluirMayus = scanner.nextLine().equalsIgnoreCase("s");

        System.out.print("¿Incluir letras minúsculas? (s/n): ");
        boolean incluirMinus = scanner.nextLine().equalsIgnoreCase("s");

        System.out.print("¿Incluir números? (s/n): ");
        boolean incluirNums = scanner.nextLine().equalsIgnoreCase("s");

        System.out.print("¿Incluir caracteres especiales? (s/n): ");
        boolean incluirEsp = scanner.nextLine().equalsIgnoreCase("s");

        if (!incluirMayus && !incluirMinus && !incluirNums && !incluirEsp) {
            System.out.println("Debes seleccionar al menos un tipo de carácter.");
            return;
        }

        for (int i = 0; i < cantidad; i++) {
            String contraseña = generarContrasena(longitud, incluirMayus, incluirMinus, incluirNums, incluirEsp);
            System.out.println("Contraseña #" + (i + 1) + ": " + contraseña);
        }

        scanner.close();
    }

    public static String generarContrasena(int longitud, boolean usarMayus, boolean usarMinus, boolean usarNums, boolean usarEsp) {
        StringBuilder pool = new StringBuilder();
        List<Character> obligatorios = new ArrayList<>();

        if (usarMayus) {
            pool.append(MAYUSCULAS);
            obligatorios.add(MAYUSCULAS.charAt(random.nextInt(MAYUSCULAS.length())));
        }
        if (usarMinus) {
            pool.append(MINUSCULAS);
            obligatorios.add(MINUSCULAS.charAt(random.nextInt(MINUSCULAS.length())));
        }
        if (usarNums) {
            pool.append(NUMEROS);
            obligatorios.add(NUMEROS.charAt(random.nextInt(NUMEROS.length())));
        }
        if (usarEsp) {
            pool.append(ESPECIALES);
            obligatorios.add(ESPECIALES.charAt(random.nextInt(ESPECIALES.length())));
        }

        StringBuilder contraseña = new StringBuilder();

        // Añadir los obligatorios primero
        for (char c : obligatorios) {
            contraseña.append(c);
        }

        // Completar con caracteres aleatorios
        for (int i = obligatorios.size(); i < longitud; i++) {
            contraseña.append(pool.charAt(random.nextInt(pool.length())));
        }

        // Mezclar los caracteres para mayor aleatoriedad
        List<Character> lista = new ArrayList<>();
        for (char c : contraseña.toString().toCharArray()) {
            lista.add(c);
        }
        Collections.shuffle(lista);

        // Reconstruir la contraseña final
        StringBuilder finalContrasena = new StringBuilder();
        for (char c : lista) {
            finalContrasena.append(c);
        }

        return finalContrasena.toString();
    }
}
