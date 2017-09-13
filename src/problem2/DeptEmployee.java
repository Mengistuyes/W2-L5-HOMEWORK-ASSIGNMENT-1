package problem2;

import java.time.LocalDate;

public class DeptEmployee {
	 String name;
	 LocalDate hireDate;
	 double salary; 
	
	 DeptEmployee(String name,LocalDate hireDate,double salary)
	 {
		 this.name=name;
		 this.hireDate=hireDate;
		 this.salary=salary;
	 }
	 
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	double computeSalary()
	 {
		 return salary;
	 }
}
