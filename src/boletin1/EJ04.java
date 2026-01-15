package boletin1;

import java.util.Random;

public class EJ04 {

    public static void main(String[] args) {
        Random rand = new Random();

        // Crear un artículo
        Articulo articulo1 = new Articulo("Pijama", 20.5, rand.nextInt(1, 21));

        System.out.println("Artículo inicial:");
        articulo1.mostrar();

        System.out.println("\nModificando artículo...");

        // Modificar valores usando setters
        articulo1.setPrecio(articulo1.getPrecio() + rand.nextInt(1, 11)); // añadir valor aleatorio
        articulo1.setCuantosQuedan(articulo1.getCuantosQuedan() - 2); // ejemplo de stock reducido

        // Intentar valores erróneos
        articulo1.setPrecio(-10);   // no debería cambiar
        articulo1.setCuantosQuedan(-5); // no debería cambiar
        articulo1.setNombre("");    // no debería cambiar
        articulo1.setIva(1.5);     // no debería cambiar

        System.out.println("\nDespués de modificaciones:");
        articulo1.mostrar();

        // Crear otro artículo con datos erróneos
        Articulo articulo2 = new Articulo("", -5, -10);
        System.out.println("\nArtículo 2 (datos erróneos iniciales):");
        articulo2.mostrar();
    }
}

