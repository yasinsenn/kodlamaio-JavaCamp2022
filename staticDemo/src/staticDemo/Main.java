package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product1 = new Product();
		product1.price= 10;
		product1.name="Mouse";
		
		productManager.add(product1);
		
		DatabaseHelper.Connection.connectCreation();
	}

}
