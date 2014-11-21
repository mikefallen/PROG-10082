/**
 * A class that will contain a number of static
 * methods that make use of the Car class.
 *
 * First Exercise:
 * Define a static method called printCarDetails() which has a Car
 * object as a parameter and displays its details to the
 * console in the format below (TEXT IN ALL CAPS REPRESENT
 * FIELDS OF THE CAR OBJECT).  Use a decision structure and the
 * appropriate field of the Car object to display whether the
 * car is New or Used.  Once you have implemented the method,
 * test it by calling it the CarProgram test class.
 *
 * Output of printCarDetails():
 *
 * Car Info:
 * New/Used COLOUR MAKE MODEL
 * Price: $PRICE
 *
 * Justin Alerta
 * October 2014
 */
public class CarUtilities {

    /* Define your printCarDetails() method below... */
    public static void printCarDetails(Car c) {
        System.out.println("Car Info:");
        if (c.isUsed()) {
            System.out.print("Used ");
        } else {
            System.out.print("New ");
        }
        System.out.println(c.getColour() + " " + c.getMake() + " " + c.getModel());
        System.out.println("Price: $" + c.getPrice());
    }

    public static double getAverageCarPrice(Car[] cars) {
        double totalOfAllCars = 0;
        // Iterate each Car in the array and add to the total
        for(int i = 0; i < cars.length; i++) {
            Car currentCar = cars[i];
            totalOfAllCars += currentCar.getPrice();
        }

        // Return the average price
        double averagePrice = totalOfAllCars / cars.length;
        return averagePrice;
    }

    public static void setSalePrice(Car[] cars, double discount) {
        // Iterate each Car and set the sale price
        for (int i = 0; i < cars.length; i++) {
            double currentPrice = cars[i].getPrice();
            double discountAmount = currentPrice * (discount / 100);
            // Set the sale price
            cars[i].setPrice(currentPrice - discountAmount);
        }
    }
}
