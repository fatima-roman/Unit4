package boletin1;

public class Persona {

	String DNI; 
	String nombre; 
	String apellidos; 
	int edad; 
	
	public Persona(String nombre) {
		this.nombre = nombre; 
		this.apellidos = "apll1";
		this.DNI = "111";
		this.edad = 15; 
	}
	
	public Persona(int edad) {
		this.nombre = "Nombre"; 
		this.apellidos = "apll2";
		this.DNI = null;
		this.edad = edad; 
	}
}
