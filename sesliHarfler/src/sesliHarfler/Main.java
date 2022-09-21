package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'b';

		switch (harf) {
		case 'A', 'I', 'O', 'U':
			System.out.println("Kalýn - Büyük sesli harf");
			break;
		case 'a', 'ý', 'o', 'u':
			System.out.println("Kalýn - Küçük sesli harf");
			break;
		case 'E', 'Ý', 'Ö', 'Ü':
			System.out.println("Ýnce - Büyük sesli harf");
			break;
		case 'e', 'i', 'ö', 'ü':
			System.out.println("Ýnce - Küçük sesli harf");
			break;
		default:
			System.out.println("Girilen harf sessiz harftir...");
		}

	}
}
