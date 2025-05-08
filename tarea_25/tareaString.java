/*
* alumno: Federico B. Soria
* 1. 1.Diseña un programa para utilizar el objeto String. Se pide por pantalla una dirección
* de correo electrónico, se debe comprobar:
• Que contiene la @
• Que no se teclea más de 1 @
• Que aparece un punto, al final del correo electrónico.
• Que la longitud mínima sea de 20 caracteres.
• Que los textos aparecen en minúsculas.
*/

import java.util.Scanner;

public class tareaString {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte su E-mail: ");
        //Lee el email
        String email = sc.nextLine();
        
        //Leé si contiene @
        boolean contieneArroba = email.contains("@");
        if (!contieneArroba){
            System.out.println("E-mail incorrecto. Debe contener un @");
        }
        
        //Leé si contiene más de un @
        int arrobas = 0;
        
        for (int i = 0; i < email.length(); i++)
        {
            char letra = email.charAt(i);
            if (letra == '@'){
                arrobas++;
            }
        }
        
        if(arrobas > 1){
            System.out.println("E-mail incorrecto. No debe contener mas de un @");
        }
        
        //Leé si contiene un .com al final
        boolean contieneDotCom = email.contains(".com");
        
        if(!contieneDotCom){
            System.out.println("El mail debe terminar en .com");
        }
        
        //Leé la longitud y si es < 20 da error
        if (email.length() < 20){
            System.out.println("El E-mail debe de contener al menos 20 caracteres");
        }
        
        //Leé que sea todo minuscula
        boolean esMayus = false;
        
        for(int j = 0; j < email.length(); j++){
            char letra = email.charAt(j);
            if (Character.isUpperCase(letra)){
                esMayus = true;
            }
        }
        
        if (esMayus){
            System.out.println("No se permiten mayusculas");
        }
    }
}