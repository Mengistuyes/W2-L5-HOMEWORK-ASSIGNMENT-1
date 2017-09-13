package problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LocalDate MyLocalDate=ChangeMyDateToLocalDate("09/12/2017","MM/dd/yyyy");
		Professor p1=new Professor(10,"Mengistu",MyLocalDate,150000);
		Professor p2=new Professor(8,"Mengistu",MyLocalDate,170000);
		Professor p3=new Professor(4,"Mengistu",MyLocalDate,140000);
		
		Secretary s1=new Secretary(30,"Mengistu",MyLocalDate,50000);
		Secretary s2=new Secretary(20,"Mengistu",MyLocalDate,45000);
		
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0]=p1;
		department[1]=p2;
		department[2]=p3;
		department[3]=s1;
		department[4]=s2;
		do{
				System.out.println("\ndo you like to see the salary of all Professors and Secretaries");
				Scanner myinput=new Scanner(System.in);
				
				String input=myinput.nextLine();
				double sum =0;
				
				if(input.trim().equals("Y".trim()) || input.trim().equals("y".trim()))
		        {				for(DeptEmployee a:department)
						{
							sum+=a.salary;//Sum all 
						}
					System.out.printf("\nThe sum all salaries is: " + sum + "\n");
				}
		else
		{
			System.out.println("Program Terminated!");
			myinput.close();
			break;
		}
		}while(true);
		
	}
	public static LocalDate ChangeMyDateToLocalDate(String date,String Pattern) {
		return LocalDate.parse(date,DateTimeFormatter.ofPattern(Pattern));
		}

}
