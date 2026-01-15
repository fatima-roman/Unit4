package boletin1;

public class Rectangulo {

    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // Constructor con parámetros
    public Rectangulo(int x1, int y1, int x2, int y2) {
        setX1(x1);
        setY1(y1);
        setX2(x2);
        setY2(y2);
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
    public void setX1(int x1) {
        if (x1 >= 0 && x1 <= x2) { // x1 <= x2 para evitar ancho negativo
            this.x1 = x1;
        } else {
            System.out.println("Valor de x1 inválido");
        }
    }

    public void setY1(int y1) {
        if (y1 >= 0 && y1 <= y2) { // y1 <= y2 para evitar alto negativo
            this.y1 = y1;
        } else {
            System.out.println("Valor de y1 inválido");
        }
    }

    public void setX2(int x2) {
        if (x2 >= 0 && x2 >= x1) { 
            this.x2 = x2;
        } else {
            System.out.println("Valor de x2 inválido");
        }
    }

    public void setY2(int y2) {
        if (y2 >= 0 && y2 >= y1) {
            this.y2 = y2;
        } else {
            System.out.println("Valor de y2 inválido");
        }
    }

    // Métodos para ancho, alto, área y perímetro
    public int ancho() {
        return x2 - x1;
    }

    public int alto() {
        return y2 - y1;
    }

    public int area() {
        return ancho() * alto();
    }

    public int perimetro() {
        return 2 * (ancho() + alto());
    }

    // Método para mostrar datos
    public void mostrar() {
        System.out.println("(" + x1 + ", " + y1 + ") , (" + x2 + ", " + y2 + ")"
        		+ "\nPerímetro = " + perimetro()
        		+ "\nÁrea = " + area());
    }

}

