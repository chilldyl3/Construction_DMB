public class Application {
    public static void main(String[] args) {
        // Test Building class
        Building building = new Building();
        building.setProjectName("Gaines House");
        building.setCompleteAddress("123 Main Street, Louisville, Kentucky 40201");
        building.setTotalSquareFeet(2540);
        building.setOccupancyGroup("Residential");
        building.setSubgroup("R1");

        System.out.println(building.displayData());
        building.draw();
        System.out.println();

        // Test Business class
        Business business = new Business("Office Building", "456 Elm Street, Louisville, Kentucky 40202", 5000, "Business", "B", 10);
        System.out.println(business.displayData());
        business.draw();
        System.out.println();

        // Test Mall class
        Mall mall = new Mall("City Mall", "789 Oak Street, Louisville, Kentucky 40203", 10000, "Business", "M", 50, 30, 2000, 200);
        System.out.println(mall.displayData());
        mall.draw();
        System.out.println();

        // Test Residential class
        Residential residential = new Residential("Residential Building", "111 Pine Street, Louisville, Kentucky 40204", 3000, "Residential", "R3", 3, 2, true);
        System.out.println(residential.displayData());
        residential.draw();
        System.out.println();

        // Test Apartment class
        Apartment apartment = new Apartment("Apartment Building", "222 Maple Street, Louisville, Kentucky 40205", 5000, "Residential", "R2", 2, 2, true, 20, 1000, true);
        System.out.println(apartment.displayData());
        apartment.draw();
        System.out.println();

        // Test SingleFamilyHome class
        SingleFamilyHome singleFamilyHome = new SingleFamilyHome("Family Home", "333 Oak Avenue, Louisville, Kentucky 40206", 2500, "Residential", "R1", 4, 3, true, true);
        System.out.println(singleFamilyHome.displayData());
        singleFamilyHome.draw();
        System.out.println();
    }
}
