package youtubeDemo;

public class Company extends Customer {

	private String companyName;
	private String taxNumber;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String companyName, String taxNumber) {
		super();
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	
	
	

}
