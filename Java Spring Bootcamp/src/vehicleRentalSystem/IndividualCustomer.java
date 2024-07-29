package vehicleRentalSystem;

public class IndividualCustomer extends Customer {
	private String nameOfUser;
	private String idNumber;
	
	public IndividualCustomer(String nameOfUser,String phoneNumber,String idNumber) {
		super(phoneNumber);
		this.nameOfUser=nameOfUser;
		this.idNumber=idNumber;
	}
	
	public String getIdNumber() {
        return idNumber;
    }
	
	@Override
	public boolean isAvailableForSUV() {
		return false;
	}
}
