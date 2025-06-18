package abstraction_interferance;

public abstract class Payment {
	public abstract void makePayment();
	public static void printReceipt() {
		System.out.println("printReceipt");
	}

}
