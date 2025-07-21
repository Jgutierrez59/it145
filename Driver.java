import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	// List to store dog objects
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    // List to store monkey objects
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	initializeDogList();
        initializeMonkeyList();
        
        // Main menu loop
        while (true) {
        	// Display menu options
        	displayMenu();
        	String choice = scanner.nextLine();
        	switch (choice) {
        	case "1": // Intake new dog
        		intakeNewDog(scanner);
        		break;
        	case "2": // Intake new monkey
        		intakeNewMonkey(scanner);
        		break;
        	case "3": // Reserve an animal
        		reserveAnimal(scanner);
        		break;
        	case "4": // Print list of all dogs
        		printAnimals("dog");
        		break;
        	case "5": // Print list of all monkeys
        		printAnimals("monkey");
        		break;
        	case "6": // Print list of all available animals
        		printAnimals("available");
        		break;
        	case "q": // Exit application
        		System.out.println("Exiting application");
        		scanner.close();
        		System.exit(0);
        	default: // Handle invalid input
        		System.out.println("Invalid choice. Please input a valid option.");
        	}
        }
    }


    
    // Method to display the menu
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Method to initialize the dog list with test data
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Method to initialize the monkey list with test data
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("George", "Capuchin", "male", "2", "10.5", "03-15-2021", "Brazil", "intake", false, "United States", 22.5, 15.0, 18.0);
        Monkey monkey2 = new Monkey("Coco", "Marmoset", "female", "1", "8.2", "06-10-2022", "Colombia", "Phase I", false, "United States", 20.0, 12.5, 16.0);

        monkeyList.add(monkey1);
        monkeyList.add(monkey2);

    }


    // Method to intake new dog
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        // Check if dog is already on the list
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; 
            }
        }
        
        // Prompt user for dog details and add to list
        System.out.println("Enter breed:");
        String breed = scanner.nextLine();
        System.out.println("Enter gender:");
        String gender = scanner.nextLine();
        System.out.println("Enter age:");
        String age = scanner.nextLine();
        System.out.println("Enter weight:");
        String weight = scanner.nextLine();
        System.out.println("Enter acquisition date:");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Enter acquisition country:");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("Enter training status:");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the dog reserved? (true/false):");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter in-service country:");
        String inServiceCountry = scanner.nextLine();

        // Create a new dog object and add it to the list
        Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(newDog);
        System.out.println("New dog added successfully.");
        
    }


        // Method to intake new monkey
        public static void intakeNewMonkey(Scanner scanner) {
        	System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();
            // Check if monkey is already in the list
            for (Monkey monkey : monkeyList) {
                if (monkey.getName().equalsIgnoreCase(name)) {
                    System.out.println("\n\nThis monkey is already in our system\n\n");
                    return;
                }
            }
            // Prompt user for monkey details and add to the list
            System.out.println("Enter species (Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, Tamarin):");
            String species = scanner.nextLine();
            if (!species.equalsIgnoreCase("Capuchin") && !species.equalsIgnoreCase("Guenon") && !species.equalsIgnoreCase("Macaque") &&
                !species.equalsIgnoreCase("Marmoset") && !species.equalsIgnoreCase("Squirrel monkey") && !species.equalsIgnoreCase("Tamarin")) {
                System.out.println("Invalid species. Please enter a valid species.");
                return;
            }

            System.out.println("Enter gender:");
            String gender = scanner.nextLine();
            System.out.println("Enter age:");
            String age = scanner.nextLine();
            System.out.println("Enter weight:");
            String weight = scanner.nextLine();
            System.out.println("Enter acquisition date:");
            String acquisitionDate = scanner.nextLine();
            System.out.println("Enter acquisition country:");
            String acquisitionCountry = scanner.nextLine();
            System.out.println("Enter training status:");
            String trainingStatus = scanner.nextLine();
            System.out.println("Is the monkey reserved? (true/false):");
            boolean reserved = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Enter in-service country:");
            String inServiceCountry = scanner.nextLine();
            System.out.println("Enter tail length:");
            double tailLength = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter height:");
            double height = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter body length:");
            double bodyLength = Double.parseDouble(scanner.nextLine());

            // Create a new monkey object and add it to the list
            Monkey newMonkey = new Monkey(name, species, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry, tailLength, height, bodyLength);
            monkeyList.add(newMonkey);
            System.out.println("New monkey added successfully.");
        }
        
        // Method to reserve an animal
        public static void reserveAnimal(Scanner scanner) {
        	System.out.println("Enter animal type (dog/monkey):");
            String animalType = scanner.nextLine();
            System.out.println("Enter in-service country:");
            String inServiceCountry = scanner.nextLine();

            // Reserve a dog if available
            if (animalType.equalsIgnoreCase("dog")) {
                for (Dog dog : dogList) {
                    if (dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && !dog.getReserved()) {
                        dog.setReserved(true);
                        System.out.println("Dog reserved successfully.");
                        return;
                    }
                }
            // Reserve a monkey if available
            } else if (animalType.equalsIgnoreCase("monkey")) {
                for (Monkey monkey : monkeyList) {
                    if (monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && !monkey.getReserved()) {
                        monkey.setReserved(true);
                        System.out.println("Monkey reserved successfully.");
                        return;
                    }
                }
            }
            // No available animals of specified type and location
            System.out.println("No available animals of the specified type and location.");
        }


        // Method to print animals based on the type
        public static void printAnimals(String listType) {
            if (listType.equalsIgnoreCase("dog")) {
                for (Dog dog : dogList) {
                    System.out.println("Name: " + dog.getName() + ", Status: " + dog.getTrainingStatus() +
                                       ", Acquisition Country: " + dog.getAcquisitionLocation() + ", Reserved: " + dog.getReserved());
                }
            } else if (listType.equalsIgnoreCase("monkey")) {
                for (Monkey monkey : monkeyList) {
                    System.out.println("Name: " + monkey.getName() + ", Status: " + monkey.getTrainingStatus() +
                                       ", Acquisition Country: " + monkey.getAcquisitionLocation() + ", Reserved: " + monkey.getReserved());
                }
            } else if (listType.equalsIgnoreCase("available")) {
                System.out.println("Available Dogs:");
                for (Dog dog : dogList) {
                    if (dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
                        System.out.println("Name: " + dog.getName() + ", Status: " + dog.getTrainingStatus() +
                                           ", Acquisition Country: " + dog.getAcquisitionLocation() + ", Reserved: " + dog.getReserved());
                    }
                }
                System.out.println("Available Monkeys:");
                for (Monkey monkey : monkeyList) {
                    if (monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
                        System.out.println("Name: " + monkey.getName() + ", Status: " + monkey.getTrainingStatus() +
                                           ", Acquisition Country: " + monkey.getAcquisitionLocation() + ", Reserved: " + monkey.getReserved());
                    }
                }
            } else {
                System.out.println("Invalid list type. Please enter 'dog', 'monkey', or 'available'.");
            }
        }
}

