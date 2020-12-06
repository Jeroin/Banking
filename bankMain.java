package objectOriented.Banking;

import java.util.Scanner;

public class bankMain {

	public static void main(String[] args) {
		
		bankMain registration = new bankMain();
		registration.pick();
		
	}
	
	public void pick() {
		Scanner userInput = new Scanner(System.in);
		System.out.print("|--Menu--|\n[1] Register\n[2] Log in\n\nEnter the number you choose: ");
		byte pick = userInput.nextByte();
		if(pick == 1) {
			//Registration code
			bankMain register = new bankMain();
			register.signup();
		}else {
			//Log in code
			bankMain login = new bankMain();
			login.signin();
		}
		userInput.close();
	}
	public void signin() {
		Scanner userInput = new Scanner(System.in);
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
		
		signIn account = new signIn(firstName,middleName,lastName,gender,age);
		account.setFirstName(firstName);
		account.setMiddleName(middleName);
		account.setLastName(lastName);
		account.setGender(gender);
		account.setAge(age);
		
		account.signInSuccessfully();
		System.out.println(account);
		
		userInput.close();
		
	}
	
	public void signup()  {
		Scanner userInput = new Scanner(System.in);
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
		
		signUp account = new signUp(firstName,middleName,lastName,gender,age);
		account.setFirstName(firstName);
		account.setMiddleName(middleName);
		account.setLastName(lastName);
		account.setGender(gender);
		account.setAge(age);
		
		account.signUpSuccessfully();
		System.out.println(account);
		
		userInput.close();
	}

			
}
