import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends /*Access Modifiers*/ Account {
	
	int selection;

	Scanner menuInput = new Scanner(System.in); //created an instance of the menuInput object
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	/* Validate the customer's login information */
	
	public void getLogin() throws IOException {
		int x = 1; // Initialization
		
		do {
			try {
				data.put(98765,1234);
				data.put(12345,6789);
				
				System.out.println("Welcome to Bank of America!");
				
				System.out.println("Enter your Customer Number: ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your Pin Number: ");
				setPinNumber(menuInput.nextInt());
				
				System.out.println();
				
			} 
			catch(Exception e) {
				System.out.println("\n" + "You have entered invalid character(s). Only numbers" + "\n");
				x = 2;
			}
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				if(entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
			
		}while(x == 1);
	}
	
	/* Display Account Type Menu with selection */
	
	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("Press 1 : Checking Account");
		System.out.println("Press 2 : Saving Account");
		System.out.println("Press 3 : Exit Account");
		System.out.print("Choice: ");
		System.out.println();
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you for banking with BOFA, Good-Bye");
			break;
		
		default:
			System.out.println("\n"+ "Invalid choice" + "\n");
			getAccountType();
		}
	}
	
	public void getChecking() {
		System.out.println("Checking Account: ");
		System.out.println("Press 1 : View Balance");
		System.out.println("Press 2 : Withdraw Funds");
		System.out.println("Press 3 : Deposit Funds");
		System.out.println("Press 4 : Exit");
		System.out.print("Choice: ");
		System.out.println();
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance: " + moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for banking with BOFA, Good-Bye");
			break;
		
		default:
			System.out.println("\n"+ "Invalid choice" + "\n");
			getAccountType();
		}
	}
	
	public void getSaving() {
		System.out.println("Saving Account: ");
		System.out.println("Press 1 : View Balance");
		System.out.println("Press 2 : Withdraw Funds");
		System.out.println("Press 3 : Deposit Funds");
		System.out.println("Press 4 : Exit");
		System.out.print("Choice: ");
		System.out.println();
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you for banking with BOFA, Good-Bye");
			break;
		
		default:
			System.out.println("\n"+ "Invalid choice" + "\n");
			getAccountType();
		}
	}
	
	
}
