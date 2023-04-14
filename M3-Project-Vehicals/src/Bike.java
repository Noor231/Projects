class Bike extends Vehicle {
    private String model;
    private boolean isElectric;

    public void wheelie() {
        System.out.println("Bike doing a wheelie...");
    }


    public void expelsCO2() {
        System.out.println("This bike expels 50 grams of CO2 per kilometer.");
    }
}
/* fase 1
class Bike {
    private String model;
    private boolean isElectric;
    private double fuelCapacity;

    public void start() {
        System.out.println("Bike starting...");
    }

    public void stop() {
        System.out.println("Bike stopping...");
    }

    public void wheelie() {
        System.out.println("Bike doing a wheelie...");
    }
} */