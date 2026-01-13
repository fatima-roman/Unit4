package boletin1;

public class Articulo {
	
	String nombre = "Producto x";
    double precio = 1.0;
    double iva = 0.21;
    int cuantosQuedan = 0;
	
    public Articulo(String nombre, double precio, int cuantosQuedan) {

        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }

        if (precio > 0) {
            this.precio = Math.round(precio);
        }

        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        }
    }

    double getPVP() {
        return precio + (precio * iva);
    }
	
}
