package boletin1;

public class Articulo {

    private String nombre;
    private double precio;
    private double iva;
    private int cuantosQuedan;

    // Constructor
    public Articulo(String nombre, double precio, int cuantosQuedan) {
        setNombre(nombre);
        setPrecio(precio);
        setCuantosQuedan(cuantosQuedan);
        this.iva = 0.21; // IVA por defecto
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIva() {
        return iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public double getPVP() {
        return precio + (precio * iva);
    }
    
    public double getPVPDescuento(double des) {
    	return getPVP() - (getPVP()*(des/100));
    }

    // Setters con validación
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido");
        }
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = Math.round(precio * 100.0) / 100.0; // redondear a 2 decimales
        } else {
            System.out.println("Precio inválido");
        }
    }

    public void setIva(double iva) {
        if (iva >= 0 && iva <= 1) {
            this.iva = iva;
        } else {
            System.out.println("IVA inválido");
        }
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan >= 0) {
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.out.println("Stock inválido");
        }
    }
    
    //Vender con boolean
    public boolean vender() {
    	if (cuantosQuedan <= 0 ) {
    		return false;
    	}else {
    		return true; 
    	}
    }
    
    //Almacenar con int
    public int almacenar(int nuevo) {
    	cuantosQuedan += nuevo; 
    	return cuantosQuedan; 
    }
    
    // Método para mostrar información del artículo
    public String toString() {
        return(nombre + ":"
                + "\n  Precio: " + precio
                + "\n  IVA: " + (iva * 100) + "%"
                + "\n  PVP: " + getPVP()
                + "\n  Stock: " + cuantosQuedan);
    }
}

