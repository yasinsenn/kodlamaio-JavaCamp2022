package staticDemo;

public class ProductValidator {

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		 
	}
	
}
// isEmpty bo�sa anlam�nda ba��na koyulan �nlem "de�ilse" anlam�nda yani isim bo� de�ilse dedik
// bir metodu static yaparsak s�n�f� newlemeden direkt s�n�f ismiyle o metoda eri�ebiliriz