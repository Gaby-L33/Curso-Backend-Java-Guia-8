/*
Crea una lista de Libros y muestra el título de cada uno con un bucle.
 */
package lista_libros;

import entidades.Libro;
import java.util.ArrayList;

public class Lista_libros {

    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList();
        Libro libro = new Libro("El señor de los anillos");
        Libro libro2 = new Libro("La torre");
        Libro libro3 = new Libro ("Harry Potter");
        libros.add(libro);
        libros.add(libro2);
        libros.add(libro3);
        
        for (Libro ejemplar : libros) {
            System.out.println(ejemplar);
        }
    }
    
}
