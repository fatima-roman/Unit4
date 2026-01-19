package boletin2;

public class EJ03 {

    public static void main(String[] args) {

        // Crear alumnos
        Alumno a1 = new Alumno("Ana", 8.5);
        Alumno a2 = new Alumno("Luis", 6.75);
        Alumno a3 = new Alumno("María", 9.2);

        // Mostrar información inicial
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        // Modificar datos usando setters
        a2.setNotaMedia(7.5);
        a3.setNombre("María López");

        // Mostrar información tras los cambios
        System.out.println("\nDespués de modificar datos:");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
