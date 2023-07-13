package ejercicio_lista_de_libros_guia10;

import java.util.ArrayList;

public class Ejercicio_lista_de_libros_guia10 {

    /**
     * Crea una lista de Libros y muestra el título de cada uno con un bucle.
     */
    public static void main(String[] args) {
        ArrayList<Libreria> libros = new ArrayList();
        
        Libreria libro1 = new Libreria ("El dragon");
        libros.add(libro1);
        Libreria libro2 = new Libreria ("La princesa");
         libros.add(libro2);
        Libreria libro3 = new Libreria ("El caballero");
         libros.add(libro3);
        
        for (Libreria ejemplar : libros) {
            System.out.println(ejemplar);
        }
        
        
    }
    
}
