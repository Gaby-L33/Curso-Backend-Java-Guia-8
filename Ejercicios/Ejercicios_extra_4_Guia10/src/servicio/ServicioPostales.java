package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioPostales {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public void cargarCodigos(HashMap<Integer, String> codPostales) {
        System.out.println("Ingrese 3 ciudades con sus codigos postales:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese Cod Postal, luego la ciudad.");
            int cod = leer.nextInt();
//            leer.next();
            String ciudad = leer.next();
            codPostales.put(cod, ciudad);
        }


    }

    public void cargarUnCodigo(HashMap<Integer, String> codPostales) {
        System.out.println("Ingrese una ciudad con su codigo postal:");
        System.out.println("Ingrese Cod Postal, luego la ciudad.");
        int cod = leer.nextInt();

        String ciudad = leer.next();
        codPostales.put(cod, ciudad);


    }

    public void mostrarCodigos(HashMap<Integer, String> codPostales) {
        for (Map.Entry<Integer, String> cod : codPostales.entrySet()) {
            System.out.println(cod.getValue() + " " + cod.getKey());
            System.out.println("------------------------------------");
        }

    }


    public void buscarCodigo(HashMap<Integer, String> codPostales) {
        System.out.println("Ingrese un codigo postal:");
        int codi = leer.nextInt();
        if (codPostales.containsKey(codi)) {
            System.out.println("La ciudad es: " + codPostales.get(codi));
        } else {
            System.out.println("Codigo no encontrado.");
        }
    }

    public void eliminarCodigos(HashMap<Integer, String> codPostales) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un codigo postal a elimar:");
            int cod = leer.nextInt();
            if (codPostales.containsKey(cod)) {
                codPostales.remove(cod);
                System.out.println("Se elimino la ciudad.");
            } else {
                System.out.println("Ciudad no encontrada.");
            }

        }
    }
}
