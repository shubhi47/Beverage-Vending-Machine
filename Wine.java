package beverages_project;

import java.util.Scanner;

public class Wine implements Beverages {
	Wine(){
		System.out.println("You select Wine as your beverage ");
	}
	public void drink() {
		
	}
	public void getTotalAmount() {
		
		 System.out.println("Amount of wine is Rs.500 per cup");
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter number of cups: ");
		 int cups=sc.nextInt();
		 int amt=500;
		 int totalAmt=amt*cups;
		 System.out.println("Total amount to pay: Rs"+ totalAmt);
		 Scanner Sc = new Scanner (System.in);
		 System.out.println("Enter your cash: ");
		 int cash=Sc.nextInt();
		 if(cash>totalAmt) {
			 System.out.println("Collect your glass of wine from counter and change of Rs"+ (cash-totalAmt));
			 System.out.println("Add ice into it and enjoy your wine ");
			 
		 }
		 else if(cash<totalAmt) {
			 System.out.println("Enter the valid amount ");
		 }
		 else {
			 System.out.println("Collect your wine from counter ");
			 System.out.println("Add ice into it and enjoy your wine ");
		 }
	 }
	
	}
