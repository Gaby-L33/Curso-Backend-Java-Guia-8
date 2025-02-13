//         * En el servicio deberemos tener un bucle que crea un objeto Pelicula
//         * pidiéndole al usuario todos sus datos y
//         * guardándolos en el objeto Pelicula.
//         * 
//         * Después, esa Pelicula se guarda una lista de Peliculas y
//         * se le pregunta al usuario si quiere crear
//         * otra Pelicula o no.
//         * 
//         * Después de ese bucle realizaremos las siguientes acciones:
//         *
//         * • Mostrar en pantalla todas las películas. 
//         * • Mostrar en pantalla todas las películas con una
//         * duración mayor a 1 hora. 
//         * • Ordenar las películas de acuerdo a su duración (de mayor a menor)
//         * y mostrarlo en pantalla. 
//         * • Ordenar las películas de acuerdo a su duración
//         * (de menor a mayor) y mostrarlo en pantalla. 
//         * • Ordenar las películas por título, alfabéticamente
//         * y mostrarlo en pantalla. 
//         * • Ordenar las películas por director, alfabéticamente y mostrarlo
//         * en pantalla.

package serviciopelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import pelicula.Pelicula;
import java.util.Comparator;

public class ServicioPelicula {
    
Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> listaPeli = new ArrayList<>();

    public void agregarPelicula() {
        String resp;
        do {
            Pelicula Peli = new Pelicula();

            System.out.println("Ingrese el nombre de la Pelicula : ");
            Peli.setTitulo(leer.nextLine());
            System.out.println("Ingrese el director de la Pelicula " + Peli.getTitulo() + " : ");
            Peli.setDirector(leer.nextLine());
            System.out.println("Ingrese (solo) las Horas de duracion : ");
            Peli.setHoras(leer.nextInt());
            listaPeli.add(Peli);

            System.out.println("Desea Ingresar Otra Pelicula ? S/N : ");
            leer.nextLine(); // Para arreglar que no leia el leer next de resp.
            resp = leer.nextLine();

        } while ("S".equals(resp.toUpperCase()));
    }

    public void mostrarPeliculas() {
        /**
         * Mostrar en pantalla todas las películas.
         */
        System.out.println("---LISTA DE PELICULAS---");
        agregarPelicula();
        listaPeli.forEach((pelicula) -> {
            System.out.println(pelicula);
        });
        
        System.out.println("");
    }

    public void mostrarPeliculasLargas() {
        /**
         * Mostrar en pantalla todas las películas con una duración mayor a 1
         * hora.
         */
        System.out.println("---PELICULAS DE MAYOR DURACION---");
        listaPeli.stream().filter((pelicula) -> (pelicula.getHoras() > 1)).forEachOrdered((pelicula) -> {
            System.out.println(pelicula);
        });
        
        System.out.println("");
    }

    public void ordenarMayorPeliculas() {
        /**
         * Ordenar las películas de acuerdo a su duración (de mayor a menor) y
         * mostrarlo en pantalla.
         */
        Comparator<Pelicula> comp = (Pelicula p1, Pelicula p2) -> p2.getHoras() - p1.getHoras();
        Collections.sort(listaPeli, comp);
        System.out.println("Lista de películas ordenadas de mayor a menor duración:");
        listaPeli.forEach((Peli) -> {
            System.out.println(Peli.getTitulo() + " - " + Peli.getHoras() + " horas");
        });
    }

    public void ordenarMenorPeliculas() {
        /**
         * Ordenar las películas de acuerdo a su duración (de menor a mayor) y
         * mostrarlo en pantalla.
         */
        Comparator<Pelicula> comp = (Pelicula p1, Pelicula p2) -> p1.getHoras() - p2.getHoras();
        Collections.sort(listaPeli, comp);
        System.out.println("Lista de películas ordenadas de menor a mayor duración:");
        listaPeli.forEach((Peli) -> {
            System.out.println(Peli.getTitulo() + " - " + Peli.getHoras() + " horas");
        });
        
        System.out.println("");
    }

    public void ordenarTituloPeliculas() {
        /**
         * Ordenar las películas por título, alfabéticamente y mostrarlo en
         * pantalla.
         */
        Comparator<Pelicula> comp = new Comparator<Pelicula>() {
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        };
        Collections.sort(listaPeli, comp);
        System.out.println("---PELICULAS ORDENADAS POR TITULO---");
        for (Pelicula Peli : listaPeli) {
            System.out.println("Titulo : " + Peli.getTitulo() + " Director : " + Peli.getDirector() + " - " + Peli.getHoras() + " horas");
        }
        
        System.out.println("");
    }

    public void ordenarDirectorPeliculas() {
        /**
         * Ordenar las películas por director, alfabéticamente y mostrarlo en
         * pantalla.
         */
        Comparator<Pelicula> comp = new Comparator<Pelicula>() {
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareTo(p2.getDirector());
            }
        };
        Collections.sort(listaPeli, comp);
        System.out.println("---PELICULAS ORDENADAS POR DIRECTOR---");
        for (Pelicula Peli : listaPeli) {
            System.out.println("Director : " + Peli.getDirector() + " Titulo : " + Peli.getTitulo() + " - " + Peli.getHoras() + " horas");
        }
    }
}
