package boletin3;

public class EJ01 {

	public static void main(String[] args) {
		int num1 = 6; 
		int num2 = 8; 
		double num3 = 8.99; 
		double num4 = 2.76;
		int resulInt; 
		double resulDouble; 
		
		resulInt = EJ01_SUMA.SUMA(num1, num2);
		resulDouble = EJ01_SUMA.SUMA(num3, num4);
		
		System.out.printf("Suma INT = %d + %d = %d%n", num1, num2, resulInt);
		System.out.printf("Suma DOUBLE = %.2f + %.2f = %.2f%n", num3, num4, resulDouble);
	}

}
