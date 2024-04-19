package homeworks.hw1.scooter;

import java.util.ArrayList;
import java.util.List;

public class RentalCompany {

    private int uid = 0;

    List<Scooter> scooters = new ArrayList<>();

    /**
     * This method iterates through the list of all scooters in the rental company
     * and creates a new list containing only the scooters that are currently available
     * @return Lists available scooters
     */
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter: scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    /**
     * This method assigns a unique ID to the scooter and adds it to the list of scooters
     * managed by the rental company.
     * @param scooter class Scooter
     */
    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    /**
     * Removes a scooter from the fleet based on its ID.
     * This method iterates through the list of scooters managed by the rental company
     * and searches for the scooter with the specified ID. If found, the scooter is removed
     * from the list, and the method returns true. Otherwise, it returns false.
     *
     * @param id The unique identifier of the scooter to be removed.
     * @return True if the scooter was successfully removed, false otherwise.
     */
    public boolean removeScooter(int id) {
        boolean removed = false;
        for (Scooter scooter: scooters) {
            if (scooter.getId() == id) {
                scooters.remove(scooter);
                removed = true;
                break;
            }
        }
        return removed;
    }

    /**
     * Rents a scooter by marking it as unavailable.
     *
     * @param id The ID of the scooter to be rented.
     */
    public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                scooter.setAvailable(false);
                System.out.println("Scooter " + id + " has been rented.");
                return;
            }
        }
        System.out.println("Scooter " + id + " is not available for rent.");
    }

    /**
     * Returns a rented scooter by marking it as available and updating its location.
     *
     * @param id The ID of the scooter to be returned.
     * @param x  The x-coordinate of the return location.
     * @param y  The y-coordinate of the return location.
     */
    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && !scooter.isAvailable()) {
                scooter.setAvailable(true);
                scooter.setX(x);
                scooter.setY(y);
                System.out.println("Scooter " + id + " has been returned at (" + x + ", " + y + ").");
                return;
            }
        }
        System.out.println("Scooter " + id + " is not currently rented.");
    }

    /**
     * Displays information about all scooters in the fleet.
     */
    public void displayAllScooters() {
        System.out.println("All Scooters:");
        for (Scooter scooter : scooters) {
            System.out.println(scooter);
        }
    }
}