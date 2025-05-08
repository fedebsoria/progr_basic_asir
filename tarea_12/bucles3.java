/*
* 3. Escribe un programa en Java que utilice un bucle do-while para
* crear un menú interactivo en consola. 
* El programa debe mostrar al usuario las siguientes opciones:
*  -Sumar dos números
*  -Restar dos números
*  -Multiplicar dos números
*  -Salir
* El programa debe ejecutar la opción seleccionada 
* y volver a mostrar el menú después de realizar la operación,
* hasta que el usuario seleccione la opción "4. Salir"
*/

import java.util.Scanner;

public class bucles3{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        //creación de menú
        String menu = "Elija una operacion: \n"
                + "1 - sumar dos numeros\n"
                + "2 - restar dos numeros\n"
                + "3 - multiplicar dos numeros\n"
                + "4 - salir \n";
        
        String inputNum = "Inserte un número: ";
        
        String resultado = "Total: ";
        
        //inicialización de variables para las operaciones
        double num1;
        double num2;
        double total = 0;
        int userInput;
        
        //Empieza el loop
        do{
            //Print menu
            System.out.println(menu);
            userInput = sc.nextInt();
            if (userInput == 4){
                break;
            }
            //Print Input 1er num
            System.out.println(inputNum);
            num1 = sc.nextDouble();
            //Print Input 2do num
            System.out.println(inputNum);
            num2 = sc.nextDouble();
            //hacer calculo
            if (userInput == 1){
                total = num1 + num2;
            } else if (userInput == 2){
                total = num1 - num2;
            } else if (userInput == 3) {
                total = num1 * num2;
            } else {
                System.out.println("No es una opción valida");
            }
            
            System.out.println(resultado + total);
            System.out.println(" ---------------------- ");
        }
        while (userInput != 4);
        
        System.out.println("Adios!");
    }
}