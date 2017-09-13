package problem2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{
	 int numberOfPublications;
	 Professor(int numberOfPublications,String name,LocalDate hireDate,double salary)
	 {
		 super(name,hireDate,salary);
		 this.numberOfPublications=numberOfPublications;
	 }
	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}
