package problem4;

public class Main {

	public static void main(String[] args) {
		Employee[] Emp={new SalariedEmployee("Mengistu","Bogale","11111111",7000),new HourlyEmployee("Abebe","Mogus","22222",70,80),new CommissionEmployee("Kebede","Solomon","33333",15000.0,0.50),new BasePlusCommissionEmployee("Woin","lema","44444",50000.0,200.0,0.50)};
		Invoice Inv=new Invoice("AA12456","ddddddddsdfd",20,25.50);
		double sum = 0;
		for(Employee e:Emp)
		{
			System.out.println(e.toString() + " Payment: " + e.getPaymentAmount());
			sum+=e.getPaymentAmount();
		}
		System.out.printf("Total Payment: %.2f%n " , sum);
		System.out.printf("Total Payment including Invoice: %.2f " , sum+=Inv.getPaymentAmount());
		
	}

}
