package abstractClasses;

public abstract class GameCalculator {

	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}

// override edilmesini istemiyorsak final ile i�aretleyebiliriz.
// inherit eden s�n�flar hesapla metodunu bulundurmak zorunda 
// ayn� zamanda hesapla metodunu override edip kendi t�r�ne g�re i�erisini doldurmak zorunda
// s�n�f�n abstract olabilmesi i�in abstract yaz�lmal�
// abstract s�n�flar abstract metot bar�nd�rmak zorunda de�ildir
// abstract s�n�flar newlenemez newlenmesi i�in metotlar override edilmeli fakat bu k�t� bir ullan�m t�r�d�r �nerilmez.
// abstract s�n�flar�n avantajlar�ndan biri; doldurulmas� zorunlu metotlar ekleyebiliriz 
