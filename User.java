package beverages_project;
import java.util.*;
public class User {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char c;
	VendingMachine vm= new VendingMachine();
	
	do{
		Beverages b=vm.selectBeverage();
	     b.getTotalAmount();
         System.out.println("Press Y/y to continue your order...");
         c=sc.next().charAt(0);
}while(c=='y'||c=='Y');
System.out.println("Thank you... Wait for next time!");
}
}