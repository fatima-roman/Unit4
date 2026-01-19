package boletin2;

public class Pizza {
	private int codigo; 
	private tamano tamanio; 
	private type tipo; 
	private estados estado; 
	
	//ENUM
	public enum tamano {
		MEDIANA, FAMILIAR
	}
	
	public enum type{
		Margarita, CuatroQuesos, Funghi
	}
	
	public enum estados{
		PEDIDA, SERVIDA
	}
	
	//Constructor
	public Pizza (int codigo, tamano tamanio, type tipo) {
		this.codigo = codigo; 
		this.tamanio = tamanio; 
		this.tipo = tipo; 
		this.estado = Pizza.estados.PEDIDA;
	}
	
	//Getters 
	public tamano getTamanio() {
		return tamanio; 
	}
	
	public type getTipo() {
		return tipo; 
	}
	
	public estados getEstado() {
		return estado; 
	}
	
	public int getCodigo() {
		return codigo; 
	}
	
	//Setters 
	public void setTamano(tamano tamanio) {
		if (tamanio != null ) {
            this.tamanio = tamanio;
        }
	}
	
	public void setTipo(type tipo) {
		if (tipo != null) {
			this.tipo = tipo;
		}
	}
	public void setCodigo (int codigo) {
		if (codigo >= 0) {
            this.codigo = codigo;
        }
	}
	public void setEstado (estados estado) {
		if (estado != null) {
			this.estado = estado;
		}
	}
	
	//toString
	public String toString() {
		return codigo + ": " + tamanio + " - " + tipo + " - " + " - " + estado;
	}
	
	 //Equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Pizza)) return false;
        Pizza other = (Pizza) obj;
        return this.codigo == (other.codigo);
    }


}
