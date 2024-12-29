/*
DETECCIÓN DE ERRORES
 */
package detección.de.errores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class DETECCIÓNDEERRORES {

    public static void main(String[] args) {
        //LISTAS:
        /*
        Se implementa como un arreglo de tamaño variable.
        */
        ArrayList<Integer> listado = new ArrayList(); 
        /*
        Permite moverse hacia delante y hacia atrás.
        */
        LinkedList<Integer> listado2 = new LinkedList();
        int x = 20;
        int q = 15;
        listado.add(x);
        listado.add(q);
        listado.remove(0); //Este método remueve un elemento de un índice especifico
        listado.remove(15); //Este método remueve la primera aparición de un elemento a borrar en una lista

        //CONJUNTOS
        /*
        Se implementa utilizando una tabla hash para darle un valor 
        único a cada elemento y de esa manera evitar los duplicados.
        */
        HashSet<Integer> conjuntos = new HashSet();
        /*
        El TreeSet mantiene todos sus elementos
        de manera ordenada (forma ascendente)
        */
        TreeSet<String> conjuntos2 = new TreeSet();
        /*
        Está entre HashSet y TreeSet
        */
        LinkedHashSet<Integer> conjuntos3 = new LinkedHashSet(); 
        Integer y = 20;
        Integer z = 21;
        conjuntos.add(y);
        conjuntos.add(z);
        conjuntos.remove(y); //Ya que los conjuntos no constan de índices, solo se puede borrar por elemento.

        //MAPAS
        /*
        Las llaves se almacenan utilizando un
        algoritmo de hash solo para las llaves y evitar que se repitan.
        */
        HashMap<Integer, String> personas = new HashMap(); 
        /*
        Es un mapa que ordena los elementos de manera ascendente a través de las llaves.
        */
        TreeMap<Integer, String> personas2 = new TreeMap();
        /*
        Es un HashMap que conserva el orden de inserción.
        */
        LinkedHashMap<Integer, String> personas3 = new LinkedHashMap();
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        personas.put(dni, nombreAlumno);
        personas.put(44667037, "Gabriel");
        personas.remove(dni); //En los mapas solo podemos remover un elemento por su llave.
        

    }

}
