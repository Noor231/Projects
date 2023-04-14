public class Cow extends Animal {
    private String breed;
    private boolean isMilkProducing;

    public Cow(String name, int age, String breed, boolean isMilkProducing) {
        super(name, age);
        this.breed = breed;
        this.isMilkProducing = isMilkProducing;
    }

    public void moo() {
        System.out.println("Moo!");
    }

    public void eat() {
        System.out.println("Cow eating grass...");
    }

    // Getters and setters for the class attributes
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isMilkProducing() {
        return isMilkProducing;
    }

    public void setMilkProducing(boolean isMilkProducing) {
        this.isMilkProducing = isMilkProducing;
    }

    public void makeSound() {
        System.out.println("Moo!");
    }
}
