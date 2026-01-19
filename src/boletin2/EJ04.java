package boletin2;

public class EJ04 {

    public static void main(String[] args) {

        // Crear pizzas
        Pizza p1 = new Pizza(1, Pizza.tamano.MEDIANA, Pizza.type.Margarita);
        Pizza p2 = new Pizza(2, Pizza.tamano.FAMILIAR, Pizza.type.CuatroQuesos);
        Pizza p3 = new Pizza(3, Pizza.tamano.MEDIANA, Pizza.type.Funghi);

        // Mostrar pizzas iniciales
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Cambiar estado de una pizza (servida)
        p1.setEstado(Pizza.estados.SERVIDA);

        // Mostrar estado tras el cambio
        System.out.println("\nDespués de servir la pizza 1:");
        System.out.println(p1);

        // Probar equals
        Pizza p4 = new Pizza(1, Pizza.tamano.FAMILIAR, Pizza.type.Margarita);

        System.out.println("\n¿pizza 1 es igual a pizza 4? " + p1.equals(p4));
    }
}
