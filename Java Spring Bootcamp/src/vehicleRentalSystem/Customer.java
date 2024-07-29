package vehicleRentalSystem;

public abstract class Customer {
	
	public final String phoneNumber;
	
	public abstract boolean isAvailableForSUV();
	
	public Customer(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}  
}
