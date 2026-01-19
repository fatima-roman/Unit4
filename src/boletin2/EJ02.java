package boletin2;

public class EJ02 {

    public static void main(String[] args) {

        // Crear libros usando distintos constructores
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes");
        Libro libro2 = new Libro("1984", "George Orwell", 5, 1);
        Libro libro3 = new Libro("La Celestina", "Fernando de Rojas", 3, 0, Libro.Genero.DRAMATICO);

        // Mostrar información inicial
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);

        // Probar préstamo
        System.out.println("\nPréstamo de '1984': " + libro2.prestamo());
        System.out.println("Préstamo de '1984': " + libro2.prestamo());
        System.out.println("Préstamo de '1984': " + libro2.prestamo());

        // Probar devolución
        System.out.println("\nDevolución de '1984': " + libro2.devolucion());

        // Mostrar información tras operaciones
        System.out.println("\nEstado final:");
        System.out.println(libro2);

        // Probar equals
        Libro libro4 = new Libro("El Quijote", "Miguel de Cervantes", 10, 2);
        System.out.println("\n¿libro1 es igual a libro4? " + libro1.equals(libro4));
    }
}

