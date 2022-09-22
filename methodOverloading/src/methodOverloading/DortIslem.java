package methodOverloading;

public class DortIslem {

	public int topla(int sayi1, int sayi2) {

		return sayi1 + sayi2;
	}

	public int topla(int sayi1, int sayi2, int sayi3) {

		return sayi1 + sayi2 + sayi3;
	}

	// ikisi de ayn� isimli fakat ayn� �eyler de�il
	// topla metodunu kullan�rken hem 2 parametreli hem de 3 parametreli lan ��kacak
	// ihtiyaca g�re birini kullan�r�z, 2 parametre de versek 3 parametre de versek hata almay�z
	// bu y�nteme overloading denir
}
