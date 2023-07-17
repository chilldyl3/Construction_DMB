
// Apartment class
public class Apartment extends Residential {
    protected int numRentableUnits;
    protected double avgUnitSize;
    protected boolean parkingAvailable;

    public Apartment() {
        super();
        this.numRentableUnits = 0;
        this.avgUnitSize = 0.0;
        this.parkingAvailable = false;
    }

    public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
        this.numRentableUnits = numRentableUnits;
        this.avgUnitSize = avgUnitSize;
        this.parkingAvailable = parkingAvailable;
    }

    @Override
    public void draw() {
        System.out.println("Drawing code for " + this.getClass().getSimpleName());
    }

    @Override
    public String displayData() {
        return super.displayData() + "\n" +
               "Number of Rentable Units: " + numRentableUnits + "\n" +
               "Average Unit Size: " + avgUnitSize + "\n" +
               "Parking Available: " + (parkingAvailable ? "Yes" : "No");
    }

    // Getters and setters for the instance fields
}