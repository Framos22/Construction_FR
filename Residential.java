
public class Residential extends Building{
	private int numBedrooms;
	private int numBathrooms;
	private boolean laundryRoom;
	
	public Residential() {
		super();
		this.numBedrooms =0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup,
         int numBedrooms, int numBathrooms, boolean laundryRoom) {
	     super();
	     this.numBedrooms = numBedrooms;
		 this.numBathrooms = numBathrooms;
		 this.laundryRoom = laundryRoom;
}
	
	public int getNumBedrooms() {
		return numBedrooms;
	}
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}
	public int getNumbathrooms() {
		return numBathrooms;
	}
	public void setNumbathrooms(int numbathrooms) {
		this.numBathrooms = numbathrooms;
	}
	public boolean isLaundryRoom() {
		return laundryRoom;
	}
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	@Override
    public void draw() {
        System.out.println("Drawing code for Residential");
    }
	
	@Override
    public String displayData() {
        return super.displayData() + String.format("\nNumber of Bedrooms: %d\nNumber of Bathrooms: %d\nLaundry Room: %s",
                numBedrooms, numBathrooms, laundryRoom ? "Yes" : "No");
    }
	
	@Override
    public String toString() {
        return "Residential{" +
                "numBedrooms=" + numBedrooms +
                ", numBathrooms=" + numBathrooms +
                ", laundryRoom=" + laundryRoom +
                "} " + super.toString();
    }

	
}//end main 
