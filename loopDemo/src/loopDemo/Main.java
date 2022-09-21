package loopDemo;

public class Main {

	public static void main(String[] args) {

		// for döngüsü

		// i+=2 ifadesi deðiþkene 2 ekler örnekteki 10 a kadar olan çift sayýlarý bulmak
		// içi kullanabiliriz
		for (int i = 1; i < 10; i++) {

			System.out.println(i);

		}
		System.out.println("For döngüsü bitti");

		// while döngüsü
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti");

		// do while döngüsü
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j < 10);
		System.out.println("Do While döngüsü bitti");
	}

}
