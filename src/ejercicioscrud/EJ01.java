package ejercicioscrud;

import java.util.Scanner;

public class EJ01 {
    private static final Scanner sc = new Scanner(System.in);
    private static final GestorAlumno gestor = new GestorAlumno();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("""
                    \nALUMNOS/AS
                    ===================
                    1. Listado.
                    2. Nuevo Alumno.
                    3. Modificar.
                    4. Borrar.
                    5. Salir.""");
            System.out.print("Opción: ");
            opcion = Integer.parseInt(sc.nextLine().trim());

            switch (opcion) {
                case 1 -> gestor.listar();
                case 2 -> {
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nota: ");
                    double nota = Double.parseDouble(sc.nextLine());
                    gestor.añadir(new Alumno(nombre, nota));
                }
                case 3 -> {
                    System.out.print("Nombre del alumno a modificar: ");
                    String nombre = sc.nextLine();
                    System.out.print("Nueva nota: ");
                    double nota = Double.parseDouble(sc.nextLine());
                    System.out.println(gestor.modificarNota(nombre, nota)
                            ? "Nota actualizada." : "Alumno no encontrado.");
                }
                case 4 -> {
                    System.out.print("Nombre del alumno a borrar: ");
                    String nombre = sc.nextLine();
                    System.out.println(gestor.borrar(nombre)
                            ? "Alumno eliminado." : "Alumno no encontrado.");
                }
                case 5 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}

