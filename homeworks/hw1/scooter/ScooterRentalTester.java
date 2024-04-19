package homeworks.hw1.scooter;

/**
 * this class is a tester for the RentalCompany and Scooter classes.
 * it simulates a scenario where a user rents a scooter, rides it from home to university,
 * leaves it at a specific location, rents it again after an hour, goes back home, and leaves it near home.
 */
public class ScooterRentalTester {
    public static void main(String[] args) {
        // create a RentalCompany instance
        RentalCompany company = new RentalCompany();

        // add some scooters to the fleet
        Scooter scooter1 = new Scooter();
        scooter1.setModel("Sparrow X10");
        scooter1.setBatteryLevel(60);
        scooter1.setX(41.98675664275431); // Home coordinates
        scooter1.setY(43.59465033000379);
        scooter1.setAvailable(true);
        company.addScooter(scooter1);

        // rent a scooter and go from home to university
        company.rentScooter(scooter1.getId());
        System.out.println("going from home to university");
        company.returnScooter(scooter1.getId(), 41.7121106, 44.7489232); // Leave scooter at university

        // wait for 1 hour
        try {
            Thread.sleep(3600000); // 1 hour in milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // rent the same scooter again and go back home
        company.rentScooter(scooter1.getId());
        System.out.println("going back home");
        company.returnScooter(scooter1.getId(), 41.98675664275431, 43.59465033000379); // Leave scooter near home

        // display all scooters
        company.displayAllScooters();
    }
}