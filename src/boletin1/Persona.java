package boletin1;

public class Persona {

    private String DNI;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor por nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.apellidos = "apll1";
        this.DNI = "111";
        this.edad = 15;
    }

    // Constructor por edad
    public Persona(int edad) {
        this.nombre = "Nombre";
        this.apellidos = "apll2";
        this.DNI = "000";
        setEdad(edad); // Usamos setter para validar 
    }

    // Getters
    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    // Setters y comprobamos que sean correctos
    public void setDNI(String DNI) {
        if (DNI != null && !DNI.isEmpty()) {
            this.DNI = DNI;
        } else {
            System.out.println("DNI inválido");
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido");
        }
    }

    public void setApellidos(String apellidos) {
        if (apellidos != null && !apellidos.isEmpty()) {
            this.apellidos = apellidos;
        } else {
            System.out.println("Apellidos inválidos");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) { 
            this.edad = edad;
        } else {
            System.out.println("Edad inválida");
        }
    }
    
   //Mayor de edad o no 
    public boolean esMayorEdad() {
    	if (edad >= 18) {
    		return true; 
    	}else {
    		return false;
    	}
    }
    
    //Jubilado 
    public boolean esJubilado() {
    	if (edad>= 65) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.getEdad());
    }


    // Método para mostrar información
    public String toString() {
        
		return getNombre() + " " + getApellidos() + " de DNI " + getDNI() + " ";
    }
}
