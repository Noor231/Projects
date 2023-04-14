public class App {
    public static void main(String[] args) {

        Car Car = new Car();
        Bike Bike = new Bike();
        Bus Bus = new Bus();
        Train Train = new Train();

        Vehicle[] vehicles = {Car, Bike, Bus,Train };


        for(Vehicle vehicle : vehicles) {
            vehicle.accelerate();
        }

        for(Vehicle vehicle : vehicles) {
            vehicle.brake();
        }

        for(Vehicle vehicle : vehicles) {
            vehicle.refuel();

        }


        for(Polluter Vehicle : vehicles) {
            Vehicle.expulsaCO2();
            Vehicle.carburant();

        }



    }
}
/*
public class App {
    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();

        Bike bike = new Bike();
        bike.start();

        Bus bus = new Bus();
        bus.brake();

        Train train = new Train();
        train.depart();
    }
}
*/