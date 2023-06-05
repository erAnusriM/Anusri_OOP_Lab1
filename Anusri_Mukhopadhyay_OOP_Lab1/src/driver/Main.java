package driver;
import java.util.InputMismatchException;
import java.util.Scanner;
import exceptions.*;
import entities.*;
import services.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Harshit", "choudary",getDepartment());
		CredentialService cs = new CredentialService();
		cs.showCredentials(emp);
	}
	
	public static String getDepartment() {
		System.out.println("Please enter the department from the following: ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		Scanner sc = new Scanner(System.in);
		try {
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1: 
				return "tech";
			case 2: 
				return "admin";
			case 3: 
				return "hr";
			case 4: 
				return "legal";
			default: 
				throw new InvalidInputException("Enter a valid input");   
			}
		}
		catch (InputMismatchException e) {
		   e.printStackTrace();
		   throw new InputMismatchException("Enter a valid input...");	
		}
	}
}
