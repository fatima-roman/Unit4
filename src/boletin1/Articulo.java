package boletin1;

import java.util.Random;

public class Articulo {
	Random rand = new Random();
	
	String nombre; 
	double precio; 
	double iva = 0.21;
	int cuantosQuedan = rand.nextInt(1,21);
	
}
