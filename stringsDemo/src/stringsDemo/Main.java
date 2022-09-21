package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayýsý : " + mesaj.length());
		System.out.println("5. eleman : " + mesaj.charAt(4)); // index numarasý 4 olan eleman 5. elemandýr
		System.out.println(mesaj.concat(" Yaþasýn")); // " Yaþasýn" ifadesi ile mesaj deðerini birleþtirir
		System.out.println(mesaj.startsWith("B")); // B ile baþlýyorsa true döndürür (büyük-küçük harf duyarlý)
		System.out.println(mesaj.endsWith("."));

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		// 0 ile 5. index arasýný al karakterler listesine ata( 5. index dahil deðil)
		// atamaya 0. index ile baþla ( sondaki 0 ýn olduðu kýsýmda belirttik)

		System.out.println(karakterler); // sonuç ------>>>> Bugün

		System.out.println(mesaj.indexOf("a")); // string ifadenin kaçýncý indexte olduðunu sol taraftan tarayarak bulur
												// birden fazla a varsa ilk bulduðunu yazar

		System.out.println("-------------PART 2----------------");

		System.out.println(mesaj.replace(" ", "-")); // boþluk olan yerleri - ile deðiþtirir
		System.out.println(mesaj.substring(2, 5)); // 2. index ile 5. index arasýný alýr 5. index dahil deðil

		// split kelimeleri belirtilen ifadeye göre böler
		// örnekte boþluk gördüðü anda bölüyor
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase()); // hepsini küçük harf yapar
		System.out.println(mesaj.toUpperCase()); // hepsini büyük harfyapar

	}

}
