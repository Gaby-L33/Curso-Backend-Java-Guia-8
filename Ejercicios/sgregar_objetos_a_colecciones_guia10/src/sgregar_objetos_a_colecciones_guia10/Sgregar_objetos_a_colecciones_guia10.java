package sgregar_objetos_a_colecciones_guia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sgregar_objetos_a_colecciones_guia10 {

    /**
     * Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
     * Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
       cada forma que aprendiste arriba.
     * 
     */
    public static void main(String[] args) {
        //LISTAS:
        ArrayList<Integer> numerosA = new ArrayList();
        numerosA.add(20);
        numerosA.add(25);
        numerosA.add(10);
        numerosA.add(5);
        numerosA.add(15);
        
        System.out.println("----------------LISTAS-----------------");
        
        for (Integer lista1:numerosA) {
            System.out.println(lista1);
        }
        
        numerosA.remove(0);
        System.out.println("Se elimino el objeto en el indice 0");
        
         for (Integer lista2:numerosA) {
            System.out.println(lista2);
        }
                   
        //CONJUNTOS:
        HashSet<Integer> numerosB = new HashSet();
        numerosB.add(10);
        numerosB.add(20);
        numerosB.add(30);
        numerosB.add(40);
        numerosB.add(50);
        
        System.out.println("---------------CONJUNTOS---------------");
        
        for (Integer conjunto1:numerosB) {
            System.out.println(conjunto1);
        }
        
        numerosB.remove(30); //Se elimina un objeto del conjunto
        System.out.println("Se elimina el objeto 30");
        
        for (Integer conjunto2:numerosB) {
            System.out.println();
            
        }
        
        //MAPAS:
        HashMap<Integer, String> alumnos = new HashMap();
        alumnos.put(34566789, "Pepe");
        alumnos.put(34566790, "Lewicki");
        alumnos.put(34566791, "Bravo");
        alumnos.put(34566792, "Lewicki");
        alumnos.put(34566793, "Luna");
        
        System.out.println("--------------MAPAS-------------------");
        
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("Documento: " + entry.getKey()
            + ", nombre: " + entry.getValue());
        }
        
        alumnos.remove(34566789);
    }
    
}
