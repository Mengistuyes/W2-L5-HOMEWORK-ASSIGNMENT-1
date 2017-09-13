package problem4;

public class SalariedEmployee extends Employee{
	private double weeklySalary;

	SalariedEmployee(String firstName,String lastName,String socialSecurityNumber,double weeklySalary)
	{
		super(firstName,lastName,socialSecurityNumber);
		this.weeklySalary=weeklySalary;
	}
	@Override
	public double getPaymentAmount()
	{
		return getWeeklySalary();
	}
	
	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
}
