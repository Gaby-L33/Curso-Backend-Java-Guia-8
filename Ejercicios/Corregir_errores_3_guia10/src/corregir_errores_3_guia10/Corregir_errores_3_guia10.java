package corregir_errores_3_guia10;

import java.util.ArrayList;
import java.util.Iterator;

public class Corregir_errores_3_guia10 {

    public static void main(String[] args) {
        ArrayList<String> bebidas = new ArrayList();
        bebidas.add("café");
        bebidas.add("té");
        Iterator<String> it = bebidas.iterator();
        while (it.hasNext()) {
            if (it.next().equals("café")) {
                it.remove();
            }
        }

    }
}
