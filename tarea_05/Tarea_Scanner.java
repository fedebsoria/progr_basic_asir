/*
Federico Bernardo Soria

TAREA:

1. Se pide por pantalla, utilizando el objeto Scanner: 
-Nombre: 
-Apellidos: 
Aparece impreso en el documento: 
"Buenos días nombre apellidos" 
 
Nota: Usar el objeto Scanner 
 
*/


import java.util.Scanner; //importa el onjeto Scanner

public class Tarea_Scanner{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in); // Crea un objeto scanner que lea del Standard Inpur

        //se pide el nombre y se ingresa por SI
        System.out.println("Ingrese su nombre:");
        String nombre = sc.nextLine();

        //se pide el apellido y se ingresa SI
        System.out.println("Ingrese sus apellidos:");
        String apellidos = sc.nextLine();

        //se imprime el saludo buenos días nombre apellidos
        System.out.printf("Buenos días %s %s\n", nombre, apellidos);

        sc.close(); //se cierra el objeto scanner
    }
}