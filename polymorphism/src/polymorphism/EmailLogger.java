package polymorphism;

public class EmailLogger extends BaseLogger {
	public void log(String messsage) {
		System.out.println("Logged to email " + messsage);
	}
}
