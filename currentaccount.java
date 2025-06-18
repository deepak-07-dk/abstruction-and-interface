package abstraction_interferance;

public class currentaccount extends bankAccount{

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		int curr=352000;
		System.out.println("current account:"+curr);
		
	}
	public static void main(String[]agrs) {
		SavingsAccount obj=new SavingsAccount();
		obj.withdraw();
		currentaccount obj1=new currentaccount();
		obj1.withdraw();
	}

}
