import java.util.Scanner;

public class IT26102429Lab3Q1B{

  public static void main (String[] args){
    double pricePerKg, quantity, totalAmount,discounttotal,finalAmount;
	
	double discount =0.10;
	
	Scanner input=new Scanner(System.in);
	
	
	System.out.println("Enter the price of 1Kg Rice:");
	pricePerKg=input.nextDouble();
	
	System.out.println("Enter the number of kilograms you want to buy:");
	quantity=input.nextDouble();
	
	totalAmount=pricePerKg*quantity;
	
	discounttotal=totalAmount * discount;
	
	finalAmount=totalAmount-discounttotal;
	
	System.out.println("The totalAmount with 10% discount is:" + finalAmount);
	
	
	}
	
}
  