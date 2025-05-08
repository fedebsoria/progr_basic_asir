/*
 * Práctica Clase con Dos Constructores II
 * 
 * Alumno: Federico B. Soria
 * 
 */
import java.util.Random;
import java.util.Scanner;

public class tareaConstructoresIIpassword {
    public static class Password{
        int len;
        String contrasena;

        //Constructor inicializar Password
        public Password(int len, String contrasena){
            this.len = len;
            this.contrasena = contrasena;
        }

        //Constructor incializar atributos con valor por defecto
        public Password(){
            this.len = 8;
            this.contrasena = "admin123";
        }

        //Regresar true si la contraseña tiene +2 mayus, +1min y +5 num
        public boolean esFuerte(){
            int mayusc = 0;
            int minusc = 0;
            int numers = 0;

            for(int i = 0; i < this.contrasena.length(); i++){
                char c = this.contrasena.charAt(i);
                if(Character.isUpperCase(c)){
                    mayusc++;
                } else if (Character.isLowerCase(c)){
                    minusc++;
                } else if (Character.isDigit(c)){
                    numers++;
                }
            }

            return (mayusc > 2 && minusc > 1 && numers > 5);
        }

        //Crear contraseña con el this.len pasado
        public String generarPassword(){
            Random random = new Random();
            String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            int len = this.len;
            StringBuilder passwordGenerado = new StringBuilder(len);

            for (int i = 0; i < len; i++){
                int indice = random.nextInt(CARACTERES.length());
                passwordGenerado.append(CARACTERES.charAt(indice));
            }

            this.contrasena = passwordGenerado.toString();

            return this.contrasena;
        }
        
        //metodo get
        public void getPassword (){
            System.out.println(this.len);
            System.out.println(this.contrasena);
        }

        //metodo set longitud
        public void setLongitud(int len){
            this.len = len;
        }
    }

    public static class ejecPassword{
        public static void main(String[] args) {
            Password password = new Password();
            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese la longitud del array que desea: ");
            int len = sc.nextInt();

            String[] passwordArray = new String[len];
            boolean[] booleanArray = new boolean[len];

            for (int i= 0; i < len; i++){
                passwordArray[i] = password.generarPassword();
                booleanArray[i] = password.esFuerte();
                System.out.println(passwordArray[i] +" "+ booleanArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        //Test Funciones clase password
        Password test00 = new Password();
        test00.setLongitud(30);
        test00.generarPassword();
        test00.getPassword();
        
        System.out.println(test00.esFuerte());

        System.out.println();

        //Test clase ejecPassword
        ejecPassword.main(null);
    }
}
