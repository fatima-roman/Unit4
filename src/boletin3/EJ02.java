package boletin3;

public class EJ02 {

	public static void main(String[] args) {
		int num1 = 6; 
		int num2 = 8; 
		int num3 = 8;
		int resulInt; 
		
		resulInt = EJ02_MEDIA.MEDIA(num1, num2);
		System.out.printf("Media INT = (%d + %d)/2 = %d%n", num1, num2, resulInt);

		resulInt = EJ02_MEDIA.MEDIA(num1, num2, num3);
		System.out.printf("Media INT 3 = (%d + %d + %d)/3 = %d", num1, num2, num3, resulInt);
	}

}
