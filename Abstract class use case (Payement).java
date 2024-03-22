import java.io.*;

abstract class paymentMethod{
    
    abstract public void pay(int amount); 
}

class UPI extends paymentMethod{
    
    public void pay(int amount){
        System.out.println("Payment made via UPI for amount " + amount);
    }
}

class CreditCard extends paymentMethod{
    
    public void pay(int amount){
        System.out.println("Payment made via Credit Card for amount " + amount);
    }
}

class GFG {
    
	public static void main (String[] args) {
	    /*
	    CreditCard obj1 = new CreditCard();
	    obj1.pay();
	    
	    UPI obj2 = new UPI();
	    obj2.pay();
	    */
	    
	    paymentMethod obj = new CreditCard();
	    obj = new UPI();
	    obj.pay(1000);
	    
		
	}
}