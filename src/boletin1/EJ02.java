package boletin1;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*Persona persona1 = new Persona();
		System.out.print("Introduce DNI de Persona1:");
		persona1.DNI = sc.next();
		
		System.out.print("Introduce nombre de Persona1:");
		persona1.nombre = sc.next();
		
		sc.nextLine();
		System.out.print("Introduce apellidos de Persona1:");
		persona1.apellidos = sc.nextLine();
		
		System.out.print("Introduce edad de Persona1:");
		persona1.edad = sc.nextInt();

		
		Persona persona2 = new Persona();
		System.out.print("\n\nIntroduce DNI de Persona2:");
		persona2.DNI = sc.next();
		
		System.out.print("Introduce nombre de Persona2:");
		persona2.nombre = sc.nextLine();
		
		System.out.print("Introduce apellidos de Persona2:");
		persona2.apellidos = sc.next();
		
		System.out.print("Introduce edad de Persona2:");
		persona2.edad = sc.nextInt();*/
		
		Persona persona1 = new Persona("p1");
		Persona persona2 = new Persona(19);
		
		System.out.print("\n\n"+persona1.nombre + " " + persona1.apellidos + " de DNI " + persona1.DNI + " ");
		mayorEdad(persona1.edad); 
				
		System.out.print("\n"+persona2.nombre + " " + persona2.apellidos + " de DNI " + persona2.DNI + " ");
		mayorEdad(persona2.edad); 
		
		
		
		sc.close();
	}
	
	private static void mayorEdad(int edad) {
		if (edad >= 18) {
			System.out.print(" es mayor de edad");
		}else {
			System.out.print(" no es mayor de edad");
		}

	}

}
