package ejercicioscrud;

import java.util.ArrayList;
import java.util.List;

public class GestorAlumno {
    private List<Alumno> alumnos = new ArrayList<>();

    public void listar() {
        if (alumnos.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }
        alumnos.forEach(System.out::println);
    }

    public void añadir(Alumno a) {
        alumnos.add(a);
        System.out.println("Alumno añadido correctamente.");
    }

    /** Busca por nombre (ignorando mayúsculas). */
    public Alumno buscarPorNombre(String nombre) {
        return alumnos.stream()
                .filter(a -> a.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    public boolean modificarNota(String nombre, double nuevaNota) {
        Alumno a = buscarPorNombre(nombre);
        if (a == null) return false;
        a.setNota(nuevaNota);
        return true;
    }

    public boolean borrar(String nombre) {
        return alumnos.removeIf(a -> a.getNombre().equalsIgnoreCase(nombre));
    }
}

