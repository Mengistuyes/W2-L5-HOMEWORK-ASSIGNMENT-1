package problem1;

public class MainClass {

	public static void main(String[] args) {
		
		Shape[] MyShapeObj={new Circle("red",10.0),new Squre("red",10.0),new Rectangle("red",10.0,15),new Circle("red",50.0),new Squre("red",30.0),new Rectangle("red",20.0,25)};
					
		printTotal(MyShapeObj);
	}
	public static void printTotal(Shape[] shapes)
	 {
		double sum=0;
		for(Shape s:shapes)
		{
			sum+=s.calcualteArea();
			
		}
		System.out.printf("Total Sum of all shape is: %.2f ", sum);
	 } 

}
