package boletin2;

public class Alumno {

	private String nombre; 
	private double notaMedia; 
	
	//Constructor 
	public Alumno (String nombre, double notaMedia) {
		this.nombre = nombre; 
		this.notaMedia = notaMedia; 
	}
	
	//Getters 
	public String getNombre() {
		return nombre; 
	}
	
	public double notaMedia() {
		return notaMedia;
	}
	
	//Setters 
	public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido");
        }
    }
	
	public void setNotaMedia(double notaMedia) {
		if (notaMedia<0) {
			System.out.println("Nota Media inválida ");
		}else {
			this.notaMedia = notaMedia; 
		}
	}
	
	//ToString 
	public String toString () {
		return nombre + " " + String.format("%.2f", notaMedia);
	}
	
}
