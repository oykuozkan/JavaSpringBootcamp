package vehicleRentalSystem;

public class Company extends Customer {
	private String nameOfCompany;
	private String taxNumber;
	
	public Company(String nameOfCompany,String phoneNumber,String taxNumber) {
		super(phoneNumber);
		this.nameOfCompany=nameOfCompany;
		this.taxNumber=taxNumber;
	}
	
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	
	public String getTaxNumber() {
		return taxNumber;	
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	@Override
	public boolean isAvailableForSUV() {
		return true;
	}
  }
