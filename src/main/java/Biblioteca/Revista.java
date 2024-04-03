package Biblioteca;

import java.util.ArrayList;

public class Revista {

    public static ArrayList<Revista> revistas = new ArrayList<>();
    private String nombre;
    private int volumen;
    private String tematica;

    // Constructor privado para evitar instanciación externa
    private Revista(String nombre, int volumen, String tematica) {
        this.nombre = nombre;
        this.volumen = volumen;
        this.tematica = tematica;
    }

    // Método estático para obtener la instancia única de Revista
    public static Revista getRevista(String nombre, int volumen, String tematica) {
        Revista nuevaRevista = new Revista(nombre, volumen, tematica);
        revistas.add(nuevaRevista);
        return nuevaRevista;
    }
    
    public static void  buscarRevista(String nombre) {
        boolean encontrada = false;
        for (Revista revista : revistas) {
            if (revista.nombre.equalsIgnoreCase(nombre)) {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println("La revista se encuentra.");
        } else {
            System.out.println("La revista no se encuentra.");
        }
    }

    public ArrayList<Revista> getRevistas() {
        return revistas;
    }

    public void setRevistas(ArrayList<Revista> revistas) {
        this.revistas = revistas;
    }
}
