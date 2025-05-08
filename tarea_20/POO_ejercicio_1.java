/*
Alumno: Federico B. Soria
1. Queremos representar con programación orientada a objetos, un aula con estudiantes y un
profesor.
• Tanto de los estudiantes como de los profesores necesitamos saber su nombre, edad y
sexo. De los estudiantes, queremos saber también su calificación actual (entre 0 y 10) y
del profesor que materia da.
• Las materias disponibles son matemáticas, filosofía y física.
• Los estudiantes tendrán un 50% de hacer novillos, por lo que si hacen novillos no van a
clase pero aunque no vayan quedara registrado en el aula (como que cada uno tiene su
sitio).
• El profesor tiene un 20% de no encontrarse disponible (reuniones, baja, etc.) Las dos
operaciones anteriores deben llamarse igual en Estudiante y Profesor (polimorfismo).
• El aula debe tener un identificador numérico, el número máximo de estudiantes y para
que esta destinada (matemáticas, filosofía o física). Piensa que más atributos necesita.
• Un aula para que se pueda dar clase necesita que el profesor esté disponible, que el
profesor de la materia correspondiente en el aula correspondiente (un profesor de
filosofía no puede dar en un aula de matemáticas) y que haya más del 50% de alumnos.
• El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse clase,
teniendo en cuenta las condiciones antes dichas. Si se puede dar clase mostrar cuantos
alumnos y alumnas (por separado) están aprobados de momento (imaginad que les
están entregando las notas).www.digitechfp.com
• NOTA: Los datos pueden ser aleatorios (nombres, edad, calificaciones, etc.) siempre y
cuando tengan sentido (edad no puede ser 80 en un estudiante o calificación ser 12).
*/

import java.util.List;

//Se crea la clase persona:
public class Persona {
    protected String nombre;
    protected int edad;
    protected char sexo;
    
    public Persona(String nombre, int edad ,char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    //Getters y setters
}

//Se crea la clase Estudiante
public class Estudiante extends Persona {
    private double calificacion;
    
    public Estudiante(String nombre, int edad, char sexo, double calificacion){
        super(nombre, edad, sexo);
        this.calificacion = calificacion;
    }
    
    public boolean hacerNovillos() {
        return Math.random() < 0.5;
    }
    
    public double getCalificacion() {
        return calificacion;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    //Getters y setters
}

//Se crea la clase Profesor
public class Profesor extends Persona {
    private String materia;
    
    public Profesor(String nombre, int edad, char sexo, String materia){
        super(nombre, edad, sexo);
        this.materia = materia;
    }
    
    public boolean estaDisponible(){
        return Math.random() >= 0.2;
    }
    
    public String getMateria() {
        return materia;
    }
    
    public void setMateria(String materia){
        this.materia = materia;
    }
}

//Se creea la clase Aula
public class Aula{
    private int id;
    private int maxEstudiantes;
    private String materia;
    private List<Estudiante> estudiantes;
    private Profesor profesor;
    
    public Aula(int id, int maxEstudiantes, String materia,
            List<Estudiante> estudiantes, Profesor profesor){
        this.id = id;
        this.maxEstudiantes = maxEstudiantes;
        this.materia = materia;
        this.estudiantes = estudiantes;
        this.profesor = profesor;
    }
    
    public boolean puedeDarseClase() {
        if (!profesor.estaDisponible() || 
                !profesor.getMateria().equals(materia)){
            return false;
        }
        long estudiantesPresentes = 
                estudiantes.stream().filter(e -> !e.hacerNovillos()).count();
        return estudiantesPresentes > maxEstudiantes / 2;
    }
    
    public void mostrarAprobados() {
        long aprobados = estudiantes.stream().filter(e -> e.getCalificacion()
         >= 5).count();
        long aprobadas = estudiantes.stream().filter(e -> e.getCalificacion()
                >= 5&& e.getSexo() == 'F').count();
        long aprobadosHombres = aprobados - aprobadas;
        
        System.out.println("Aprobados: " + aprobadosHombres);
        System.out.println("Aprobadas: " + aprobadas);
    }
}