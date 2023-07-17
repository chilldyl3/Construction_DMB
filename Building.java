
// Building class
public class Building {
    protected String projectName;
    protected String completeAddress;
    protected double totalSquareFeet;
    protected String occupancyGroup;
    protected String subgroup;

    public Building() {
        this.projectName = "";
        this.completeAddress = "";
        this.totalSquareFeet = 0.0;
        this.occupancyGroup = "";
        this.subgroup = "";
    }

    public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
        this.projectName = projectName;
        this.completeAddress = completeAddress;
        this.totalSquareFeet = totalSquareFeet;
        this.occupancyGroup = occupancyGroup;
        this.subgroup = subgroup;
    }

    public void draw() {
        System.out.println("Drawing code for " + this.getClass().getSimpleName());
    }

    public String displayData() {
        return "Project Name: " + projectName + "\n" +
               "Address: " + completeAddress + "\n" +
               "Square Feet: " + totalSquareFeet + "\n" +
               "Occupancy Group: " + occupancyGroup + "\n" +
               "Occupancy Subgroup: " + subgroup;
    }

	public void setProjectName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCompleteAddress(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setTotalSquareFeet(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setOccupancyGroup(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setSubgroup(String string) {
		// TODO Auto-generated method stub
		
	}

    // Getters and setters for the instance fields
}












