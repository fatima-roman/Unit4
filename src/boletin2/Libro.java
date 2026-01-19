package boletin2;

public class Libro {

    private String titulo;
    private String autor;
    private Genero genero;
    private int ejemplares;
    private int prestados;

    // ENUM
    public enum Genero {
        NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
    }

    // CONSTRUCTORES
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = 0;
        this.prestados = 0;
        this.genero = Genero.NARRATIVO;
    }

    public Libro(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
        this.genero = Genero.NARRATIVO;
    }

    public Libro(String titulo, String autor, int ejemplares, int prestados, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
        this.genero = genero;
    }

    // GETTERS
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    // SETTERS
    public void setTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            this.titulo = titulo;
        }
    }

    public void setAutor(String autor) {
        if (autor != null && !autor.isEmpty()) {
            this.autor = autor;
        }
    }

    public void setGenero(Genero genero) {
        if (genero != null) {
            this.genero = genero;
        }
    }

    public void setEjemplares(int ejemplares) {
        if (ejemplares >= 0) {
            this.ejemplares = ejemplares;
        }
    }

    public void setPrestados(int prestados) {
        if (prestados >= 0) {
            this.prestados = prestados;
        }
    }

    // préstamo
    public boolean prestamo() {
        if (ejemplares - prestados > 0) {
            prestados++;
            return true;
        }
        return false;
    }

    // devolución
    public boolean devolucion() {
        if (prestados > 0) {
            prestados--;
            return true;
        }
        return false;
    }

    // toString
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero=" + genero +
                ", ejemplares=" + ejemplares +
                ", prestados=" + prestados +
                '}';
    }

    // equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Libro)) return false;

        Libro otro = (Libro) obj;
        return titulo.equalsIgnoreCase(otro.titulo)
                && autor.equalsIgnoreCase(otro.autor);
    }
}
