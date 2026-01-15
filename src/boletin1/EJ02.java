package boletin1;

import java.util.Scanner;

public class EJ02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear personas con constructores dos dif
        Persona persona1 = new Persona("p1");
        Persona persona2 = new Persona(19);

        // Mostrar información y mayor edad
        persona1.mostrar();
        Persona.mayorEdad(persona1.getEdad());

        System.out.println();

        persona2.mostrar();
        Persona.mayorEdad(persona2.getEdad());

        System.out.println();
        
        // Ejemplo de modificar datos
        persona1.setEdad(20);
        persona1.setNombre("Juan");
        persona1.setApellidos("Pérez");
        persona1.setDNI("12345678A");

        System.out.println("\nDespués de modificar datos:");
        persona1.mostrar();
        Persona.mayorEdad(persona1.getEdad());

        sc.close();
    }

    
}

