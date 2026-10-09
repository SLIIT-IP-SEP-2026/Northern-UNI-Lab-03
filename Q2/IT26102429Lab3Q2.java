import java.util.Scanner;

public class IT26102429Lab3Q2{

  public static void main (String[] args){
    double OTAmount, OThours, OThourlyRate,TotalSalary,MonthlySalary;
	
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter the Monthly Salary");
	MonthlySalary=input.nextDouble();
	
	System.out.println("Enter the number of OT hours:");
	OThours=input.nextDouble();
	 
	System.out.println("Enter the  OT hourly rate:");
	OThourlyRate=input.nextDouble(); 
	 
	OTAmount=OThours * OThourlyRate;
	
	TotalSalary=OTAmount + MonthlySalary;
	
	
	System.out.println("The total Salary is:" + TotalSalary);
	
	}
	
	
}
	