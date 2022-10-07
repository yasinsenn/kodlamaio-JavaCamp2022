package polymorphism;

public class DatabaseLogger extends BaseLogger {
	public void log(String messsage) {
		System.out.println("Logged to database " + messsage);
	}
}
