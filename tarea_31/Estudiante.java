public class Estudiante extends Persona{
    private String carrera;
	private  long legajo;

	public Estudiante(String name, int age, String carrera, long legajo) {
		super(name, age);
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