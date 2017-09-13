package problem3;

public class Main {

	public static void main(String[] args) {
		Figure[] f={new UpwardHat(),new UpwardHat(),new DownwardHat(),new FaceMaker(),new Vertical()};	
		
		for(Figure fig:f)
		{
			fig.getFigure();	
		}
		;
		String st;
		System.out.println("\n");
		for(Figure fig2:f)
		{
			st=fig2.getClass().getCanonicalName();
			System.out.printf( "%s : " , fig2.getClass().getSimpleName());
			fig2.getFigure();
			System.out.print("\n");
		}
		
			
	}

}
