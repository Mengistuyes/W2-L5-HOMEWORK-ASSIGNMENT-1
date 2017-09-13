package problem6;

import problem6.Computer;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p=new Person("Mengistu",new Computer("HP","Intel i7",12,1000,240.00));
		
		  System.out.println("\n");
	      System.out.println("______________Shallow clone______________\n");

		  System.out.println("Before Shallow Cloning");
	      System.out.println(p);
	      
	      Person ClonedP= (Person) p.cloneShallow(); 
	      System.out.println("After Cloning");
	      System.out.println(ClonedP);
	           
	      p.computer.setDiskSize(2000);
	      System.out.println("After Modifing Computer Hard Disk.");
	      System.out.println(ClonedP);

	      System.out.println("\n");
	      System.out.println("______________Deep clone______________\n");
	      
	      System.out.println("Before Deep Cloning");
	      System.out.println(p);
	      
	      Person ClonedDeep= (Person) p.cloneDeep(); 
	      System.out.println("After Deep Cloning");
	      System.out.println(ClonedDeep);
	           
	      p.computer.setDiskSize(4000);
	      System.out.println("After Modifing Computer Hard Disk.");
	      System.out.println(ClonedDeep);
	      
	      
	}

}
