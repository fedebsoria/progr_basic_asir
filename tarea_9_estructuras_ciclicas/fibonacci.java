/*
 * Tarea  Bucles
 * 2.Calcular los n, los 10 primeros números de la serie de fibonnaci.
 * 
 *  Alumno ASIR on-line: Federico B. Soria
 */
import java.util.ArrayList;
import java.util.List;

public class fibonacci {

    public static void main(String args[]) {
        // Crea una lista de enteros
        List<Integer> fibonacci = new ArrayList<>();
        
        //primeros números de la serie
        fibonacci.add(0);
        fibonacci.add(1);
        
        //contador para el total de digitos de la serie
        int n = 10;
        
        //Var para guardar el siguiente de la serie
        int sigSerie;
        
        //Loop para calcular los siguientes números de la serie
        //Formula Fibonacci F(n) = F(n - 1) + F(n - 2)
        for(int i = 2; i < n; i++){
            sigSerie = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(sigSerie);
        }
        
        System.out.println(fibonacci);
    }
}
