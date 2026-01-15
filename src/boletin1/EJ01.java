package boletin1;

public class EJ01 {

    public static void main(String[] args) {

        Punto p1 = new Punto();
        p1.setX(5);
        p1.setY(0);

        Punto p2 = new Punto();
        p2.setX(10);
        p2.setY(10);

        Punto p3 = new Punto();
        p3.setX(-3);
        p3.setY(7);

        System.out.println("Punto 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Punto 2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Punto 3: (" + p3.getX() + ", " + p3.getY() + ")");

        // Modificar valores usando setters
        p1.setX(p1.getX() + 3);
        p1.setY(p1.getY() - 2);

        p2.setX(p2.getX() * 2);
        p2.setY(p2.getY() + 5);

        p3.setX(p3.getX() + 1);
        p3.setY(p3.getY() / 2);

        System.out.println("Después de modificar las coordenadas:");
        System.out.println("Punto 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Punto 2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Punto 3: (" + p3.getX() + ", " + p3.getY() + ")");

        // Crear puntos usando constructor con parámetros
        Punto p4 = new Punto(4, 9);
        Punto p5 = new Punto(5, 2);
        Punto p6 = new Punto(7, 10);

        System.out.println("Punto 4: (" + p4.getX() + ", " + p4.getY() + ")");
        System.out.println("Punto 5: (" + p5.getX() + ", " + p5.getY() + ")");
        System.out.println("Punto 6: (" + p6.getX() + ", " + p6.getY() + ")");

        // Modificar valores
        p4.setX(p4.getX() + 3);
        p4.setY(p4.getY() - 2);

        p5.setX(p5.getX() * 2);
        p5.setY(p5.getY() + 5);

        p6.setX(p6.getX() + 1);
        p6.setY(p6.getY() / 2);

        System.out.println("Después de modificar las coordenadas:");
        System.out.println("Punto 4: (" + p4.getX() + ", " + p4.getY() + ")");
        System.out.println("Punto 5: (" + p5.getX() + ", " + p5.getY() + ")");
        System.out.println("Punto 6: (" + p6.getX() + ", " + p6.getY() + ")");
    }
}



