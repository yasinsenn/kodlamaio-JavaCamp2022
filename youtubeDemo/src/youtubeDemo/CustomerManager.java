package youtubeDemo;

public class CustomerManager {
	
	private Customer customer;
	ICreditManager creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}

	public void add() {
		System.out.println("M��teri eklendi: " );
	}
	
	public void delete() {
		System.out.println("M��teri silindi: ");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi" );
	}
	
}
