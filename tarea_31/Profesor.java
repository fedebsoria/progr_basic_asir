/*
 * Tarea Herencia I
 * Alumno: Federico B.  Soria
 */

public class Profesor extends Persona{
    private String materia;
    private String cargo;

    //metodos materia
    public String getMateria(){
        return this.materia;
    }

    public void setMateria(String val){
        this.materia = val;
    }

    //metodos cargo
    public String getCargo(){
        return this.cargo;
    }

    public void setCargo(String val){
        this.cargo = val;
    }
}
