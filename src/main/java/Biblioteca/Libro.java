package Biblioteca;

import java.util.ArrayList;

public class Libro {
    
   public static ArrayList<Libro> libros = new ArrayList<>();     

    private String titulo ;
    private int paginas ;
    private String genero ;

    public Libro(String titulo,  int paginas, String genero) {
        this.titulo = titulo;
      
        this.paginas = paginas;
        this.genero = genero;
    }
    
    public static Libro getLibro(String titulo, int volumen, int paginas, String genero) {
        Libro nuevoLibro = new Libro(titulo, paginas, genero);
        libros.add(nuevoLibro);
        return nuevoLibro;
    }
    
    public static void buscarLibro(String titulo) {
        boolean encontrada = false;
        for (Libro libro : libros) {
            if (libro.titulo.equalsIgnoreCase(titulo)) {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println("El libro se encuentra.\n");
        } else {
            System.out.println("El libro no se encuentra.\n");
        }
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
}
