public class  Animal implements Speakable {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal eating...");
    }

    public void sleep() {
        System.out.println("Animal sleeping...");
    }

    // Getters and setters for the class attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(getName() + age + "year old...");
    }

    public void move() {
        System.out.println(getName() + " is moving...");
    }


    public void makeSound() {
        System.out.println("Animal sound");
    }


}
