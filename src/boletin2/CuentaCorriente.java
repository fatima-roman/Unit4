package boletin2;

public class CuentaCorriente {
	public enum Nacionalidad {
	    Español, Extranjero;
	}

    private String DNI;
    private String nombre;
    private int saldo;
    private Nacionalidad nacionalidad;

    // Constructores
    public CuentaCorriente(String DNI, int saldo) {
        setDNI(DNI);
        setSaldo(saldo);
        this.nombre = "Sin nombre";
        this.nacionalidad = Nacionalidad.Extranjero;
    }

    public CuentaCorriente(String DNI, String nombre, int saldo) {
        setDNI(DNI);
        setSaldo(saldo);
        setNombre(nombre);
        this.nacionalidad = Nacionalidad.Extranjero;
    }

    public CuentaCorriente(String DNI, String nombre, int saldo, Nacionalidad nacionalidad) {
        setDNI(DNI);
        setSaldo(saldo);
        setNombre(nombre);
        setNacionalidad(nacionalidad);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public int getSaldo() {
        return saldo;
    }

    // Setters
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

    public void setNacionalidad(Nacionalidad nacionalidad) {
        if (nacionalidad != null) {
            this.nacionalidad = nacionalidad;
        } else {
            System.out.println("Nacionalidad inválida");
        }
    }

    public void setSaldo(int saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido");
        }
    }

    // Sacar dinero
    public boolean sacarDinero(int cantidad) {
        if ((saldo - cantidad) >= 0) {
            saldo -= cantidad; // ← ahora sí resta el dinero
            return true;
        } else {
            System.out.println("Operación inválida: saldo insuficiente");
            return false;
        }
    }

    // Ingresar dinero
    public int ingresarDinero(int cantidad) {
        saldo += cantidad;
        return saldo;
    }

    // toString
    public String toString() {
        return "Cuenta de " + nombre + "\nDNI: " + DNI +
               "\nSaldo: " + saldo + "\nNacionalidad: " + nacionalidad;
    }

    // equals y hashCode
    public boolean equals(Object obj) {
        if (this == obj) return true;
        CuentaCorriente other = (CuentaCorriente) obj;
        return this.DNI.equals(other.DNI);
    }

    public int hashCode() {
        return DNI.hashCode();
    }
}
