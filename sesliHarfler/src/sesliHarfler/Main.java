package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'b';

		switch (harf) {
		case 'A', 'I', 'O', 'U':
			System.out.println("Kal�n - B�y�k sesli harf");
			break;
		case 'a', '�', 'o', 'u':
			System.out.println("Kal�n - K���k sesli harf");
			break;
		case 'E', '�', '�', '�':
			System.out.println("�nce - B�y�k sesli harf");
			break;
		case 'e', 'i', '�', '�':
			System.out.println("�nce - K���k sesli harf");
			break;
		default:
			System.out.println("Girilen harf sessiz harftir...");
		}

	}
}
