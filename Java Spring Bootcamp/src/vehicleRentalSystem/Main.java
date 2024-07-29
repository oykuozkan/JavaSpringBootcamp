package vehicleRentalSystem;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Vehicle> cars = new ArrayList<>();

        cars.add(new Sedan("Sedan", "Honda", "Civic", "Black", "Automatic", "C", 30.0, 7, 200000, false));
        cars.add(new Sedan("Sedan", "Honda", "Accord", "Silver Grey", "Manual", "D", 40.0, 10, 50000, true));
        cars.add(new SUV("SUV", "Toyota", "Corolla", "Black", "Automatic", "C", 50.0, 1, 25000, false));
        cars.add(new SUV("SUV", "Volkswagen", "Tiguan", "White", "Automatic", "C", 35.0, 2, 120000, true));
        cars.add(new Hatchback("Hatchback", "Ford", "Focus", "White", "Manual", "C", 30.0, 10, 15000, true));
        cars.add(new Sedan("Sedan", "Volkswagen", "Passat", "Black", "Automatic", "D", 35.0, 4, 100000, false));

        while (true) {
            try {
                System.out.println("Enter a customer type: (Company or Individual)");
                String customerType = input.nextLine();

                if (customerType.equalsIgnoreCase("Company")) {
                    String nameOfCompany = getInformation("Enter the name of the company:", input);
                    String phoneNumber = getInformation("Enter your phone number:", input);
                    String taxNumber = getInformation("Enter the tax number of the company:", input);

                    Company customer1 = new Company(nameOfCompany, phoneNumber, taxNumber);
                    
                    availableRentalCars(cars, customer1);

                } else if (customerType.equalsIgnoreCase("Individual")) {
                    String nameOfUser = getInformation("Enter your name:", input);
                    String phoneNumber = getInformation("Enter your phone number:", input);
                    String idNumber = getInformation("Enter your ID number:", input);

                    IndividualCustomer customer2 = new IndividualCustomer(nameOfUser, phoneNumber, idNumber);
                    
                    availableRentalCars(cars, customer2);

                } else {
                    System.out.println("You must enter a valid choice!");
                }
            } catch (EmptyFieldException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    private static void availableRentalCars(List<Vehicle> cars, Customer user) {
        System.out.println("These are the cars that you can rent:");
        
        for (Vehicle car : cars) {
            if (!(car instanceof SUV && user instanceof IndividualCustomer)) {
                System.out.println(car);
                
                System.out.println("Daily Cost: " + car.getDailyCost());
                try {
                    System.out.println("Monthly Cost: " + car.getMonthlyCost());
                } catch (UnavailableMonthlyRentalException e) {
                    System.out.println("Monthly Cost: " + e.getMessage());
                }
            }
        }
    }

    private static String getInformation(String i, Scanner input) throws EmptyFieldException {
        System.out.println(i);
        String value = input.nextLine();
        if (value.trim().isEmpty()) {
            throw new EmptyFieldException("You should enter your information.");
        }
        return value;
    }   
}