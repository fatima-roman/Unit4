package boletin1;

public class EJ03 {

	public static void main(String[] args) {
		
		/*Rectangulo rect1 = new Rectangulo();
		rect1.x1 = 0;
		rect1.y1 = 0; 
		rect1.x2 = 5;
		rect1.y2 = 5; 
		
		
		Rectangulo rect2 = new Rectangulo();
		rect2.x1 = 7;
		rect2.y1 = 9; 
		rect2.x2 = 2;
		rect2.y2 = 3; */
		
		Rectangulo rect1 = new Rectangulo(1,1,5,5);
		Rectangulo rect2 = new Rectangulo(7,9,2,3);
		
		int anchoRect1 = rect1.x2 - rect1.x1; 
		int anchoRect2 = rect2.x2 - rect2.x1;
		int altoRect1 = rect1.y2 - rect1.y1;
		int altoRect2 = rect2.y2 - rect2.y1;
		
		System.out.println("\nRectángulo 1 ("+rect1.x1+", "+rect1.y1+") , ("+rect1.x2+", "+rect1.y2+"):"
				+ "\n	Perímetro: " + (2*(anchoRect1+altoRect1))
				+ "\n	Área: "+ (anchoRect1*altoRect1));
		
		System.out.println("\nRectángulo 2 ("+rect2.x1+", "+rect2.y1+") , ("+rect2.x2+", "+rect2.y2+"):"
				+ "\n	Perímetro: " + (2*(anchoRect2+altoRect2))
				+ "\n	Área: "+ (anchoRect2*altoRect2));
		
		rect1.x1 += 3;
        rect1.y2 -= 2;
        rect1.y1 -= 2;
        rect1.x2 *= 2;

        rect2.x1 *= 3;
        rect2.y2 /= 2;
        rect2.y1 -= 2;
        rect2.x2 += 2;

        System.out.println("\nRectángulo 1 ("+rect1.x1+", "+rect1.y1+") , ("+rect1.x2+", "+rect1.y2+"):"
				+ "\n	Perímetro: " + (2*(anchoRect1+altoRect1))
				+ "\n	Área: "+ (anchoRect1*altoRect1));
		System.out.println("\nRectángulo 2 ("+rect2.x1+", "+rect2.y1+") , ("+rect2.x2+", "+rect2.y2+"):"
				+ "\n	Perímetro: " + (2*(anchoRect2+altoRect2))
				+ "\n	Área: "+ (anchoRect2*altoRect2));
		
		
	}

}
