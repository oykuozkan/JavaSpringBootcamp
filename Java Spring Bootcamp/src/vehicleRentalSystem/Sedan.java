package vehicleRentalSystem;

public class Sedan extends Vehicle {
	public Sedan(String typeOfCar,String brand,String series,String color,String typeOfGear,String segment,double dailyCost,int age,int KM,boolean isSecondHand) {
		super(typeOfCar,brand, series,color,typeOfGear,segment,dailyCost,age,KM,isSecondHand);
	}
	
	@Override
	public double getMonthlyCost() {
		double monthlyCost= dailyCost*30;
		return monthlyCost-(monthlyCost*0.07);
	}
}
