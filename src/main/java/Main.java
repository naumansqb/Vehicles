public class Main {
    public static void main(String[] args) {

        Moped moped = new Moped("Vespa", "blue", 60, 5, 2, 20, 100);
        System.out.println("Max weight of moped " + moped.getMaxWeight());

        Vehicle v = new Vehicle("Ford", "black", 180, 50, 5, 400);

        Car car = new Car("Toyota", "red", 200, 55, 5, 450, 4);
        car.openTrunk();
        car.setFuelCapacity(25);
        System.out.println(car.getFuelCapacity());

        SemiTruck semi = new SemiTruck("SemiTruck", "white", 120, 300, 2, 20000, 2);
        semi.setNumberOfPassengers(3);
        System.out.println(semi.getNumberOfPassengers());

        HoverCraft craft = new HoverCraft("IDK", "grey", 80, 40, 4, 300, 20);
        craft.setAirCushionPressure(25);
        System.out.println(craft.getAirCushionPressure());

        craft.accelerate();
        craft.brake();
    }
}
