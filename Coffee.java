package beverages_project;

import java.util.Scanner;

public class Coffee implements Beverages {
	
	Coffee(){
		 System.out.println("You select coffee as your beverage ");	
	}
	public void drink() {
		
	}
	
	public void getTotalAmount() {
		 
		 System.out.println("Amount of coffee is Rs.100 per cup");
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Enter number of cups: ");
		 int cups=sc.nextInt();
		 int amt=100;
		 int totalAmt=amt*cups;
		 System.out.println("Total amount to pay: Rs"+ totalAmt);
		 Scanner Sc = new Scanner (System.in);
		 System.out.println("Enter your cash: ");
		 int cash=Sc.nextInt();
		 if(cash>totalAmt) {
			 System.out.println("Collect your cups of coffee from counter and change of Rs"+ (cash-totalAmt));
			 System.out.println("Add sugar as per your taste and drink the coffee");
			 
		 }
		 else if(cash<totalAmt) {
			 System.out.println("Enter the valid amount ");
		 }
		 else {
			 System.out.println("Collect your coffee from counter ");
			 System.out.println("Add sugar as per your taste and drink the coffee");
		 }
	 }
	
}
