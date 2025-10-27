public class Main {
    public static void main(String[] args) {

        Moped moped= new Moped();
        moped.setColor("blue");
        moped.setMaxWeight(100);
        System.out.println("Max weight of moped "+moped.getMaxWeight());


        Car car=new Car();
        car.openTrunk();
        car.setFuelCapacity(25);
        System.out.println(car.getFuelCapacity());



        SemiTruck semi= new SemiTruck();
        semi.setNumberOfPassengers(100);
        System.out.println(semi.getNumberOfPassengers());

        HoverCraft craft= new HoverCraft();
        craft.setAirCushionPressure(20);
        System.out.println(craft.getAirCushionPressure());

        craft.accelerate();
        craft.brake();
    }
}
