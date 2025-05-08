import java.util.Scanner;

public class ifanidados2{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero: ");
        int numero = sc.nextInt();
        
        if (numero >= 0 ){
            System.out.println(numero);
            if (numero >= 10 && numero <= 99){
                int parOno = numero % 2;
                if (parOno == 0){
                    System.out.println("es par");
                } else {
                    System.out.println("no es par");
                }
            } else if (numero > 99) {
                int resto = numero % 2;
                System.out.println("Resto div por 2: " + resto);
            } else {
                System.out.println("ERROR");
            }
        } else {
            System.out.println("ERROR");
        }
        
        sc.close();
        
    }
}