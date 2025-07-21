
public class Dog extends Pet {
	
    // Private attributes specific to Dog
    private int dogSpaceNumber;
    private double dogWeight;
    private boolean grooming;

    // Constructor to initialize all attributes, including those from Pet
    public Dog(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue, int dogSpaceNumber, double dogWeight, boolean grooming) {
        super(petType, petName, petAge, dogSpaces, catSpaces, daysStay, amountDue);
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }

    // Accessors and mutators for Dog-specific attributes
    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }

    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }

    public double getDogWeight() {
        return dogWeight;
    }

    public void setDogWeight(double dogWeight) {
        this.dogWeight = dogWeight;
    }

    public boolean getGrooming() {
        return grooming;
    }

    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }
}