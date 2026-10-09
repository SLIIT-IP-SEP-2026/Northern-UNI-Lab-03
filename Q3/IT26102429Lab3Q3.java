import java.util.Scanner;

public class IT26102429Lab3Q3{

  public static void main(String[] args){
  
  int amount = 0;
  
  int Count5000 = 0;
  int Count1000 = 0;
  int Count500 = 0;
  int Count200 = 0;
  int Count100 = 0;
  int Count50 = 0;
  int Count20 = 0;
  int Count10 = 0;
  int Count5 = 0;
  int Count2= 0;
  int Count1 = 0;
  
  Scanner input=new Scanner(System.in);
  
  System.out.println("Enter the rupee amount");
  amount=input.nextInt();
  
  
  Count5000=amount/5000;
  amount= amount%5000;
  
  Count1000=amount/1000;
  amount= amount%1000;
  
  Count500=amount/500;
  amount= amount%500;
  
  Count200=amount/200;
  amount= amount%200;
  
  Count100=amount/100;
  amount= amount%100;
  
  Count50=amount/50;
  amount= amount%50;
  
  Count20=amount/20;
  amount= amount%20;
  
  Count10=amount/10;
  amount= amount%10;
  
  Count5=amount/5;
  amount= amount%5;
  
  Count2=amount/2;
  amount= amount%2;
  
  Count1=amount/1;
  amount= amount%1;
  
  System.out.println(" 5000 Notes - " + Count5000);
  System.out.println(" 5000 Notes - " + Count5000);
  System.out.println(" 1000 Notes - " + Count1000);
  System.out.println(" 500 Notes - " + Count500);
  System.out.println(" 200 Notes - " + Count200);
  System.out.println(" 100 Notes - " + Count100);
  System.out.println(" 50 Notes - " + Count50);
  System.out.println(" 20 Notes - " + Count20);
  System.out.println(" 10 Notes - " + Count10);
  System.out.println(" 5 Notes - " + Count5);
  System.out.println(" 2 Notes - " + Count2);
  System.out.println(" 1 Notes - " + Count1);
  
  }
}
  
  
  
  
  
  
  
  
  