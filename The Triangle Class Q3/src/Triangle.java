
public class Triangle {
	double side1 = 1;
	double side2 = 1;
	double side3 = 1;
	
	public static void main(String[] args) {
		
	
	Triangle triangle1 = new Triangle(4, 3, 2);
	}
	
	Triangle() {
	}
	
	Triangle(double side1, double side2,double side3) {
		side1 = this.side1;
		side2 = this.side2;
		side3 = this.side3;		
	}
			
	//gets the perimeter		
	double getPerimeter() {
		return (side1 + side2 + side3)/2;	
	}
	
	double getArea() {
		return Math.sqrt(side1)
	}
}
