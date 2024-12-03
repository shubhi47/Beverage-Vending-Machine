package beverages_project;
import java.util.Scanner;
public class VendingMachine {
 VendingMachine(){
	 System.out.println("Select your beverage and enjoy it!");
 }
 public Beverages selectBeverage() {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Press 1 for coffee...");
	 System.out.println("Press 2 for juice...");
	 System.out.println("Press 3 for wine...");
	 int choice=sc.nextInt();
	 if(choice==1) {
		 Coffee c = new Coffee();
		 return c;
	 }
	 else if(choice==2) {
		 Juice j = new Juice();
		 return j;
	 }
	 else if(choice==3) {
		 Wine w = new Wine();
		 return w;
	 }
	 else {
		 System.out.println("Invalid choice");
		 return selectBeverage();
	 }
 }

}
