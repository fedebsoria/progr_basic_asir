/*
* Alumno: Federico B Soria
* 1.Desarrollar un programa que solicita la contraseña o password. Se debe comprobar:
* • Que la longitud de la cadena no es superior a 25 caracteres.
* • No debe contener caracteres especiales:@,.,$,#,&,/
* • Se debe almacenar la primera letra y la última en mayúsculas
*/

import java.util.Scanner;

public class tareaString1 {
    public static void main(String [] args){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una contraseña: ");
        System.out.println("No puede contener caracteres especiales");
        System.out.println("Longitud menos a 25 caracteres");
        System.out.println("La primera y ultima letra deben ser mayusculas");
        
        //Ingreso de contraseña
        String password = sc.next();
        
        //Calcula el largo de la contraseña
        int len_password = password.length();
        
        //Controla caracteres especiales
        boolean contieneCarEsp = password.matches(".*[@.,$#&/].*");
        
        //Controla mayusculas
        boolean esMayusPrimera = Character.isUpperCase(password.charAt(0));
        boolean esMayusUltm = Character.isUpperCase(password.charAt(password.length()-1));

        
        if (len_password >= 25){
            System.out.println("Contraseña superior a 25 caracteres");
        } else if (contieneCarEsp) {
            System.out.println("Contraseña no admite caracteres especiales");
        } else if (!esMayusPrimera || !esMayusUltm) {
            System.out.println("La primera y la ultima letra deben de ser mayusculas");
        } else {
            System.out.println("Contraseña guardada correctamente");
        }
        
        sc.close();
    }
}