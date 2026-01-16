package boletin1;

public class Rectangulo {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // Constructor con parámetros
    public Rectangulo(int x1, int y1, int x2, int y2) {
        setAll(x1, y1, x2, y2);
    }

    // Constructor por defecto
    public Rectangulo() {
        this(0, 0, 5, 5);
    }

    // Getters
    public int getX1() { return x1; }
    public int getY1() { return y1; }
    public int getX2() { return x2; }
    public int getY2() { return y2; }

    // Setters con validación
    public void setAll(int x1, int y1, int x2, int y2) {
        if (x1 >= 0 && x1 <= x2) { // x1 <= x2 para evitar ancho negativo
            this.x1 = x1;
        } else {
            System.out.println("Valor de x1 inválido");
        }
        
        if (y1 >= 0 && y1 <= y2) { // y1 <= y2 para evitar alto negativo
            this.y1 = y1;
        } else {
            System.out.println("Valor de y1 inválido");
        }
    }


    // Métodos para ancho, alto, área y perímetro
    public int ancho() {
        return x2 - x1;
    }

    public int alto() {
        return y2 - y1;
    }

    public int GetArea() {
        return ancho() * alto();
    }

    public int GetPerimetro() {
        return 2 * (ancho() + alto());
    }

    // Método para mostrar datos
    public String toString() {
        return("(" + x1 + ", " + y1 + ") , (" + x2 + ", " + y2 + ")"
        		+ "\nPerímetro = " + GetPerimetro()
        		+ "\nÁrea = " + GetArea());
    }

}

