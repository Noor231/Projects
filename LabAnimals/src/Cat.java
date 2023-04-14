public class Cat extends Animal {
    private String color;
    private double weight;

    public Cat(String name, int age, String color, double weight) {
        super(name, age);
        this.color = color;
        this.weight = weight;
    }

    public void walk() {
        System.out.println("Cat walking...");
    }

    public void meow() {
        System.out.println("Meow!");
    }
    public void makeSound() {
        System.out.println("Meow!");
    }
}
