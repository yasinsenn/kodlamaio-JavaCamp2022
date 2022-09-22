package methods2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bug�n hava �ok g�zel";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi = topla(5,7);
		System.out.println(sayi);
		
		int total = topla2(1,2,3,4,5,6,7);
		System.out.println(total);
		
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("G�ncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	public static String sehirVer() {
		return "Ankara";
	}
	
	// variable argumnents (yukar�daki topla fonksiyonunda 2 say� ile s�n�rlad�k, hesap makinesi gibi istedi�imiz kadar say� g�ndermek i�in kullan�l�r) 
	// int sonuna 3 nokta koyarak dizi gibi yapt�k bu sayede istedi�imiz kadar say� g�nderebiliriz
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi; // toplam = toplam + sayi ile ayn� �ey
		}
		return toplam;
		
	}
	


}
