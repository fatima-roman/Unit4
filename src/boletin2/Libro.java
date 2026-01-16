package boletin2;

public class Libro {
	private String titulo;
	private String autor;
	private String genero;
	private int ejemplares; 
	private int prestados;
	
	//Constructores
		public Libro(String titulo, String autor) {
			
		}
		
		public Libro(String titulo, String autor, int ejemplares, int prestados) {
			
		}
		
		public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
			
		}
		
	//Getters
		public String getTitulo() {
			return titulo; 
		}
		public String getAutor() {
			return autor; 
		}
		public String getGenero() {
			return genero; 
		}
		public int getEjemplares() {
			return ejemplares; 
		}
		public int getPrestados() {
			return prestados; 
		}
}
