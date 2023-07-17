
// Mall class
public class Mall extends Business {
    protected int numRentedUnits;
    protected double medianUnitSize;
    protected int numParkingSpaces;

    public Mall() {
        super();
        this.numRentedUnits = 0;
        this.medianUnitSize = 0.0;
        this.numParkingSpaces = 0;
    }

    public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
        this.numRentedUnits = numRentedUnits;
        this.medianUnitSize = medianUnitSize;
        this.numParkingSpaces = numParkingSpaces;
    }

    @Override
    public void draw() {
        System.out.println("Drawing code for " + this.getClass().getSimpleName());
    }

    @Override
    public String displayData() {
        return super.displayData() + "\n" +
               "Number of Rented Units: " + numRentedUnits + "\n" +
               "Median Unit Size: " + medianUnitSize + "\n" +
               "Number of Parking Spaces: " + numParkingSpaces;
    }

    // Getters and setters for the instance fields
}
