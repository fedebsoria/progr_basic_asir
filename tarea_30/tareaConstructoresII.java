/*
 * Práctica Clase con Dos Constructores II
 * 
 * Alumno: Federico B. Soria
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class tareaConstructoresII{
    public static class Persona {
        String nombre;
        int edad;
        String DNI;
        char sexo;
        double peso;
        double altura;

        //Constructor: inicializar atributos clase persona
        public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura){
            this.nombre = nombre;
            this.edad = edad;
            this.DNI = DNI;
            this.sexo = sexo;
            this.peso = peso;
            this.altura = altura;
        }

        //Constructor: inicializar atributos y establecer valores predeterminados
        public Persona(){
            this.nombre = "Armin";
            this.edad = 22;
            this.DNI = generaDNI();
            this.sexo = comprobarSexo('H');
            this.peso = 2200.0;
            this.altura = 60.0;
        }

        //Metodo: calcular IMC
        public int calcularIMC(){
            final int PESO_BAJO = -1;
            final int PESO_IDEAL = 0;
            final int SOBREPESO = 1;
            double peso_persona = 0;

            peso_persona = this.peso / Math.pow(this.altura, 2);
            if (peso_persona < 20){
                return PESO_BAJO;
            } else if (peso_persona >= 20 && peso_persona <= 25){
                return PESO_IDEAL;
            } else {
                return SOBREPESO;
            }
        }

        //Metodo: comprobar mayoria de edad
        public boolean esMayoreDeEdad(){
            return this.edad >= 18;
        }

        //Comprobar si el sexo es correcto (H o M)
        private char comprobarSexo(char sexo){
            if (sexo != 'H' || sexo != 'M'){
                sexo = 'H';
            }
            return sexo;
        }

        //Devolver toda la info
        @Override //Usado para sobreescribir el método toString de Object
        public String toString() {
            return "Persona: " +
                "nombre: '" + nombre + '\'' +
                ", edad: " + edad +
                ", DNI: '" + DNI + '\'' +
                ", sexo: " + sexo +
                ", peso: " + peso +
                ", altura: " + altura;
        }

        //Generar un DNI aleatorio
        private String generaDNI(){
            Random random = new Random();
            int numero = 10000000 + random.nextInt(90000000); // Generar num random  de 8 digitos
            char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            char letra = letrasDNI[numero % 23]; // Calcular la letra correspondiente al número del DNI
            String dni = numero + String.valueOf(letra); // Combinar num y char en una String
            return dni;
        }
        // Métodos set de cada parámetro, excepto de DNI
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setSexo(char sexo) {
            this.sexo = comprobarSexo(sexo);
        }

        public void setPeso(double peso) {
            this.peso = peso;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
    }

    public static class crearPersona {
        public static Persona main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Crear la instancia Persona
            Persona persona = new Persona();

            // Pedir input al usuario
            System.out.println("Ingrese el nombre (presione Enter para valor por defecto): ");
            String nombre = scanner.nextLine();
            if (!nombre.isEmpty()) {
                persona.setNombre(nombre);
            }

            System.out.println("Ingrese la edad (presione Enter para valor por defecto): ");
            String edadInput = scanner.nextLine();
            if (!edadInput.isEmpty()) {
                persona.setEdad(Integer.parseInt(edadInput));
            }

            System.out.println("Ingrese el sexo (H/M) (presione Enter para valor por defecto): ");
            String sexoInput = scanner.nextLine();
            if (!sexoInput.isEmpty()) {
                persona.setSexo(sexoInput.charAt(0));
            }

            System.out.println("Ingrese el peso (kg) (presione Enter para valor por defecto): ");
            String pesoInput = scanner.nextLine();
            if (!pesoInput.isEmpty()) {
                persona.setPeso(Double.parseDouble(pesoInput));
            }

            System.out.println("Ingrese la altura (m) (presione Enter para valor por defecto): ");
            String alturaInput = scanner.nextLine();
            if (!alturaInput.isEmpty()) {
                persona.setAltura(Double.parseDouble(alturaInput));
            }

            // Llamar calcularIMC() y esMayoreDeEdad()
            int imc = persona.calcularIMC();
            boolean esMayorDeEdad = persona.esMayoreDeEdad();

            // Mostrar toda la data
            System.out.println("\nInformación de la persona:");
            System.out.println(persona.toString());
            System.out.println("IMC: " + imc);
            System.out.println("Es mayor de edad: " + esMayorDeEdad);
            
            return persona;
        }
    }
    
    public static void main(String[] args){
        //Crear persona1 y pedir valores por pantalla
        Persona persona1 = crearPersona.main(null);
        System.out.println("---------------");

        //Crear persona2 y setear los valores menos peso y altura
        Persona persona2 = new Persona();
        persona2.setNombre("Manuel");
        persona2.setEdad(33);
        persona2.setSexo('H');
        System.out.println(persona2.toString());
        System.out.println("IMC: " + persona2.calcularIMC());
        System.out.println("Es mayor de edad: " + persona2.esMayoreDeEdad());
        System.out.println("---------------");
        
        //Crear persona3 con valores por defecto
        Persona persona3 = new Persona();
        System.out.println(persona3.toString());
        System.out.println("IMC: " + persona3.calcularIMC());
        System.out.println("Es mayor de edad: " +persona3.esMayoreDeEdad());
        System.out.println("---------------");
    }
}
