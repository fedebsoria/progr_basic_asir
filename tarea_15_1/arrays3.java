/*
* Alumno: Federico B. Soria
* 3. Crear un array de caracteres, con los siguientes valores: a,e,r,t,y,u. Crea un array con datos
* enteros con valores del 1 al 6.
* Diseña un tercer array que tiene el mismo número de celdas que la suma de las celdas de los
* dos arrays anteriores
*/

public class arrays3{
    public static void main(String[] args){
        char[] array1 = {'a','e','r','t','y','u'};
        int[] array2 = {1,2,3,4,5,6};
        
        int array3Lenght = array1.length + array2.length;
        int[] array3 = new int [array3Lenght];
        
       //System.out.println(array3.length);
    }
}