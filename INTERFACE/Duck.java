package INTERFACE;

public class Duck implements Flyable,Swimmable{
		

		@Override
		public void swim() {
			// TODO Auto-generated method stub
			System.out.println("swimmable");
			
		}

		@Override
		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("flyable");
		}
	
	public static void main(String[]agrs) {
		Duck obj=new Duck();
		obj.swim();
		obj.fly();
	}

}
