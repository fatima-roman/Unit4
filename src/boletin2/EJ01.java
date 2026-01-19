package boletin2;

import boletin2.CuentaCorriente.naclidad;

public class EJ01 {

    public static void main(String[] args) {

        // Crear cuentas
        CuentaCorriente c1 = new CuentaCorriente("12345678A", "Juan", 1000, naclidad.Español);
        CuentaCorriente c2 = new CuentaCorriente("87654321B", "Ana", 500);
        CuentaCorriente c3 = new CuentaCorriente("12345678A", "Juan", 2000, naclidad.Extranjero);

        // Mostrar cuentas
        System.out.println("Cuentas iniciales:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Probar ingresar dinero
        c2.ingresarDinero(200);
        System.out.println("\nDespués de ingresar 200 en la cuenta de Ana:");
        System.out.println(c2);

        // Probar sacar dinero
        boolean ok = c1.sacarDinero(1200); // saldo insuficiente
        System.out.println("\nIntento de sacar 1200 de Juan: " + ok);
        System.out.println(c1);

        c1.sacarDinero(300); // saldo suficiente
        System.out.println("\nDespués de sacar 300 de Juan:");
        System.out.println(c1);

        // Probar equals
        System.out.println("\nc1 y c3 son iguales? " + c1.equals(c3));
        System.out.println("c1 y c2 son iguales? " + c1.equals(c2));
    }
}
