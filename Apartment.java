
public class Apartment extends Residential{
	
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		super();
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
	}
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup,
            int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
}
	
	public int getNumRentableunits() {
		return numRentableUnits;
	}
	public void setNumRentableunits(int numRentableunits) {
		this.numRentableUnits = numRentableunits;
	}
	public double getAvgUnitSize() {
		return avgUnitSize;
	}
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	
	@Override
    public void draw() {
        System.out.println("Drawing code for Apartment");
    }
	
	 public String displayData() {
	        return super.displayData() + String.format("\nNumber of Rentable Units: %d\nAverage Unit Size: %.2f\nParking Available: %s",
	                numRentableUnits, avgUnitSize, parkingAvailable ? "Yes" : "No");
	    }
	 
	 public String toString() {
	        return "Apartment{" +
	                "numRentableUnits=" + numRentableUnits +
	                ", avgUnitSize=" + avgUnitSize +
	                ", parkingAvailable=" + parkingAvailable +
	                "} " + super.toString();
	    }

}
