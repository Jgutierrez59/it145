
public class Monkey extends RescueAnimal {

    // Instance variables specific to Monkey
    private String species;
    private double tailLength;
    private double height;
    private double bodyLength;

    // constructor for Monkey
    public Monkey(String name, String species, String gender, String age, String weight, String acquisitionDate,
                  String acquisitionCountry, String trainingStatus, boolean reserved, String inServiceCountry,
                  double tailLength, double height, double bodyLength) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
    }

    // Accessor and mutator methods
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(double bodyLength) {
        this.bodyLength = bodyLength;
    }
}