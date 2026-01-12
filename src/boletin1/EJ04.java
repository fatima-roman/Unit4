package boletin1;

import java.util.Random;

public class EJ04 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		Articulo articulo1 = new Articulo();
		articulo1.nombre = "Pijama";
		articulo1.precio = 2; 
		
		System.out.println(articulo1.nombre +": "
				+ "\nPrecio: " + articulo1.precio
				+ "\nIVA: " + articulo1.iva*100
				+ "\nPVP: " + (articulo1.precio*articulo1.iva)
				+ "\nStock: " + articulo1.cuantosQuedan);
		
		//Articulo 1 modificado
		articulo1.precio = rand.nextDouble(1,11); 
		Math.round(articulo1.precio);
		System.out.println(articulo1.nombre +": "
				+ "\nPrecio: " + articulo1.precio
				+ "\nIVA: " + articulo1.iva*100
				+ "\nPVP: " + (articulo1.precio*articulo1.iva)
				+ "\nStock: " + articulo1.cuantosQuedan);
		
	}

}
