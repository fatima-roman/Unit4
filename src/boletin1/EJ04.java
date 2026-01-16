package boletin1;

import java.util.Random;

public class EJ04 {

    public static void main(String[] args) {
        Random rand = new Random();

        // Crear un artículo
        Articulo articulo1 = new Articulo("Pijama", 20.5, rand.nextInt(1, 21));

        System.out.println("Artículo inicial:");
        System.out.println(articulo1); 
        // intenta vender (solo devuelve boolean)
        System.out.println(articulo1.vender()?"Venta exitosa":"Fallo en la venda. Stock no disponible");      


        System.out.println("\nModificando artículo...");

        // Modificar valores usando setters
        articulo1.setPrecio(articulo1.getPrecio() + rand.nextInt(1, 11)); // añadir valor aleatorio
        articulo1.almacenar(5); 

        // Intentar valores erróneos
        articulo1.setPrecio(-10);       // no debería cambiar
        articulo1.setCuantosQuedan(-5); // no debería cambiar
        articulo1.setNombre("");        // no debería cambiar
        articulo1.setIva(1.5);          // no debería cambiar

        // Mostrar después de cambios
        System.out.println("\nDespués de modificaciones:");
        System.out.println(articulo1);

        // Mostrar PVP con descuento
        double descuento = 10; // 10% de descuento
        System.out.println("\nPVP con " + descuento + "% de descuento: " + articulo1.getPVPDescuento(descuento));

        // Crear otro artículo con datos erróneos
        Articulo articulo2 = new Articulo("", -5, -10);
        System.out.println("\nArtículo 2 (datos erróneos iniciales):");
        System.out.println(articulo2);
    }
}

