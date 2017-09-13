package problem5;

public class Main {

	public static void main(String[] args) {
		Computer c1=new Computer("HP","Intel i7",12,1000,240.00);
		Computer c2=new Computer("HP","Intel i7",12,1000,240.00);
		Computer c3=new Computer("DELL","Intel i5",16,1000,220.00);
		Computer c4 = c1;
	
		if(c1.equals(c2))
			System.out.println("c1 and c2 are Equals --> True");
		else
        	System.out.println("c1 and c2 are not Equal --> False");
		
        if (c1.equals(c3))
            System.out.println("c1 and c3 are Equals --> True");
        else
        System.out.println("c1 and c3 are not Equal --> False");
        
        if (c1.equals(c4))
            System.out.println("c1 and c4 are Equals --> True");
        else
        System.out.println("c1 and c4 are not Equal --> False");
        
        System.out.println(c1.toString());
        System.out.println("Hash of code c1 : " + c1.hashCode());
        System.out.println(c2.toString());
        System.out.println("Hash of code c2 : " +c2.hashCode()); 
        System.out.println(c3.toString());
        System.out.println("Hash of code c3 : " +c3.hashCode());
        System.out.println(c4.toString());
        System.out.println("Hash of code c4 : " +c4.hashCode());
        
        

	}

}
