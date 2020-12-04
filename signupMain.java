package objectOriented.Banking;

import java.util.Scanner;

public class signupMain{

public void Register() {

	try (Scanner userInput = new Scanner(System.in)) {
			
			String firstName,lastName,middleName,gender;
			
			System.out.print("--Sign up--\n\n");
			System.out.print("First name: ");
			firstName = userInput.next();
			
			System.out.print("Last name: ");
			lastName = userInput.next();
			
			System.out.print("Middle name: ");
			middleName = userInput.next();
			
			System.out.print("Gender: ");
			gender = userInput.next();
			
			System.out.print("Your age: ");
			byte age = userInput.nextByte();
			
			accountSignup signup = new accountSignup(firstName,lastName,middleName,gender,age);
			signup.setFirstName(firstName);
			signup.setLastName(lastName);
			signup.setMiddleName(middleName);
			signup.setGender(gender);
			signup.setAge(age);
			
			System.out.println("\n--Sign up successfully--");
			System.out.println(signup);
			}
		}

}
