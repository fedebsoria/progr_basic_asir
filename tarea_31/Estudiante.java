public class Estudiante extends Persona{
    private String carrera;
	private  long legajo;

	public Estudiante(String nombre, int edad, String carrera, long legajo) {
		super(nombre, edad);
        this.carrera = carrera;
        this.legajo = legajo;
	}

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