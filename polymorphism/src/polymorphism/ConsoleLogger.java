package polymorphism;

public class ConsoleLogger extends BaseLogger{
	public void log(String messsage) {
		System.out.println("Logged to console " + messsage);
	}
}
