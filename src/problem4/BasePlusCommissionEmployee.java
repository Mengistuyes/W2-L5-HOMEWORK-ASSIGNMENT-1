package problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;

	BasePlusCommissionEmployee(String firstName,String lastName,String socialSecurityNumber,double baseSalary,double grossSales,double commissionRate)
	{
		super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
		this.baseSalary=baseSalary;
	}
	@Override
	public double getPaymentAmount() {
		return getBaseSalary() * (super.getGrossSales() * super.getCommissionRate());
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
}
