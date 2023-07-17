
// Business class
public class Business extends Building {
    protected int numRentableUnits;

    public Business() {
        super();
        this.numRentableUnits = 0;
    }

    public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
        this.numRentableUnits = numRentableUnits;
    }

    @Override
    public void draw() {
        System.out.println("Drawing code for " + this.getClass().getSimpleName());
    }

    @Override
    public String displayData() {
        return super.displayData() + "\n" +
               "Number of Rentable Units: " + numRentableUnits;
    }

    // Getters and setters for the instance fields
}
