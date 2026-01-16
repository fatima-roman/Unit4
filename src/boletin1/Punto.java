package boletin1;

class Punto {
    private int x;
    private int y;

    // Constructor con parámetros
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor por defecto
    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y; 
    }
    
    //Desplaza el punto
    public void desplaza(int   dx,   int   dy) {
    	this.x = x + dx; 
    	this.y = y + dy;
    }
    
 // Distancia entre dos puntos
    public double distancia(Punto p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // toString
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    
}

