package studio7;

public class rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	private boolean isSquare;
//	private boolean isLarger;
	
	public rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
		this.area = length*width;
		this.perimeter = 2*length+2*width;
		if (length == width) {
			this.isSquare = true;
		} else {
			this.isSquare = false;
		}
//		if (this.area > areaRectangle2) {
//			this.isLarger = true;
//		} else {
//			this.isLarger = false;
//		} 
	}
	
	public boolean isBigger(rectangle r1) {
		if(this.area > r1.area) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
//	public rect() {
//		double areaRect1 = length1 * width1;
//		double areaRect2 = length2 * width2;
//		double perimRect1 = 2*length1 + 2*width1;
//		double perimRect2 = 2*length2 + 2*width2;
//		
//		
//	}

}
