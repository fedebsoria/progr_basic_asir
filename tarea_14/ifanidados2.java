import java.util.Scanner;

public class ifanidados2{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de filas: ");
        int filas = sc.nextInt();

        
        for (int i = 1; i <= filas; i++){
            for (int j = 1; j <= i; j++){
                System.out.printf("%d",j);}
            System.out.println();
        }
        
        sc.close();
        
    }
}