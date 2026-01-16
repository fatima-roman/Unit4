package boletin1;

public class EJ01 {

    public static void main(String[] args) {

        Punto p1 = new Punto(1, 1);
        Punto p2 = new Punto(4, 6);

        // Mostrar usando toString()
        System.out.println("Punto 1: " + p1);
        System.out.println("Punto 2: " + p2);

        // Probar setXY
        p1.setXY(5, 0);
        System.out.println("\nPunto 1 tras setXY(5,0): " + p1);

        // Probar desplaza
        p1.desplaza(2, 5);
        System.out.println("Punto 1 tras desplaza(2,5): " + p1);

        // Probar distancia
        double distancia = p1.distancia(p2);
        System.out.println("\nDistancia entre " + p1 + " y " + p2 + ": " + distancia);

        // Más pruebas
        Punto p3 = new Punto(-3, 7);
        System.out.println("\nPunto 3: " + p3);

        p3.desplaza(-2, -4);
        System.out.println("Punto 3 tras desplaza(-2,-4): " + p3);

        System.out.println("Distancia entre " + p2 + " y " + p3 + ": " + p2.distancia(p3));
    }
}


