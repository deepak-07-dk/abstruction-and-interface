package abstraction_interferance;

public class cat extends animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("cat Meow");		
	}
	public static void main(String[]agrs) {
		animal obj=new dog();
		obj.makeSound();
		animal obj1=new cat();
		obj1.makeSound();
	}

}
