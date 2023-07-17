


// SingleFamilyHome class
public class SingleFamilyHome extends Residential {
    protected boolean garage;

    public SingleFamilyHome() {
        super();
        this.garage = false;
    }

    public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
        super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
        this.garage = garage;
    }

    @Override
    public void draw() {
        System.out.println("Drawing code for " + this.getClass().getSimpleName());
    }

    @Override
    public String displayData() {
        return super.displayData() + "\n" +
               "Garage: " + (garage ? "Yes" : "No");
    }

    // Getters and setters for the instance fields
}

