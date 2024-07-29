package vehicleRentalSystem;

public class SUV extends Vehicle {
	public SUV(String typeOfCar,String brand,String series,String color,String typeOfGear,String segment,double dailyCost,int age,int KM,boolean isSecondHand) {
		super(typeOfCar,brand,series,color,typeOfGear,segment,dailyCost,age,KM,isSecondHand);	
	}
	
	@Override
	public double getMonthlyCost() {
		throw new UnavailableMonthlyRentalException("SUV cars cannot be rented monthly!");
	}
}
