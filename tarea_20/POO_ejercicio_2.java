/*
2. Nos piden hacer un programa orientado a objetos sobre un cine (solo de una sala) tiene un
conjunto de asientos (8 filas por 9 columnas, por ejemplo).
• Del cine nos interesa conocer la película que se está reproduciendo y el precio de la
entrada en
• el cine.
• De las películas nos interesa saber el título, duración, edad mínima y director.
• Del espectador, nos interesa saber su nombre, edad y el dinero que tiene.
• Los asientos son etiquetados por una letra (columna) y un número (fila), la fila 1
empieza al
• final de la matriz como se muestra en la tabla. También deberemos saber si está
ocupado o no
• el asiento.
*/

import java.util.List;

//Se crea la clase película

public class Pelicula {
    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;
    
    public Pelicula(String titulo, int duracion,  int edadMinima, 
            String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
    }
    
    //Getters y setters
}

//Se crea la clase espectador

public class Espectador {
    private String nombre;
    private int edad;
    private double dinero;
    
    public Espectador(String nombre, int edad, double dinero){
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }
    
    //Getters y setters
}

public class Asiento {
    private char columna;
    private int fila;
    private boolean ocupado;
    
    public Asiento(char columna, int fila){
        this.columna = columna;
        this.fila = fila;
        this.ocupado = false;
    }
}

//se crea la clase cine
public class Cine {
    private Pelicula pelicula;
    private double precioEntrada;
    private Asiento[][] asientos;

    public Cine(Pelicula pelicula, double precioEntrada) {
        this.pelicula = pelicula;
        this.precioEntrada = precioEntrada;
        this.asientos = new Asiento[8][9];
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = new Asiento((char) ('A' + j), 8 - i);
            }
        }
    }

    public boolean venderEntrada(Espectador espectador) {
        if (espectador.getDinero() < precioEntrada || espectador.getEdad() < pelicula.getEdadMinima()) {
            return false;
        }

        for (Asiento[] fila : asientos) {
            for (Asiento asiento : fila) {
                if (!asiento.isOcupado()) {
                    asiento.setOcupado(true);
                    return true;
                }
            }
        }
        return false;
    }

    // Getters y setters
}