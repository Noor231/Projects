
class Vehicle implements Polluter{
    protected String fuelType;
    protected double fuelCapacity;
    protected double currentSpeed;




    public void accelerate() {
        System.out.println("Vehicle accelrating: " + getClass().getSimpleName() );
    }

    public void brake() {
        System.out.println("Vehicle braking: "  + getClass().getSimpleName());
    }

    public void refuel() {
        System.out.println("Vehicle refueling: "  + getClass().getSimpleName());
    }

    public  void expulsaCO2() {
        System.out.println( getClass().getSimpleName() +": Expluso co2");
    }



}


