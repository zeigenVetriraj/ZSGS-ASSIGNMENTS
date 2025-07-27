
 
/*
2. Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using different methods.
*/

public class Payment {
    public static void main(String[] args) {
        CreditCardPayment ccp = new CreditCardPayment();
		DebitCardPayment dcp = new DebitCardPayment();
		UPIPayment upi = new UPIPayment();
		
		double payment = 0.00;
		payment += ccp.pay(220.31);
		payment += dcp.pay(52365.32);
		payment += upi.pay(258.65);
		
		System.out.println("Payments Resived : "+payment);
    }
}

interface PaymentMethod{
	public double pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
	@Override
	public double pay(double amount){
		return amount;
	}
}

class DebitCardPayment implements PaymentMethod{
	@Override
	public double pay(double amount){
		return amount;
	}
}

class UPIPayment implements PaymentMethod{
	@Override
	public double pay(double amount){
		return amount;
	}
}
