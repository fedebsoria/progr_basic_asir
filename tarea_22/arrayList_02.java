/*
Alumno: Federico Soria

2. Diseña un programa que pide por pantalla 5 datos de tipo int, y se almacenan en un
arraylist. Posteriormente se pregunta si se desean imprimir los datos, en caso
afirmativo mostrar los datos por pantalla

*/

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList_02 {
    public static void main(String[] args){
        //Crear un ArrayLista para almacenar los int
        ArrayList<Integer> nums = new ArrayList<>();
        //Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserte hasta cinco números:");
        //Se empieza loop para que se inserten los números
        while(nums.size() < 5){
            nums.add(scanner.nextInt());
        }
        
        System.out.println("");
        System.out.println("¿Desea que se imprima la lista? S/N");
        //Se espera por el input del usuario
        String opcionUser = scanner.next();
        
        if(opcionUser.equals("S") || opcionUser.equals("s")){
            for(int num : nums){
                System.out.println(num);
            }
        } else if (opcionUser.equals("N") || opcionUser.equals("n")){
            System.out.println("Adios");
        } else {
            System.out.println("Opción incorrecta");
        }
    }
}