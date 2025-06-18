package INTERFACE;

public class photo implements printable {

	@Override
	public void printable() {
		// TODO Auto-generated method stub
		System.out.println("photo");
		
	}
	public static void main(String[]agrs) {
		printable obj=new document();
		obj.printable();
		printable obj1=new photo();
		obj1.printable();
	}

}
