/*
 * Tarea  Bucles
 * 4. Calcular el factorial del número 15.
 * 
 *  Alumno ASIR on-line: Federico B. Soria
 */

public class factorial15 {

    public static void main(String args[]) {
        //Inicializa el resuiltado
        long factorial = 1;
        //Inicializamos el número del que queremos el factorial
        int numero = 15;
        //Formula factorial n! = n*(n-1)*(n-2)*...*1
        for (int i = 1; i <= numero; i++){
            factorial *= i;
        }
        
        System.out.println(factorial);
    }
}
