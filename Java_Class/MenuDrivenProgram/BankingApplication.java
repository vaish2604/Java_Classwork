package JavaBasics;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        
        while (true) {
        	//DiSplay the menu
        	System.out.println("  Welcome to Simple Bank!");
        	System.out.println("1. Check Balance");
        	System.out.println("2. Deposit Money");
        	System.out.println("3. Withdraw Money");
        	System.out.println("4. Exit");
        	System.out.println("Enter Your Choice: ");
        	
        	//get user input
        	int choice = scanner.nextInt();
        	//process the choice
        	if(choice == 1) {
        		//check balance
        		System.out.println("Your current balance is: $"+ balance);
        	}else if (choice ==2) {
        		//deposit money
        		System.out.println("Enter amount to deposite: ");
        		double amount = scanner.nextDouble();
        		
        	if (amount > 0) {
        		balance += amount;
        		//balance=balance+amount
        		System.out.println("$" +amount+ "deposited sucessfully.");
        		} else {
        			System.out.println("Invalid amount.");
        			
        		}
        	
        	}else if (choice == 3) {
        		//Withdraw money
        		System.out.println("Enter amount to withdraw:");
        		double amount = scanner.nextDouble();
        		if (amount > 0 && amount <=balance) {
        			balance -= amount;
        			// balance=balnace-amount
        			System.out.println("$" +amount+ "withdrawn successfully.");
        			} else {
        				System.out.println("Invalid amount or insufficient funds.");
        		     	}
        			} else if (choice == 4) {
        				// Exit
        				System.out.println("Thank you for usinf Simple Bank. Goodbye!");
        				break;
        			} else {
        				// Invalid Choice
        				System.out.println("Invalid choice.Please try again.");
        			}
        	}
        	scanner.close();
        			}
        	}
        
