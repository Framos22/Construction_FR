
public class Mall extends Business {
    private int numRentedUnits;
    private double medianUnitSize;
    private int numParkingSpaces;

    public Mall() {
        super();
        numRentedUnits = numRentedUnits;
        this.medianUnitSize = 0;
        this.numParkingSpaces = 0;
    }

    public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
        super();
        this.numRentedUnits = numRentedUnits;
        this.medianUnitSize = medianUnitSize;
        this.numParkingSpaces = numParkingSpaces;
    }

    public int getNumRentedUnits() {
        return numRentedUnits;
    }

    public void setNumRentedUnits(int numRentedUnits) {
        this.numRentedUnits = numRentedUnits;
    }

    public double getMedianUnitSize() {
        return medianUnitSize;
    }

    public void setMedianUnitSize(double medianUnitSize) {
        this.medianUnitSize = medianUnitSize;
    }

    public int getNumParkingSpaces() {
        return numParkingSpaces;
    }

    public void setNumParkingSpaces(int numParkingSpaces) {
        this.numParkingSpaces = numParkingSpaces;
    }

    @Override
    public void draw() {
        System.out.println("Drawing code for Mall");
    }

    @Override
    public String displayData() {
        return super.displayData() + String.format("\nNumber of Rented Units: %d\nMedian Unit Size: %.2f\nNumber of Parking Spaces: %d",
                numRentedUnits, medianUnitSize, numParkingSpaces);
    }

    @Override
    public String toString() {
        return "Mall{" +
                "numRentedUnits=" + numRentedUnits +
                ", medianUnitSize=" + medianUnitSize +
                ", numParkingSpaces=" + numParkingSpaces +
                "} " + super.toString();
    }
}
