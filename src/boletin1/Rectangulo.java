package boletin1;

public class Rectangulo {

	int x1; 
	int x2; 
	int y1; 
	int y2; 
	
	public Rectangulo(int x1, int y1, int x2, int y2) {
		if ((x1+y1)<(x2+y2)) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}else {
			this.x1 = 0; 
			this.y1 = 0; 
			this.x2 = 5; 
			this.y2 = 5; 
		}
	}
	
}
