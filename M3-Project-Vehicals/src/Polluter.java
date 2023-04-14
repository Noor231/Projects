public interface Polluter {

    void expulsaCO2();
    default void carburant() {
        System.out.println("My carburant is Gasoline");
    }
}
