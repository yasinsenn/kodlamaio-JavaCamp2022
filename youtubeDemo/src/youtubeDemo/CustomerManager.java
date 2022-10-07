package youtubeDemo;

public class CustomerManager {
	
	private Customer customer;
	ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void add() {
		System.out.println("Müþteri eklendi: " );
	}
	
	public void delete() {
		System.out.println("Müþteri silindi: ");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi" );
	}
	
}
