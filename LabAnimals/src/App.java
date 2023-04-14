public class App {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];

        Cat cat = new Cat("Whiskers", 3, "black", 5.0);
        Duck duck = new Duck("Daffy", 2, true);
        Cow cow = new Cow("Bessie", 4, "Jersey", true);
        Bacteria bacteria = new Bacteria("E. coli", 12 , "Gram-negative","mowing");

        animals[0] = cat;
        animals[1] = duck;
        animals[2] = cow;
        animals[3] = bacteria;

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " is " + animal.getAge() + " years old.");

        }

        for (Speakable animal : animals) {
            animal.makeSound();
            animal.organ();
    }
}}
