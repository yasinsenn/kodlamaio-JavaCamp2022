package polymorphism;

public class FileLogger extends BaseLogger{
	public void log(String messsage) {
		System.out.println("Logged to file " + messsage);
	}

}
