/*
* Alumno: Federico Soria
* Diseña un arrayList con los siguientes datos:
* • Sofía
* • Chema
* • Alex
* • Rosa
* Consideraciones
* • Mostrar con la propiedad pertinente el tamaño del arraylist.
* • Buscar el valor de Juan, con el método en cuestión para ver si lo contiene.
*  Mostrar el mensaje si lo contiene o no, según proceda
* • Borra el ultimo element del array
*/

import java.util.ArrayList;

public class arrayList_03{
    public static void main(String[] args){
        //Crear un arrayList para almacenar los nombres
        ArrayList<String> nombres = new ArrayList<>();
        
        //Añadir los nombres
        nombres.add("Sofia");
        nombres.add("Chema");
        nombres.add("Alex");
        nombres.add("Rosa");
        
        //Mostar el tamaño del arraylist
        System.out.println("Largo de la lista: " + nombres.size());
        
        //Buscar el valor Juan y mostrar si lo contiene
        boolean valJuan = nombres.contains("Juan");
        if (valJuan == true){
            System.out.println("Se encuentra el valor Juan en la ArrayList");
        } else {
            System.out.println("No se encuentra el valor Juan en la ArrayList");
        }
        
        //Borrar el último elemento del arraylist
        nombres.removeLast();
 
        
    }
}
        
