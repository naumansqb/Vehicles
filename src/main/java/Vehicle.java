public class Vehicle {
    private String model;
    private String color;
    private int topSpeed;
    private int fuelCapacity;
    private int numberOfPassengers;
    private int cargoCapacity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void startEngine(){
        System.out.println("Starting Engine");
    }
    public void stopEngine(){
        System.out.println("Stopping Engine");
    }
    public void accelerate(){
        System.out.println("Accelerating");
    }
    public void brake(){
        System.out.println("Braking");
    }
}
