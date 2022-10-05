import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
//	Account class is to return all the details being set in OptionMenu
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	/* Encapsulation is being used to hide the attributes 
	 * of the Account class - getters and setters - 
	 * */
	
//	local to the class - encapsulation
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	/* Set the customer number */
	
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	/* Get the customer number */
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	/* Set the pin number */
	
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	/* Get the pin number */
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	/* Get Checking Account Balance */
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	/* Get Saving Account Balance */
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	/* Calculate Checking Account withdrawal */
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}
	
	/* Calculate Checking Account withdrawal */
	public double calcSavingWithdraw(double amount) {
		savingBalance = (savingBalance - amount);
		return savingBalance;
	}
	
	/* Calculate Checking Deposit  */
	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}
	
	/* Calculate Checking Deposit  */
	public double calcSavingDeposit(double amount) {
		savingBalance = (savingBalance + amount);
		return savingBalance;
	}
	
	/* Customer Checking Account Withdraw Input */
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to withdraw from the Checking Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("The New Checking Account Balance: " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	/* Customer Saving Account Withdraw Input */
	
	public void getSavingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from the Checking Account: ");
		double amount = input.nextDouble();
		
		if((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("The New Saving Account Balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	
	/* Customer Checking Account Deposit Input */
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
		System.out.print("Amount you want to deposit from the Checking Account: ");
		double amount = input.nextDouble();
		
		if((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("The New Checking Account Balance: " + moneyFormat.format(checkingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	/* Customer Saving Account Deposit Input */
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to deposit from the Checking Account: ");
		double amount = input.nextDouble();
		
		if((savingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("The New Saving Account Balance: " + moneyFormat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	

}
