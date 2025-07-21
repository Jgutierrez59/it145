import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;
        boolean validInput = false;

        // Prompt user to input wall's height
        do {
            try {
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();
                if (wallHeight <= 0) {
                    throw new IllegalArgumentException("Height must be greater than 0.");
                }
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a positive number.");
                scnr.next();
            }
        } while (!validInput);

        validInput = false;

        // Prompt user to input wall's width
        do {
            try {
                System.out.println("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble();
                if (wallWidth <= 0) {
                    throw new IllegalArgumentException("Width must be greater than 0.");
                }
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a positive number.");
                scnr.next();
            }
        } while (!validInput);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        cansNeeded = Math.ceil(gallonsPaintNeeded / gallonsPerCan);
        System.out.println("Cans needed: " + cansNeeded + " cans");

        // Close the scanner
        scnr.close();
    }
}