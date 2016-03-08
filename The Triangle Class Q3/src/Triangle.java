public class Triangle extends GeometricObject{
	double side1 = 1;
	double side2 = 1;
	double side3 = 1;
	
	//constuctors
	Triangle() {
	}
	
	Triangle(double side1, double side2,double side3) {
		side1 = this.side1;
		side2 = this.side2;
		side3 = this.side3;		
	}
	//gets side length
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	
	//gets the perimeter
	@Override
	public double getPerimeter() {
		return (side1 + side2 + side3);	
	}
	//gets the area
	@Override
	public double getArea() {
		double hP =((side1 + side2 + side3) / 2);
		return Math.sqrt( hP * (hP - side1) *
		(hP - side2) * (hP - side3));
		
	}
}
