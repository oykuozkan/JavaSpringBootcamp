package vehicleRentalSystem;

public abstract class Vehicle {
	public String typeOfCar;
	public String brand;
	public String series;
	public String color;
	public String typeOfGear;
	public String segment;
	public double dailyCost;
	public int age;
	public int KM;
	public boolean isSecondHand;
	
	public Vehicle(String typeOfCar,String brand,String series,String color,String typeOfGear,String segment,double dailyCost,int age,int KM,boolean isSecondHand) {
		this.typeOfCar=typeOfCar;
		this.brand=brand;
		this.series=series;
		this.color=color;
		this.typeOfGear=typeOfGear;
		this.segment=segment;
		this.dailyCost=dailyCost;
		this.age=age;
		this.KM=KM;
		this.isSecondHand=isSecondHand;
	}
	
	public String getTypeOfCar() {
		return typeOfCar;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getSeries() {
		return series;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getTypeOfGear() {
		return typeOfGear;
	}
	
	public String getSegment() {
		return segment;
	}
	
	public double getDailyCost() {
		return dailyCost;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getKM() {
		return KM;
	}
	
	public boolean getIsSecondHand() {
		return isSecondHand;	
	}
	
    @Override
	public String toString() {
	    return 
	    		"Type=" + typeOfCar +
	            ", Brand=" + brand +
	            ", Series=" + series +
	            ", Color=" + color +
	            ", Gear type=" + typeOfGear +
	            ", Segment=" + segment +
	            ", Daily Cost=" + dailyCost +
	            ", Age=" + age +
	            ", KM=" + KM +
	            ", Is it second hand? " + isSecondHand ;
	  }
    
	public abstract double getMonthlyCost();	
}
