package entities;

public class Retangule {

	double p, d;
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}	
	public double perimeter() {
		p =  ((width * 2) + (height * 2));
		return p;
	}
	
	public double diagonal() {
		d =  ((width * width) + (height * height));		
		return Math.sqrt(d);
	}

}
