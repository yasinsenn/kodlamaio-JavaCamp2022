package methodOverloading;

public class DortIslem {

	public int topla(int sayi1, int sayi2) {

		return sayi1 + sayi2;
	}

	public int topla(int sayi1, int sayi2, int sayi3) {

		return sayi1 + sayi2 + sayi3;
	}

	// ikisi de ayný isimli fakat ayný þeyler deðil
	// topla metodunu kullanýrken hem 2 parametreli hem de 3 parametreli lan çýkacak
	// ihtiyaca göre birini kullanýrýz, 2 parametre de versek 3 parametre de versek hata almayýz
	// bu yönteme overloading denir
}
