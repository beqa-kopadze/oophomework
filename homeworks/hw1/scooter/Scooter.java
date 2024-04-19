package homeworks.hw1.scooter; // This is the package declaration

public class Scooter { // This is the class declaration

    // Unique identifier for the scooter.
    int id;

    // Model name of the scooter (e.g., Sparrow X10).
    String model;

    // Current battery level (percentage).
    int batteryLevel;

    // Scooter location;
    double x, y;

    // Indicates if the scooter is available
    boolean available;

    // Getter method for the scooter's ID
    public int getId() {
        return id;
    }

    // Setter method for the scooter's ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter method for the scooter's model
    public String getModel() {
        return model;
    }

    // Setter method for the scooter's model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter method for the scooter's battery level
    public int getBatteryLevel() {
        return batteryLevel;
    }

    // Setter method for the scooter's battery level
    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    // Getter method for the scooter's x-coordinate
    public double getX() {
        return x;
    }

    // Setter method for the scooter's x-coordinate
    public void setX(double x) {
        this.x = x;
    }

    // Getter method for the scooter's y-coordinate
    public double getY() {
        return y;
    }

    // Setter method for the scooter's y-coordinate
    public void setY(double y) {
        this.y = y;
    }

    // Getter method for the scooter's availability
    public boolean isAvailable() {
        return available;
    }

    // Setter method for the scooter's availability
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Override the toString() method to provide a string representation of the Scooter object
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Scooter{");
        sb.append("id=").append(id);
        sb.append(", model='").append(model).append('\'');
        sb.append(", batteryLevel=").append(batteryLevel);
        sb.append(", x=").append(x);
        sb.append(", y=").append(y);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }
}
