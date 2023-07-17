
// Residential class
public class Residential extends Building {
    protected int numBedrooms;
    protected int numBathrooms;
    protected boolean laundryRoom;

    public Residential() {
        super();
        this.numBedrooms = 0;
        this.numBathrooms = 0;
        this.laundryRoom = false;
    }

    public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.laundryRoom = laundryRoom;
    }

    @Override
    public void draw() {
        System.out.println("Drawing code for " + this.getClass().getSimpleName());
    }

    @Override
    public String displayData() {
        return super.displayData() + "\n" +
               "Number of Bedrooms: " + numBedrooms + "\n" +
               "Number of Bathrooms: " + numBathrooms + "\n" +
               "Laundry Room: " + (laundryRoom ? "Yes" : "No");
    }

    // Getters and setters for the instance fields
}
