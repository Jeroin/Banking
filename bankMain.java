package objectOriented.Banking;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		BankMain registration = new BankMain();
		registration.pick(userInput);
		
	}
	
	public void pick(Scanner userInput) {
		
		System.out.print("|--Menu--|\n[1] Register\n[2] Log in\n\nEnter the number you choose: ");
		byte pick = userInput.nextByte();
		
		if(pick == 1) {
			//Registration code
			BankMain register = new BankMain();
			register.signup(userInput);
		}else {
			//Log in code
			BankMain login = new BankMain();
			login.signin(userInput);
		}
	}
	public void signin(Scanner userInput) {
		String firstName,middleName,lastName,gender;
		byte age;
		
		System.out.println("\n|--Signing In--|\n");
		
		System.out.print("First Name: ");
		firstName = userInput.next();
		System.out.print("Middle Name: ");
		middleName = userInput.next();
		System.out.print("Last name: ");
		lastName = userInput.next();
		System.out.print("Gender: ");
		gender = userInput.next();
		System.out.print("Age: ");
		age = userInput.nextByte();
		
		SignIn account = new SignIn(firstName,middleName,lastName,gender,age);
		
		account.signInSuccessfully();
		System.out.println(account);
	}
	
	public void signup(Scanner userInput)  {
		String firstName,middleName,lastName,gender;
		byte age;
		
		System.out.println("\n|--Signing Up--|\n");
		
		System.out.print("First Name: ");
		firstName = userInput.next();
		System.out.print("Middle Name: ");
		middleName = userInput.next();
		System.out.print("Last name: ");
		lastName = userInput.next();
		System.out.print("Gender: ");
		gender = userInput.next();
		System.out.print("Age: ");
		age = userInput.nextByte();			
		
		SignUp account = new SignUp(firstName,middleName,lastName,gender,age);
		
		account.signUpSuccessfully();
		System.out.println(account);
		
		
	}

			
}
