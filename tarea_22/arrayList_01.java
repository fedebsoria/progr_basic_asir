/*
    Alumno: Federico Soria

    1. Diseña un programa en Java que crea un arraylist, que contiene los nombres de 4
    personas. Mostrar los datos del array al completo.  
*/

import java.util.ArrayList;

public class arrayList_01{
    public static void  main(String[] args){
        // Crear un ArrayList para almacenar nombres
        ArrayList<String> nombres = new ArrayList<>();
    
        //Añadir nombres al ArrayList
        nombres.add("Guilliman");
        nombres.add("Sanguinius");
        nombres.add("Dorn");
        nombres.add("Corvus");

        //Mostrar los datos del ArrayList al Completo
        for(String nombre : nombres){
            System.out.println(nombre);
        }
    }
} 