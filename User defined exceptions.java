/*package whatever //do not write package name here */

import java.io.*;

class InsufficientFunds extends Exception{
    
    InsufficientFunds(int balance){
        super("Insufficient funds because of balance equal to : " + balance);
    }
}

class BankAccount{
    
    private int balance;
    
    BankAccount(int balance){
        this.balance = balance;
    }
    
    public void withdraw(int amount) throws InsufficientFunds{
        
        if(amount > balance){
            System.out.println("Can't withdraw");
            throw new InsufficientFunds(this.balance);
        }
        
        this.balance -= amount;
        
        System.out.println("Remaining Balance is : " + this.balance);
    }
}

class GFG {
	public static void main (String[] args) {
		
		BankAccount b1 = new BankAccount(1000);
		
		try{
		    b1.withdraw(1500);
		}
		
		catch(InsufficientFunds e){
		    e.printStackTrace();
		    System.out.println(e.getMessage());
		}
		
		System.out.println("Inside main function");
	}
}