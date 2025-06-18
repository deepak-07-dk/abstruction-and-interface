package abstraction_interferance;

public class manager extends employee {

	@Override
	public void calculatemethod() {
		// TODO Auto-generated method stub
		String name="raja";
		int salary=250000;
		System.out.println("managername:"+name);
		System.out.println("managersalary:"+salary);
		
	}
	public static void main(String[]agrs) {
		employee obj=new developer();
		obj.calculatemethod();
		employee obj1=new manager();
		obj1.calculatemethod();

}
}
