package problem2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
double overtimeHours;
	Secretary(double overtimeHours,String name,LocalDate hireDate,double salary)
	{
		super(name,hireDate,salary);
		this.overtimeHours=overtimeHours;
	}
	@Override
	double computeSalary()
	{
		 return super.salary * (12*overtimeHours);
	}
}
