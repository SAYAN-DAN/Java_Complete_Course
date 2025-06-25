class Car {
    // Final fields (cannot be changed once initialized)
    final double carPrice;
    final double fuelInCar;
    final String carModel;

    // Constructor to initialize the final fields
    public Car(double carPrice, double fuelInCar, String carModel) {
        this.carPrice = carPrice;
        this.fuelInCar = fuelInCar;
        this.carModel = carModel;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Model: " + carModel);
        System.out.println("Car Price: " + carPrice);
        System.out.println("Fuel in Car: " + fuelInCar + " liters");
    }
}

// Example usage
public class car_name {
    public static void main(String[] args) {
        Car myCar = new Car(850000.00, 25.5, "Hyundai i20");
        myCar.displayDetails();
    }
}
