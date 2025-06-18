package INTERFACE;

public interface Playable {
	public void playable();
	public static void main(String[]agrs) {
		Playable obj=new Guitar();
		obj.playable();
		Playable obj1=new Piano();
		obj1.playable();
	}

}
