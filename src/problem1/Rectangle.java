package problem1;

public class Rectangle extends Shape {
	double width;
	double height;
	public Rectangle(String color,double width,double height)
	{
		super(color);
		this.width=width;
		this.height=height;
	}
	
	public double calcualteArea()
	{
		return this.width * this.height;
		
	}
	public double calculatePerimeter()
	{
		return 2* this.width * 2* this.height;
		
	}
}
