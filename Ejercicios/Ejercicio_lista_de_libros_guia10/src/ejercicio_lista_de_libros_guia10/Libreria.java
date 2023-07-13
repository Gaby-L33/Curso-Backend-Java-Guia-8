package ejercicio_lista_de_libros_guia10;

public class Libreria {
    
    private String titulo;

    public Libreria() {
    }

    public Libreria(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "titulo = " + titulo;
    }
    
    
}
