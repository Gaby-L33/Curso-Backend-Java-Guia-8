package entidad;

public class Libro {

    private String titulo;
    private String autor;
    private int numeroDeEjemplares;
    private int NumeroDeEjemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroDeEjemplares, int NumeroDeEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDeEjemplares = numeroDeEjemplares;
        this.NumeroDeEjemplaresPrestados = NumeroDeEjemplaresPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDeEjemplares() {
        return numeroDeEjemplares;
    }

    public void setNumeroDeEjemplares(int numeroDeEjemplares) {
        this.numeroDeEjemplares = numeroDeEjemplares;
    }

    public int getNumeroDeEjemplaresPrestados() {
        return NumeroDeEjemplaresPrestados;
    }

    public void setNumeroDeEjemplaresPrestados(int NumeroDeEjemplaresPrestados) {
        this.NumeroDeEjemplaresPrestados = NumeroDeEjemplaresPrestados;
    }

    @Override
    public String toString() {
        return "Libro{"
                + "titulo=" + titulo
                + ", autor=" + autor
                + ", numeroDeEjemplares=" + numeroDeEjemplares
                + ", NumeroDeEjemplaresPrestados=" + NumeroDeEjemplaresPrestados + '}';
    }

}
