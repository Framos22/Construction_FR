public class Application {
    public static void main(String[] args) {
        
        Building building = new Building("Gaines House", "123 Main Street, Louisville, Kentucky 40201", 2450.0, "Residential", "R-1");
        System.out.println(building.displayData());
        building.draw();

        Business business = new Business("Tech Office", "456 Tech Street, Silicon Valley, California 94025", 10000.0, "Business", "B", 15);
        System.out.println(business.displayData());
        business.draw();

        Mall mall = new Mall("City Mall", "789 Mall Road, Metropolis, Illinois 62960", 50000.0, "Business", "B", 200, 150, 1000.0, 2000);
        System.out.println(mall.displayData());
        mall.draw();

        Residential residential = new Residential("Sunset Villas", "101 Sunset Blvd, Beverly Hills, California 90210", 3000.0, "Residential", "R-2", 10, 8, true);
        System.out.println(residential.displayData());
        residential.draw();

        Apartment apartment = new Apartment("Highrise Apartments", "202 Tower Lane, New York, New York 10001", 20000.0, "Residential", "R-2", 50, 20, true, 50, 1000.0, true);
        System.out.println(apartment.displayData());
        apartment.draw();

        SingleFamilyHome singleFamilyHome = new SingleFamilyHome("Family Home", "303 Suburbia Ave, Pleasantville, Texas 75001", 2500.0, "Residential", "R-1", 4, 3, true, true);
        System.out.println(singleFamilyHome.displayData());
        singleFamilyHome.draw();
    }
}

