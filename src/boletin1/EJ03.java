package boletin1;

public class EJ03 {

    public static void main(String[] args) {

        // Crear rectángulos
        Rectangulo rect1 = new Rectangulo(1, 1, 5, 5);
        // valores erróneos iniciales
        Rectangulo rect2 = new Rectangulo(7, 9, 2, 3); 
        //Usar constructor por defecto
        Rectangulo rect3 = new Rectangulo(); 

        // Mostrar información
        System.out.println("Rectángulo 1:");
        rect1.mostrar();

        System.out.println("\nRectángulo 2:");
        rect2.mostrar(); // mostrará valores corregidos por los setters
        
        System.out.println("\nRectángulo 3:");
        rect3.mostrar(); // mostrará valores por defecto
        
        System.out.println();

        // Modificar rectángulos usando 
        rect1.setX1(rect1.getX1() + 3);
        rect1.setY1(rect1.getY1() - 2);
        rect1.setX2(rect1.getX2() * 2);
        rect1.setY2(rect1.getY2() - 2);

        rect2.setX1(rect2.getX1() * 3);
        rect2.setY1(rect2.getY1() - 2);
        rect2.setX2(rect2.getX2() + 2);
        rect2.setY2(rect2.getY2() / 2);
        
        rect3.setX1(rect3.getX1() * 6);
        rect3.setY1(rect3.getY1() - 9);
        rect3.setX2(rect3.getX2() + 6);
        rect3.setY2(rect3.getY2() / 1);
        
        System.out.println();

        System.out.println("\nTras de modificar:");

        System.out.println("Rectángulo 1:");
        rect1.mostrar();

        System.out.println("\nRectángulo 2:");
        rect2.mostrar();
        
        System.out.println("\nRectángulo 3:");
        rect3.mostrar();
    }
}

