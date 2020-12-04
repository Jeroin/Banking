package objectOriented.Banking;

import java.util.Scanner;

public class bankAccount extends signupMain {

	public static void main(String[] args) {
		

		signupMain register = new signupMain();
		register.Register();
		
		Scanner userInput = new Scanner(System.in);
			//Properties
			String cvv,cardHolder;
			int expDate,secCode;
			
		    System.out.println("\n--Enter ATM Card Information to Log In--\n");
		    
			System.out.print("Card Verification Value: ");
			cvv = userInput.next();			
			
			System.out.print("Expiration Date(mm/dd/yy): ");
			expDate = userInput.nextInt();
			
			System.out.print("Security Code: ");
			secCode = userInput.nextInt();
			
			System.out.print("Card Holder: ");
			cardHolder = userInput.next();
			
			bankInformation account = new bankInformation(cvv,expDate,secCode,cardHolder);
			
			account.setCardverificationValue(cvv);
			account.setExpirationDate(expDate);
			account.setSecurityCode(secCode);
			account.setCardHolder(cardHolder);

			System.out.println("\n--Log in successfuly--");
			System.out.println("\n--ATM Card Information--");
			System.out.println(account);
			
			userInput.close();
			
	}
}
