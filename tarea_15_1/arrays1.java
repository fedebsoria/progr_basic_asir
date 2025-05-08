/*
* Alumno: Federico B. Soria
* 1. Diseñar un array, que almacena los números del 1 al 10. Consideraciones:
* Utilizar un bucle for para cargar el array
* Se deben imprimir los datos del array en sentido inverso
*/

public class arrays1 {
    public static void main (String[] args){
        int largo = 10;
        int[] numeros = new int [largo];
        
        for(int i = 0; i < 10; i++){
            numeros[i] = i + 1;
        }
        
        for(int n = numeros.length - 1; n >= 0; n--){
            System.out.println(numeros[n]);
        }
    }
}