package loopDemo;

public class Main {

	public static void main(String[] args) {

		// for d�ng�s�

		// i+=2 ifadesi de�i�kene 2 ekler �rnekteki 10 a kadar olan �ift say�lar� bulmak
		// i�i kullanabiliriz
		for (int i = 1; i < 10; i++) {

			System.out.println(i);

		}
		System.out.println("For d�ng�s� bitti");

		// while d�ng�s�
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While d�ng�s� bitti");

		// do while d�ng�s�
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);
		System.out.println("Do While d�ng�s� bitti");
	}

}
