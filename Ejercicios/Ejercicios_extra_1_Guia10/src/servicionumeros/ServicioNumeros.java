package servicionumeros;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioNumeros {
    
     Scanner leer = new Scanner(System.in);
    ArrayList<Integer> listaNumeros = new ArrayList();

    public void agregarNumero() {
        System.out.println("Ingrese una lista de numeros(-99 para terminar)");
        int numero = leer.nextInt();
        while (numero != -99) {
            listaNumeros.add(numero);
            numero = leer.nextInt();
        }
    }

    public void mostrarNumeros() {
        System.out.println("La lista de numeros es: " + listaNumeros);
    }

    public void mostrarSuma() {
        int suma = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            suma += listaNumeros.get(i);
        }
        System.out.println("La suma de los numeros es: " + suma);
    }

    public void mostrarMedia() {
        int suma = 0;
        for (int i = 0; i < listaNumeros.size(); i++) {
            suma += listaNumeros.get(i);
        }
        System.out.println("La media de los numeros es: " + suma / listaNumeros.size());
    }
}
