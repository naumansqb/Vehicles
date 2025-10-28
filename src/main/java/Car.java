public class Car extends Vehicle {
    private int  numberOfDoors;

    public Car(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int numberOfDoors) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openTrunk(){
        System.out.println("Opening trunk");
    }
    public void closeTrunk(){
        System.out.println("Closing trunk");
    }
}
