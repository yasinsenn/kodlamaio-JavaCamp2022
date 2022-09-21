package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);

		System.out.println("Eleman say�s� : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4)); // index numaras� 4 olan eleman 5. elemand�r
		System.out.println(mesaj.concat(" Ya�as�n")); // " Ya�as�n" ifadesi ile mesaj de�erini birle�tirir
		System.out.println(mesaj.startsWith("B")); // B ile ba�l�yorsa true d�nd�r�r (b�y�k-k���k harf duyarl�)
		System.out.println(mesaj.endsWith("."));

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		// 0 ile 5. index aras�n� al karakterler listesine ata( 5. index dahil de�il)
		// atamaya 0. index ile ba�la ( sondaki 0 �n oldu�u k�s�mda belirttik)

		System.out.println(karakterler); // sonu� ------>>>> Bug�n

		System.out.println(mesaj.indexOf("a")); // string ifadenin ka��nc� indexte oldu�unu sol taraftan tarayarak bulur
												// birden fazla a varsa ilk buldu�unu yazar

		System.out.println("-------------PART 2----------------");

		System.out.println(mesaj.replace(" ", "-")); // bo�luk olan yerleri - ile de�i�tirir
		System.out.println(mesaj.substring(2, 5)); // 2. index ile 5. index aras�n� al�r 5. index dahil de�il

		// split kelimeleri belirtilen ifadeye g�re b�ler
		// �rnekte bo�luk g�rd��� anda b�l�yor
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // hepsini k���k harf yapar
		System.out.println(mesaj.toUpperCase()); // hepsini b�y�k harfyapar

	}

}
