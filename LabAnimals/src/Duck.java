public class Duck extends Animal {
    private boolean canFly;

    public Duck(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public void swim() {
        System.out.println("Duck swimming...");
    }

    public void quack() {
        System.out.println("Quack!");
    }

    public void fly() {
        if(canFly) {
            System.out.println("Duck flying...");
        } else {
            System.out.println("This duck cannot fly.");
        }
    }

    public void makeSound() {
        System.out.println("Quack!");
    }
}
