package problem4;

public abstract class Employee implements Payable {
	String firstName;
	String lastName;
	String socialSecurityNumber;
	Employee(String firstName,String lastName,String socialSecurityNumber)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
	}
	public double getPaymentAmount() {
		return 0;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public String toString()
	{
		return firstName + " " + lastName + " SSN: " + socialSecurityNumber;
		
	}
}
