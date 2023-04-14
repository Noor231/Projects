// Speakable.java

public interface Speakable {
    void makeSound();
    default void organ() {
        System.out.println("I speak with my mouth");
    }
}
