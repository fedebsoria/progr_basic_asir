/*
 * • Imprimir con un bucle for los valores de 1-1000 de 5 en 5
 * 
 * Alumno: Federico B. Soria
*/

public class bucles1 {
    public static void main (String[] args){
        int n = 0;
        
        System.out.println("1");
        
        for (int i = 5; i <= 1000; i+=5) {
            n += 5;
            System.out.println(n);
        }
    }
}