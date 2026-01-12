package boletin1;

public class EJ01 {

	public static void main(String[] args) {
		

        Punto p1 = new Punto();
        p1.x = 5;
        p1.y = 0;

        Punto p2 = new Punto();
        p2.x = 10;
        p2.y = 10;

        Punto p3 = new Punto();
        p3.x = -3;
        p3.y = 7;

        System.out.println("Punto 1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("Punto 2: (" + p2.x + ", " + p2.y + ")");
        System.out.println("Punto 3: (" + p3.x + ", " + p3.y + ")");

        p1.x += 3;
        p1.y -= 2;

        p2.x *= 2;
        p2.y += 5;

        p3.x = p3.x + 1;
        p3.y /= 2;

        System.out.println("Después de modificar las coordenadas:");
        System.out.println("Punto 1: (" + p1.x + ", " + p1.y + ")");
        System.out.println("Punto 2: (" + p2.x + ", " + p2.y + ")");
        System.out.println("Punto 3: (" + p3.x + ", " + p3.y + ")");
        
        
        Punto p4 = new Punto(4,9);
        Punto p5 = new Punto(5,2);
        Punto p6 = new Punto(7,10);
        
        System.out.println("Punto 1: (" + p4.x + ", " + p4.y + ")");
        System.out.println("Punto 2: (" + p5.x + ", " + p5.y + ")");
        System.out.println("Punto 3: (" + p6.x + ", " + p6.y + ")");
        
        p4.x += 3;
        p4.y -= 2;

        p5.x *= 2;
        p5.y += 5;

        p6.x = p3.x + 1;
        p6.y /= 2;
        
        System.out.println("Después de modificar las coordenadas:");
        System.out.println("Punto 1: (" + p4.x + ", " + p4.y + ")");
        System.out.println("Punto 2: (" + p5.x + ", " + p5.y + ")");
        System.out.println("Punto 3: (" + p6.x + ", " + p6.y + ")");
        
	}

}


