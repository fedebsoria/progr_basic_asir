/*
*  Imprimir los números del 10000 al 1, con incremento de 10
*  
*  Alumno; Federico B Soria
*/

public class bucles2{
    public static void main (String[]  args){
        int n = 10000;
        
        for (int i=10000; i > 0; i-=10){
            System.out.println(n);
            n -= 10;
        }
        
        System.out.println("1");
    }
}