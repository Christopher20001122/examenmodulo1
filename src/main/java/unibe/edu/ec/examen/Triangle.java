package unibe.edu.ec.examen;

public class Triangle {
	private double side;

	public Triangle(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public double calculatePerimeter() {
		double perimeter = (side + side + side);
		return perimeter;
		
	}
	public double calculateArea(double heigh) {
		double area = (side * heigh)/2;
		return area;
	}
	public double calculateVolum(double baseSide, double height) {
		double volum = baseSide * baseSide * height * 1/3;
		return volum;
	}
}
