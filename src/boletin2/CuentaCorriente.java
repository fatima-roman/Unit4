package boletin2;

public class CuentaCorriente {
	private String DNI; 
	private String nombre;
	private int saldo; 
	private String nacionalidad; 
	
	//Constructores
	public CuentaCorriente(String DNI, int saldo) {
		setDNI(DNI); 
		setSaldo(saldo);
		this.nombre = "Sin nombre";
		this.nacionalidad = "Extranjero"; 
	}
	
	public CuentaCorriente(String DNI, String nombre, int saldo) {
		setDNI(DNI); 
		setSaldo(saldo);
		setNombre(nombre);
		this.nacionalidad = "Extranjero"; 
	}
	
	public CuentaCorriente(String DNI, String nombre, int saldo, String nacionalidad) {
		setDNI(DNI); 
		setSaldo(saldo);
		setNombre(nombre);
		setNacionalida(nacionalidad);
	}
	
	//Getters 
	public String getNombre() {
        return nombre;
    }

	public String getDNI() {
        return DNI;
    }

	public String getNacionalidad() {
        return nacionalidad;
    }

	public int getSaldo() {
        return saldo;
    }

	
	//Setters 
	public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido");
        }
    }
	
	public void setDNI(String DNI) {
		if (DNI != null && !DNI.isEmpty() && DNI.length() == 9) {
			this.DNI = DNI;
		} else {
			System.out.println("DNI inválido");
		}
	}
	
	public void setNacionalida(String nacionalidad) {
		if (nacionalidad != null && !nacionalidad.isEmpty() 
				&& (nacionalidad.equalsIgnoreCase("Extranjero") || nacionalidad.equalsIgnoreCase("Española"))) {
			this.nacionalidad = nacionalidad;
		} else {
			System.out.println("Nombre inválido");
		}
	}
	
    public void setSaldo(int saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido");
        }
    }
    
    //Sacar dinero 
    public boolean sacarDinero(int cantidad) {
    	if ((saldo - cantidad)>=0) {
    		return true; 
    	}else {
    		System.out.println("Operación inválida");
    		return false; 
    	}
    }
    
    //Ingresar dinero 
    public int ingresarDinero(int cantidad) {
    	saldo += cantidad;
    	return saldo; 
    }
    
    //Syso
    public String toString() {
    	return "Cuenta de " + nombre + "\nSaldo: " + saldo + "\nNacionalidad: " + nacionalidad;
    }
    
    //Equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CuentaCorriente)) return false;
        CuentaCorriente other = (CuentaCorriente) obj;
        return this.DNI.equals(other.DNI) && this.nombre.equalsIgnoreCase(other.nombre);
    }

}
