package boletin1;

import java.util.Random;

public class EJ04 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		Articulo articulo1 = new Articulo("Pijama", 20.5, rand.nextInt(1,21));

		Math.round(articulo1.precio);
		System.out.println(articulo1.nombre +": "
				+ "\nPrecio: " + articulo1.precio
				+ "\nIVA: " + articulo1.iva*100
				+ "\nPVP: " + (articulo1.precio+(articulo1.precio*articulo1.iva))
				+ "\nStock: " + articulo1.cuantosQuedan);
		
		System.out.println();
		
		
		//Articulo 1 modificado
		articulo1.precio += (int)rand.nextDouble(1,11); 
		Math.round(articulo1.precio);
		System.out.println(articulo1.nombre +": "
				+ "\nPrecio: " + articulo1.precio
				+ "\nIVA: " + articulo1.iva*100
				+ "\nPVP: " + (articulo1.precio+(articulo1.precio*articulo1.iva))
				+ "\nStock: " + articulo1.cuantosQuedan);
		
	}

}
