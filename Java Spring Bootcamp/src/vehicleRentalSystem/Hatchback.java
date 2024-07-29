package vehicleRentalSystem;

public class Hatchback extends Vehicle {
	public Hatchback(String typeOfCar,String brand,String series,String color,String typeOfGear,String segment,double dailyCost,int age,int KM,boolean isSecondHand) {
		super(typeOfCar,brand,series,color,typeOfGear,segment,dailyCost,age,KM,isSecondHand);
	}
	
	@Override
	public double getMonthlyCost() {
		double dailyCost = getDailyCost();
        double coefficient = getCoefficient(getSegment());
        return dailyCost * coefficient* 30;
	}
	
	private double getCoefficient(String segment) {
		
		switch(segment) {
		case "A":
			return 0.5;
		case "B":
			return 1;
		case "C":
			return 1.5;
		case "D":
			return 2;
		case "E":
			return 2.5;
		default: 
			throw new IllegalArgumentException("This is not a valid segment type!");
		}
	}

}
