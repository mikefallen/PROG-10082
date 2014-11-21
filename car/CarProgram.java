/**
 * A program that will use the Car class to test the
 * methods defined in CarUtilities.java.
 *
 * Justin Alerta
 * October 2014
 */

import java.util.Scanner;

public class CarProgram {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the length of the list of Cars
        System.out.println("How many cars are in the lot? ");
        int numCars = input.nextInt();

        // Declare and initialize an array of Car objects
        Car[] parkingLot = new Car[numCars];

        // Set the Car object at each index of the array
        for(int i = 0; i < parkingLot.length; i++) {
            input = new Scanner(System.in);
            System.out.print("Enter make of car " + i + ": ");
            String make = input.nextLine();
            System.out.print("Enter model of car " + i + ": ");
            String model = input.nextLine();
            System.out.print("Enter colour of car " + i + ": ");
            String colour = input.nextLine();
            System.out.print("Is car " + i + " used? (true/false)");
            boolean used = input.nextBoolean();
            System.out.print("Enter price of car " + i + ": ");
            double price = input.nextDouble();

            // Initialize a new Car object and store it at 
            // index i of the array (parkingLot)
            parkingLot[i] = new Car(make, model, colour, used, price);
        }

        // Print the details of each car using a for-loop and the 
        // static printCarDetails() method defined in CarUtilities
        for(int i = 0; i < parkingLot.length; i++) {
            System.out.println("Car #" + (i + 1) + ":");
            CarUtilities.printCarDetails(parkingLot[i]);
        }

        // Display the average car price
        System.out.printf("The average car price is $%.2f\n",
                CarUtilities.getAverageCarPrice(parkingLot));

        // Set and display the price of each car with a 15% discount
        CarUtilities.setSalePrice(parkingLot, 15);
        for (int i = 0; i < parkingLot.length; i++) {
            System.out.printf("New price of %s %s: $%.2f\n",
                    parkingLot[i].getMake(),
                    parkingLot[i].getModel(),
                    parkingLot[i].getPrice());
        }
    }

}