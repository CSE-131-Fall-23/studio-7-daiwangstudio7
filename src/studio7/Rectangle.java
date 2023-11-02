package studio7;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double parameter;
	private boolean issmaller;
	private boolean issquare;

	private double areaB;

	
	public Rectangle(double length, double width, double area, double parameter, boolean issmaller, boolean issquare) {
		this.length = length;
		this.width = width;
		this.area = area;
		this.parameter = parameter;
		this.issmaller = issmaller;
		this.issquare = issquare;
	}
	
	public void setlength(double l) {
		length = l;
	}
	
	public void setwidth(double w) {
		width = w;
	}
	
	public double getarea() {
		area = length*width;
		return area;
	}
	
	public double getparameter() {
		parameter = 2*(length + width);
		return parameter;
	}
	
	public void setareaB(double a, double b) {
		areaB = a*b;
	}
	
	
	public boolean getissmaller() {
		if (area < areaB){
			issmaller = true;
		}
		else {
			issmaller = false;
		}
		return issmaller;
	}
	
	public boolean getissquare() {
		if (length == width){
			issquare = true;
		}
		else {
			issquare = false;
		}
		return issquare;
	}
	
}
