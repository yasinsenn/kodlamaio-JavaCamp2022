package kodlamaioDemo.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Dosyaya logland�: " + data);
		
	}

}
