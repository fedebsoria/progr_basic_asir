/*
* 5.Diseñar un array con las calificaciones de 6 asignaturas de un alumno 
* que se piden por pantalla. Se debe calcular su nota media final.
* Si la media>=5, la calificación es aprobado
* Si la media<5, la calificación es suspenso
* Si la media>5 y <=6.5 la calificación es bien
* Si la media >6.5 y <=8.5 la calificación es notable
* Si la media >8.5 y >=9 la calificación es sobresaliente
*/

import java.util.Scanner;

public class arrays5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int notasLen = 6;
        int[] notas = new int [notasLen];
        int totalNotas = 0;
        int media;
        
        for(int i = 0; i < notasLen; i++){
            System.out.println("Inserte notas: ");
            notas[i] = sc.nextInt();
        }
        
        for(int n = 0; n <= notasLen -1; n++){
            totalNotas += notas[n];
        }
        
        media = totalNotas / notasLen;
        
        System.out.println("Calificación: ");
        
        if (media > 8.5 && media >= 9){
            System.out.println("sobresaliente");
        } else if (media > 6.5 && media <= 8.5){
            System.out.println("notable");
        } else if (media > 5 && media <= 6.5) {
            System.out.println("bien");
        } else if (media >= 5 ) {
            System.out.println("aprobado");
        } else if (media < 5){
            System.out.println("suspenso");
        }
    }
}