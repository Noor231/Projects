public class Bacteria extends Animal {
    private String species;
    private String habitat;

    public Bacteria(String name, int age, String species, String habitat) {
        super(name, age);
        this.species = species;
        this.habitat = habitat;
    }

    // Getters and setters for the class attributes
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void reproduce() {
        System.out.println("Bacteria reproducing...");
    }
}
