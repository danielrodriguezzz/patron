package PatronSingleton;

import Biblioteca.Libro;
import static Biblioteca.Libro.libros;
import Biblioteca.Revista;
import java.util.ArrayList;
import java.util.Scanner;

public class PatronSingleton {

    public static ArrayList<Revista> revistas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("Bienvenido a la biblioteca, seleccione una de las opciones: \n"
                    + "1. Agregar una nueva revista \n"
                    + "2. Encontrar una revista \n"
                    + "3. Agregar un nuevo Libro\n"
                    + "4. Encontrar un libro \n"
                    + "5. salir ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Ingrese el nombre de la revista:");
                    String nombre = sc.next();
                    System.out.println("Ingrese el volumen de la revista:");
                    int volumen = sc.nextInt();
                    System.out.println("Ingrese la temática de la revista:");
                    String tematica = sc.next();
                    Revista nuevaRevista = Revista.getRevista(nombre, volumen, tematica);
                    revistas.add(nuevaRevista);
                    break;

                case 2:

                    System.out.println("ingrese el nombre de la revista que desea buscar ");
                    nombre = sc.next();
                    Revista.buscarRevista(nombre);
                    break;

                case 3:
                    System.out.println("Ingrese el nombre del libro:");
                    String titulo = sc.next();
                    System.out.println("Ingrese el volumen del libro:");
                    int paginas = sc.nextInt();
                    System.out.println("Ingrese las paginas del libro:");
                    String genero = sc.next();
                    Libro nuevoLibro = new Libro(titulo, paginas, genero);
                    libros.add(nuevoLibro);
                    break;

                case 4:
                    System.out.println("ingrese el titulo del libro que desea buscar:\n ");
                    titulo = sc.next();
                    Libro.buscarLibro(titulo);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

        } while (opcion != 5);
    }
}
