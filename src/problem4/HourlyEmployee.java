package problem4;

public class HourlyEmployee extends Employee {
  
	private double wage;
	private double hours;  

	HourlyEmployee(String firstName,String lastName,String socialSecurityNumber,double wage,double hours)
	{
		super(firstName,lastName,socialSecurityNumber);
		this.wage=wage;
		this.hours=hours;
	}
	@Override
	public double getPaymentAmount() {
		return getWage() * getHours();
	}
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
}
