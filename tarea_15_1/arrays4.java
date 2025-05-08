/*
* Alumno: Federico B. Soria
* 4.Diseña un array con los números del 1-57, se debe mostrar el número de celdas que
* contienen números pares y el número de celdas que contienen números impares
*/

public class arrays4{
    public static void main (String[] args){
        int par = 0;
        int impar = 0;
        int array1Len = 57;
        int[] array1 = new int [array1Len];
    
        for(int i = 0; i < array1Len; i++){
            array1[i] = i + 1;
        }
        
        for(int n = 0; n <= array1.length-1; n++){
            if(array1[n] % 2 == 0){
                par += 1;
            } else {
                impar += 1;
            }
        }
        
        System.out.println("Cantidad de num pares: " + par);
        System.out.println("Cantidad de num impares: " + impar);
        
    }
}