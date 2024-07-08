public class Business extends Building {
	    private int numRentableUnits;

	    
	    public Business() {
	        super();
	        int numRentableUnits = 0;
	    }// end empty constructor

	    
	    public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup, int numRentableUnits) {
	        super();
	        numRentableUnits = numRentableUnits;
	    }// end preferred constructor

	    public int getNumRentableUnits() {
	        return numRentableUnits;
	    }

	    public void setNumRentableUnits(int numRentableUnits) {
	        this.numRentableUnits = numRentableUnits;
	    }

	    
	    @Override
	    public void draw() {
	        System.out.println("Drawing code for Business");
	    }

	    @Override
	    public String displayData() {
	        return super.displayData() + String.format("\nNumber of Rentable Units: %d", numRentableUnits);
	    }

	    @Override
	    public String toString() {
	        return "Business{" +
	                "numRentableUnits=" + numRentableUnits +
	                "} " + super.toString();
	    }
	}



