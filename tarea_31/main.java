/*
 * Tarea Herencia I
 * Alumno: Federico B.  Soria
 */

public class main {
    public static void main(String[] args) {
        //Crear objeto clase estudiante y llamar sus metodos
        Estudiante estudiante_equipo7 = new Estudiante();

        //Crear objeto clase Profesor
        Profesor profesor_equipo7 = new Profesor();

        System.out.println("Estudiante: ");
        //Llamar metodos clase estudiante
        estudiante_equipo7.setNombre("Naruto Uzumaki");
        estudiante_equipo7.setEdad(12);
        estudiante_equipo7.setLegajo(012607);
        estudiante_equipo7.setCarrera("Shinobi");

        System.out.println("Nombre: " + estudiante_equipo7.getNombre());
        System.out.println("Edad: " + estudiante_equipo7.getEdad());
        System.out.println("Legajo: " + estudiante_equipo7.getLegajo());
        System.out.println("Carrera: " + estudiante_equipo7.getCarrera());
        System.out.println();
        
        //Llamar metodos clase Profesor
        System.out.println("Profesor");
        profesor_equipo7.setNombre("Naruto Uzumaki");
        profesor_equipo7.setEdad(26);
        profesor_equipo7.setCargo("Joonin");
        profesor_equipo7.setMateria("Sharingan 101");
        System.out.println("Nombre: " +profesor_equipo7.getNombre());
        System.out.println("Edad: " +profesor_equipo7.getEdad());
        System.out.println("Cargo: " + profesor_equipo7.getCargo());
        System.out.println("Materia: " + profesor_equipo7.getMateria());
    }
}
