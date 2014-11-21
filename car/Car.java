/**
 * A Java class that represents a Car object.
 *
 * Justin Alerta
 * October 2014
 */
public class Car {

    // Encapsulated data fields
    private String make;
    private String model;
    private String colour;
    private boolean used;
    private double price;

    public Car(String make, String model, String colour,
               boolean used, double price) {
        // Use the "this" reference to access the class variable
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.used = used;
        this.price = price;
    }

    public Car() {
        // Use the "this" reference to call another constructor 
        // of the same class
        // Default value for objects (including String) is null
        this(null, null, null, false, 0.0);
    }

    // Getter and setter methods for all data fields
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
