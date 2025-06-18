package INTERFACE;

public class bike implements vehicle {
		public void move() {
			System.out.println("bike is moving");
   }
		public static void main(String[]agrs) {
			vehicle obj=new bike();
			obj.move();
			vehicle obj1=new car();
			obj1.move();
		}
}
