package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}

// override edilmesini istemiyorsak final ile iþaretleyebiliriz.
// inherit eden sýnýflar hesapla metodunu bulundurmak zorunda 
// ayný zamanda hesapla metodunu override edip kendi türüne göre içerisini doldurmak zorunda
// sýnýfýn abstract olabilmesi için abstract yazýlmalý
// abstract sýnýflar abstract metot barýndýrmak zorunda deðildir
// abstract sýnýflar newlenemez newlenmesi için metotlar override edilmeli fakat bu kötü bir ullaným türüdür önerilmez.
// abstract sýnýflarýn avantajlarýndan biri; doldurulmasý zorunlu metotlar ekleyebiliriz 
