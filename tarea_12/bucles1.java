/*
* 1.Diseña un programa que imprime los números del 1-100. 
* Realiza el mismo ejercicio con un bucle for y un bucle while.
* Alumno: Federico Bernardo Soria - ASIR
*/

public class bucles1 {
    public static void main(String[] args){
        //variables donde se guardarán los números
        int numFor = 0;
        int numWhile = 0;
        
        //Bucle for 1-100
        System.out.println("Blucle for: ");
        for (int i = 0; i < 100; i++){
            numFor += 1;
            System.out.println(numFor);
        }
        
        System.out.println("");
        
        //Bucle while 1-100
        System.out.println("Bucle while");
        while (numWhile < 100){
            numWhile++;
            System.out.println(numWhile);
        }
    }
}