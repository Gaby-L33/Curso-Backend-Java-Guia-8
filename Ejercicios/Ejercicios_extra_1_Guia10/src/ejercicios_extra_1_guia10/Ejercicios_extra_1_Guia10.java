package ejercicios_extra_1_guia10;

import servicionumeros.ServicioNumeros;

public class Ejercicios_extra_1_Guia10 {

    /**
     * Diseñar un programa que lea una serie de valores numéricos enteros desde
     * el teclado y los guarde en un ArrayList de tipo Integer. La lectura de
     * números termina cuando se introduzca el valor -99. Este valor no se
     * guarda en el ArrayList. A continuación, el programa mostrará por pantalla
     * el número de valores que se han leído, su suma y su media (promedio).
     */
    public static void main(String[] args) {
        ServicioNumeros service = new ServicioNumeros();
        service.agregarNumero();
        service.mostrarNumeros();
        service.mostrarSuma();
        service.mostrarMedia();
    }

}
