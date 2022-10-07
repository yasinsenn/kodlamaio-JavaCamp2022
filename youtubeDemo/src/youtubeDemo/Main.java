package youtubeDemo;

public class Main {

	public static void main(String[] args) {

		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		Company company = new Company();
		company.setCompanyName("Arçelik");
		company.setId(100);
		company.setTaxNumber("123456");

		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();

		CustomerManager customerManager = new CustomerManager(new Company(), new TeacherCreditManager());
		customerManager.add();
		customerManager.giveCredit();

	}

}
