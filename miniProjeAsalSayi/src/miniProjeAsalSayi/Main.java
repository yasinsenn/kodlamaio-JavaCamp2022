package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 27;
		int reminder = number % 2; // mod 2 --- 2 ye b�l�m�nden kalan
		// System.out.println(reminder);

		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Asal say� de�ildir");
			return;
		}

		if (number < 1) {
			System.out.println("Ge�ersiz say� girdiniz");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}

		if (isPrime == true) {
			System.out.println("Say� asald�r");
		} else {
			System.out.println("Say� asal de�ildir");
		}

	}

}
