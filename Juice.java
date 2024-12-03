package beverages_project;

import java.util.Scanner;

public class Juice implements Beverages{
	Juice(){
		System.out.println("You select juice as your beverage ");
	}
	public void drink() {
		
	}
	
	public void getTotalAmount() {
		
		 System.out.println("Amount of juice is Rs.120 per cup");
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter number of cups: ");
		 int cups=sc.nextInt();
		 int amt=120;
		 int totalAmt=amt*cups;
		 System.out.println("Total amount to pay: Rs"+ totalAmt);
		 Scanner Sc = new Scanner (System.in);
		 System.out.println("Enter your cash: ");
		 int cash=Sc.nextInt();
		 if(cash>totalAmt) {
			 System.out.println("Collect your glass of juice from counter and change of Rs"+ (cash-totalAmt));
			 System.out.println("put straw in juice and drink it");
			 
		 }
		 else if(cash<totalAmt) {
			 System.out.println("Enter the valid amount ");
		 }
		 else {
			 System.out.println("Collect yourjuice from counter ");
			 System.out.println("put straw in juice and drink it");
		 }
	 }
	
}
