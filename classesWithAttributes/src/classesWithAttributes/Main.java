package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		// parametreli constructor ile bu �ekilde de verebiliriz
		// parametresiz consructor da olu�turulur iste�e g�re alttaki �ekilde de set edebiliriz
		Product product = new Product(1,"Laptop", "Asus laptop", 5000,3,"Siyah");
		
//		Product product = new Product();
//		product.setId(1);
//		product.setName("Laptop"); 
//		product.setDescription("Asus Laptop");
//		product.setPrice(5000);
//		product.setStockAmount(3);
//		product.setRenk("Siyah");
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());

	}

}
