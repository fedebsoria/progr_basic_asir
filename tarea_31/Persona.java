/*
 * Práctica Clases Extendidas
 * 
 * Alumno: Federico Soria
 * 
 */

public class Persona {
    private String nombre;
    private int edad;

    //Constructor vacío
    public Persona(){
    }

    //Constructor: inicializa Persona
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //metodos nombre
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String val){
        this.nombre = val;
    }

    //metodos edad
    public int getEdad(){
        return this.edad;
    }

    public void setEdad(int val){
        this.edad = val;
    }
}