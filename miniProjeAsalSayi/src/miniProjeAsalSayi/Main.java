package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 27;
		int reminder = number % 2; // mod 2 --- 2 ye bölümünden kalan
		// System.out.println(reminder);

		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Asal sayý deðildir");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz sayý girdiniz");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime == true) {
			System.out.println("Sayý asaldýr");
		} else {
			System.out.println("Sayý asal deðildir");
		}

	}

}
