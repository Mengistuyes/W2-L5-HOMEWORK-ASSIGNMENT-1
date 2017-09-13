package problem1;

public class Squre extends Rectangle {

	Squre(String color,double side)
	{
		super(color,side,side);
	}
	public double calcualteArea()
	{
		return super.height * super.height;
		
	}
	public double calculatePerimeter()
	{
		return 4* this.height * this.height;
		
	}
}
