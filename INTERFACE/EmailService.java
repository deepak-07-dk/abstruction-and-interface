package INTERFACE;

public class EmailService implements MessageService {
	public void logMessage() {
		System.out.println("email service");
	}
	public static void main(String[]agrs) {
		EmailService obj=new EmailService();
		obj.logMessage();
		obj.sendMessage();
	}
}
