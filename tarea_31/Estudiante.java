/*
 * Tarea Herencia I
 * Alumno: Federico B.  Soria
 */

public class Estudiante extends Persona{
    private String carrera;
	private  long legajo;

    //metodos carrera
    public String getCarrera(){
        return this.carrera;
    }

    public void setCarrera(String val){
        this.carrera = val;
    }

    //metodos legajo
    public long getLegajo(){
        return this.legajo;
    }

    public void setLegajo(long val){
        this.legajo = val;
    }
}