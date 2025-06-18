package abstraction_interferance;



public class rectangle extends shape {

	public void area() {
		// TODO Auto-generated method stub
		int length=2;
		int width=4;
		System.out.println("rectangle:"+length*width);
	}
	public static void main(String[]agrs) {
		rectangle obj=new rectangle();
		obj.area();
		circle obj1=new circle();
		obj1.area();
	}

}
