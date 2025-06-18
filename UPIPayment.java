package abstraction_interferance;

public class UPIPayment extends Payment{

	@Override
	public void makePayment() {
		// TODO Auto-generated method stub
		System.out.println("UPIPayment");
	}
	public static void main(String[]agrs) {
		CreditCardPayment obj=new CreditCardPayment();
		obj.makePayment();
		Payment.printReceipt();
		UPIPayment obj1=new  UPIPayment();
		obj1.makePayment();
	}

}
