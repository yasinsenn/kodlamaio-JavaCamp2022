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
// isEmpty boþsa anlamýnda baþýna koyulan ünlem "deðilse" anlamýnda yani isim boþ deðilse dedik
// bir metodu static yaparsak sýnýfý newlemeden direkt sýnýf ismiyle o metoda eriþebiliriz